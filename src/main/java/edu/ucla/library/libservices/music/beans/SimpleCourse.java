package edu.ucla.library.libservices.music.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )
public class SimpleCourse
{
  @XmlElement( name = "term" )
  private String term;
  @XmlElement( name = "srs" )
  private String srs;
  @XmlElement( name = "works" )
  private List<SimpleWork> works;

  public SimpleCourse()
  {
    super();
  }

  public void setTerm( String term )
  {
    this.term = term;
  }

  public String getTerm()
  {
    return term;
  }

  public void setSrs( String srs )
  {
    this.srs = srs;
  }

  public String getSrs()
  {
    return srs;
  }

  public void setWorks( List<SimpleWork> works )
  {
    this.works = works;
  }

  public List<SimpleWork> getWorks()
  {
    return works;
  }
}
