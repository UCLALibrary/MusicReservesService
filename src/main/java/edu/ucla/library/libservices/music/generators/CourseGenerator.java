package edu.ucla.library.libservices.music.generators;

import edu.ucla.library.libservices.music.beans.Course;
import edu.ucla.library.libservices.music.beans.SimpleCourse;
import edu.ucla.library.libservices.music.beans.SimpleWork;
import edu.ucla.library.libservices.music.beans.Work;
import edu.ucla.library.libservices.music.db.mappers.CourseMapper;
import edu.ucla.library.libservices.music.db.mappers.SimpleCourseMapper;
import edu.ucla.library.libservices.music.db.source.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CourseGenerator
{
  private static final String QUERY =
    "SELECT SRS, dbo.get_term() AS the_term FROM dbo.Classes c INNER JOIN CurrentQuarter cq ON c.Quarter = cq.Quarter and c.Year = cq.Year";
  private DataSource   ds;
  private List<Course> courses;
  private List<SimpleCourse> simpleCourses;

  private void makeConnection()
  {
    ds = DataSourceFactory.getMusicConnection();
  }

  public void setCourses( List<Course> courses )
  {
    this.courses = courses;
  }

  public List<Course> getCourses()
  {
    makeConnection();
    courses = new JdbcTemplate(ds).query( QUERY, new CourseMapper() );
    for ( Course theCourse : courses )
      theCourse.setWorks( getWorks( theCourse.getSrs() ) );
    return courses;
  }

  public CourseGenerator()
  {
    super();
  }

  private List<Work> getWorks( String theSRS )
  {
    WorkGenerator generator;
    generator = new WorkGenerator();
    generator.setSrs( theSRS );
    return generator.getWorks();
  }

  private List<SimpleWork> getSimpleWorks( String theSRS )
  {
    WorkGenerator generator;
    generator = new WorkGenerator();
    generator.setSrs( theSRS );
    return generator.getSimpleWorks();
  }

  List<SimpleCourse> getSimpleCourses()
  {
    makeConnection();
    simpleCourses = new JdbcTemplate(ds).query( QUERY, new SimpleCourseMapper() );
    for ( SimpleCourse theCourse : simpleCourses )
      theCourse.setWorks( getSimpleWorks( theCourse.getSrs() ) );
    return simpleCourses;
  }
}
