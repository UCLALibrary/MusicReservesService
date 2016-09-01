package edu.ucla.library.libservices.music.db.mappers;

import edu.ucla.library.libservices.music.beans.Course;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseMapper
  implements RowMapper
{
  public CourseMapper()
  {
    super();
  }

  @Override
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    Course bean;
    bean = new Course();
    bean.setSrs( rs.getString( "SRS" ) );
    bean.setTerm( rs.getString( "the_term" ) );
    return bean;
  }
}
