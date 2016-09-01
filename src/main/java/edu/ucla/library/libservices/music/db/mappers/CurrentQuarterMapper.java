package edu.ucla.library.libservices.music.db.mappers;

import edu.ucla.library.libservices.music.beans.CurrentQuarter;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CurrentQuarterMapper
  implements RowMapper
{
  public CurrentQuarterMapper()
  {
    super();
  }

  @Override
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    CurrentQuarter bean;
    
    bean = new CurrentQuarter();
    bean.setQuarter( rs.getString( "Quarter" ) );
    bean.setYear( rs.getString( "Year" ) );
    
    return bean;
  }
}
