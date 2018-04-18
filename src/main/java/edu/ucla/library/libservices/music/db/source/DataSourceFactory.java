package edu.ucla.library.libservices.music.db.source;

import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceFactory
{
  public DataSourceFactory()
  {
    super();
  }
  
  public static DataSource getMusicConnection()
  {
    DriverManagerDataSource ds;
    
    ds = new DriverManagerDataSource();
    ds.setDriverClassName( "net.sourceforge.jtds.jdbc.Driver" );
    ds.setUrl( "jdbc:jtds:sqlserver://db-audio.library.ucla.edu:1433/Audio" );
    //ds.setUrl( "jdbc:jtds:sqlserver://db-audio.library.ucla.edu:1433/Audio_Test" );
    ds.setUsername( "Audio_dbo" );
    ds.setPassword( "Audio_dbo_pwd" );
    
    return ds;
  }
}
