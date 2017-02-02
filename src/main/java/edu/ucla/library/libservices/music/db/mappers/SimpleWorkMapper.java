package edu.ucla.library.libservices.music.db.mappers;

import edu.ucla.library.libservices.music.beans.SimpleWork;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SimpleWorkMapper
  implements RowMapper
{
  public SimpleWorkMapper()
  {
    super();
  }

  @Override
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    SimpleWork bean;
    bean = new SimpleWork();
    bean.setDisplay( rs.getString( "Display" ) );
    bean.setHttpURL( rs.getString( "http_url" ) );
    bean.setIsVideo( rs.getBoolean( "video" ) );
    bean.setRtmpURL( rs.getString( "rtmp_url" ) );
    
    return bean;
  }
}
