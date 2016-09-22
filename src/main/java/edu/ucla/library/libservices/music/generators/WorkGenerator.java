package edu.ucla.library.libservices.music.generators;

import edu.ucla.library.libservices.music.beans.Work;
import edu.ucla.library.libservices.music.db.mappers.WorkMapper;
import edu.ucla.library.libservices.music.db.source.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class WorkGenerator
{
  private static final String QUERY = "SELECT * FROM dbo.get_works(?) ORDER BY Display";
    //"SELECT Video, dbo.get_display(Composer,w.Title,Caption) AS Display, dbo.get_http_url(Video,Baseaddress,Volume," +
    //"Disc, Side,Track) as http_url, dbo.get_rtmp_url(Video,Baseaddress,Volume,Disc,Side,Track) as rtmp_url FROM " +
    //"dbo.Works w INNER JOIN dbo.Link l ON w.workid = l.workid INNER JOIN dbo.Classes c ON l.ClassID = c.ClassID " +
    //"LEFT JOIN dbo.Items i ON l.items = i.ItemID WHERE SRS = ? ORDER BY Display";

  private DataSource ds;
  private String     srs;
  private List<Work> works;

  public void setSrs( String srs )
  {
    this.srs = srs;
  }

  private String getSrs()
  {
    return srs;
  }

  public void setWorks( List<Work> works )
  {
    this.works = works;
  }

  public List<Work> getWorks()
  {
    makeConnection();

    works = new JdbcTemplate( ds ).query( QUERY, new Object[] { getSrs() }, new WorkMapper() );
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
}
