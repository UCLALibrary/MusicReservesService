package edu.ucla.library.libservices.music.db.mappers;

import edu.ucla.library.libservices.music.beans.SimpleCourse;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SimpleCourseMapper
  implements RowMapper
{
  public SimpleCourseMapper()
  {
    super();
  }

  @Override
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    SimpleCourse bean;
    bean = new SimpleCourse();
    bean.setSrs( rs.getString( "SRS" ) );
    bean.setTerm( rs.getString( "the_term" ) );
    return bean;
  }
}
