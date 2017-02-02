package edu.ucla.library.libservices.music.generators;

import edu.ucla.library.libservices.music.beans.Item;
import edu.ucla.library.libservices.music.beans.SimpleWork;
import edu.ucla.library.libservices.music.beans.Work;
import edu.ucla.library.libservices.music.db.mappers.SimpleWorkMapper;
import edu.ucla.library.libservices.music.db.mappers.WorkMapper;
import edu.ucla.library.libservices.music.db.source.DataSourceFactory;

import java.util.List;

import javassist.runtime.Inner;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class WorkGenerator
{
  private static final String QUERY =
    "SELECT  l.WorkID, w.Composer, w.Title, w.Performers, w.Note1, w.Note2, w.Label, w.Labelnumber, " +
    "w.Librarycallnumber, w.Video FROM dbo.Works w Inner JOIN dbo.Link l ON w.workid = l.workid INNER JOIN " +
    "dbo.Classes c ON l.ClassID = c.ClassID WHERE SRS = ? ORDER BY w.Composer, w.Title";

  private static final String SIMPLE_QUERY = "SELECT * FROM dbo.get_works(?)";

  private DataSource ds;
  private String     srs;
  private List<Work> works;
  private List<SimpleWork> simpleWorks;

  public void setSrs( String srs )
  {
    this.srs = srs;
  }

  private String getSrs()
  {
    return srs;
  }

  public List<Work> getWorks()
  {
    makeConnection();

    works = new JdbcTemplate( ds ).query( QUERY, new Object[] { getSrs() }, new WorkMapper() );
    for ( Work theWork : works )
      theWork.setItems( getItems( getSrs(), theWork.getWorkID() ) );
    return works;
  }

  private void makeConnection()
  {
    ds = DataSourceFactory.getMusicConnection();
  }

  public WorkGenerator()
  {
    super();
  }

  private List<Item> getItems( String theSRS, int work )
  {
    ItemGenerator generator;
    generator = new ItemGenerator();
    generator.setSrs( theSRS );
    generator.setWorkID( work );
    return generator.getItems();
  }

  List<SimpleWork> getSimpleWorks()
  {
    makeConnection();

    simpleWorks = new JdbcTemplate( ds ).query( SIMPLE_QUERY, new Object[] { getSrs() }, new SimpleWorkMapper() );
    return simpleWorks;
 }
}
