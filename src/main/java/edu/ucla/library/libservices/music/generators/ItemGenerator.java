package edu.ucla.library.libservices.music.generators;

import edu.ucla.library.libservices.music.beans.Item;

import edu.ucla.library.libservices.music.db.mappers.ItemMapper;
import edu.ucla.library.libservices.music.db.source.DataSourceFactory;

import java.util.List;

import javax.management.Query;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ItemGenerator
{
  private static final String QUERY = "SELECT * FROM dbo.get_items(?,?)";
  private DataSource ds;
  private String     srs;
  private int        workID;
  private List<Item> items;

  public List<Item> getItems()
  {
    makeConnection();
    items = new JdbcTemplate( ds ).query( QUERY, new Object[] { getSrs(), getWorkID() }, new ItemMapper() );
   return items;
  }

  public void setSrs( String srs )
  {
    this.srs = srs;
  }

  private String getSrs()
  {
    return srs;
  }

  public void setWorkID( int workID )
  {
    this.workID = workID;
  }

  private int getWorkID()
  {
    return workID;
  }

  private void makeConnection()
  {
    ds = DataSourceFactory.getMusicConnection();
  }

  public ItemGenerator()
  {
    super();
  }
}
