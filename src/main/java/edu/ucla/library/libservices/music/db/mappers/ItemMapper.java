package edu.ucla.library.libservices.music.db.mappers;

import edu.ucla.library.libservices.music.beans.Item;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ItemMapper
  implements RowMapper
{
  public ItemMapper()
  {
    super();
  }

  @Override
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    Item bean;
    
    bean = new Item();
    bean.setDisc( rs.getString( "Disc" ) );
    bean.setHttpURL( rs.getString( "http_url" ) );
    bean.setRtmpURL( rs.getString( "rtmp_url" ) );
    bean.setSide( rs.getString( "Side" ) );
    bean.setTrackNumber( rs.getString( "Track" ) );
    bean.setTrackTitle( rs.getString( "Caption" ) );
    bean.setVolume( rs.getString( "Volume" ) );
    
    return bean;
  }
}