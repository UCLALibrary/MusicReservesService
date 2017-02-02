package edu.ucla.library.libservices.music.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement( name = "classes" )
public class SimpleClasses
{
  @XmlElement( name = "courses" )
  private List<SimpleCourse> courses;

  public SimpleClasses()
  {
    super();
  }

  public void setCourses( List<SimpleCourse> courses )
  {
    this.courses = courses;
  }

  public List<SimpleCourse> getCourses()
  {
    return courses;
  }
}
