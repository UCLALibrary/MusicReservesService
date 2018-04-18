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
    bean.setCallNumber( rs.getString( "Librarycallnumber" ) );
    bean.setComposer( rs.getString( "Composer" ) );
    bean.setEmbedURL( rs.getString( "EmbedURL" ) );
    bean.setIsVideo( rs.getBoolean( "Video" ) );
    bean.setLabel( rs.getString( "Label" ) );
    bean.setLabelCatalogNumber( rs.getString( "Labelnumber" ) );
    bean.setNoteOne( rs.getString( "Note1" ) );
    bean.setNoteTwo( rs.getString( "Note2" ) );
    bean.setPerformers( rs.getString( "Performers" ) );
    bean.setTitle( rs.getString( "Title" ) );
    bean.setWorkID( rs.getInt( "WorkID" ) );
    
    return bean;
  }
}
