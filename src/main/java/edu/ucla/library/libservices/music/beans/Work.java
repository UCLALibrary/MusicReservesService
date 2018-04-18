package edu.ucla.library.libservices.music.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )
public class Work
{
  @XmlElement( name = "isVideo" )
  private boolean isVideo;
  @XmlElement( name = "composer" )
  private String composer;
  @XmlElement( name = "title" )
  private String title;
  @XmlElement( name = "performers" )
  private String performers;
  @XmlElement( name = "noteOne" )
  private String noteOne;
  @XmlElement( name = "noteTwo" )
  private String noteTwo;
  @XmlElement( name = "label" )
  private String label;
  @XmlElement( name = "labelCatalogNumber" )
  private String labelCatalogNumber;
  @XmlElement( name = "callNumber" )
  private String callNumber;
  @XmlElement( name = "embedURL" )
  private String embedURL;
  @XmlElement( name = "items" )
  private List<Item> items;
  private int workID;

  public void setWorkID( int workID )
  {
    this.workID = workID;
  }

  public int getWorkID()
  {
    return workID;
  }
  
  public Work()
  {
    super();
  }

  public void setIsVideo( boolean isVideo )
  {
    this.isVideo = isVideo;
  }

  public boolean isIsVideo()
  {
    return isVideo;
  }

  public void setComposer( String composer )
  {
    this.composer = composer;
  }

  public String getComposer()
  {
    return composer;
  }

  public void setTitle( String title )
  {
    this.title = title;
  }

  public String getTitle()
  {
    return title;
  }

  public void setPerformers( String performers )
  {
    this.performers = performers;
  }

  public String getPerformers()
  {
    return performers;
  }

  public void setNoteOne( String noteOne )
  {
    this.noteOne = noteOne;
  }

  public String getNoteOne()
  {
    return noteOne;
  }

  public void setNoteTwo( String noteTwo )
  {
    this.noteTwo = noteTwo;
  }

  public String getNoteTwo()
  {
    return noteTwo;
  }

  public void setLabel( String label )
  {
    this.label = label;
  }

  public String getLabel()
  {
    return label;
  }

  public void setLabelCatalogNumber( String labelCatalogNumber )
  {
    this.labelCatalogNumber = labelCatalogNumber;
  }

  public String getLabelCatalogNumber()
  {
    return labelCatalogNumber;
  }

  public void setCallNumber( String callNumber )
  {
    this.callNumber = callNumber;
  }

  public String getCallNumber()
  {
    return callNumber;
  }

  public void setItems( List<Item> items )
  {
    this.items = items;
  }

  public List<Item> getItems()
  {
    return items;
  }

  public void setEmbedURL( String embedURL )
  {
    this.embedURL = embedURL;
  }

  public String getEmbedURL()
  {
    return embedURL;
  }
}
