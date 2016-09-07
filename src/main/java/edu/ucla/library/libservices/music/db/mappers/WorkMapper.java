package edu.ucla.library.libservices.music.db.mappers;

import edu.ucla.library.libservices.music.beans.Work;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class WorkMapper
  implements RowMapper
{
  public WorkMapper()
  {
    super();
  }

  @Override
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    Work bean;
    bean = new Work();
    bean.setDisplay( rs.getString( "Display" ) );
    bean.setHttpURL( rs.getString( "http_url" ) );
    bean.setIsVideo( rs.getBoolean( "video" ) );
    bean.setRtmpURL( rs.getString( "rtmp_url" ) );
    
    return bean;
  }
}
