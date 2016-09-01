package edu.ucla.library.libservices.music.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement( name = "classes" )
public class Classes
{
  @XmlElement( name = "courses" )
  private List<Course> courses;

  public void setCourses( List<Course> courses )
  {
    this.courses = courses;
  }

  public List<Course> getCourses()
  {
    return courses;
  }

  public Classes()
  {
    super();
  }
}
