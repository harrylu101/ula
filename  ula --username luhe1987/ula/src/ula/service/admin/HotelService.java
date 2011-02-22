package ula.service.admin;

import java.util.List;
import java.util.Map;

import ula.common.PagingList;
import ula.service.BaseService;
import ula.util.MapUtil;

public class HotelService extends BaseService {
	private static final String GET_ALL_HOTEL_PARAMS = "select * from hotel_param order by TYPE,ID";

	public PagingList getAllHotelParams() {
		return getPagingList(GET_ALL_HOTEL_PARAMS);
	}

	private static final String ADD_HOTEL_PARAM = "insert into hotel_param(TYPE,NAME,VALUE) values(?,?,?)";

	public void addHotelParam(Map parameters) {
		Object[] params = MapUtil.getObjectArrayFromMap(parameters,
				"type,paramName,paramValue");
		DB.update(ADD_HOTEL_PARAM, params);
	}

	private static final String GET_HOTEL_PARAM_BY_ID = "select * from hotel_param where ID=?";

	public Map getHotelParamById(Map parameters) {
		Object[] params = MapUtil.getObjectArrayFromMap(parameters, "id");
		return DB.queryForMap(GET_HOTEL_PARAM_BY_ID, params);
	}

	private static final String UPDATE_HOTEL_PARAM_BY_ID = "update hotel_param set TYPE=?, NAME=?, VALUE=? where ID=?";

	public void updateHotelParam(Map parameters) {
		Object[] params = MapUtil.getObjectArrayFromMap(parameters,
				"type,paramName,paramValue,id");
		DB.update(UPDATE_HOTEL_PARAM_BY_ID, params);
	}

	private static final String DELETE_HOTEL_PARAM_BY_ID = "delete from hotel_param where ID=?";

	public void deleteHotelParam(Map parameters) {
		Object[] params = MapUtil.getObjectArrayFromMap(parameters, "id");
		DB.update(DELETE_HOTEL_PARAM_BY_ID, params);
	}

	private static final String GET_ALL_HOTEL_ALBUMS = "select * from album";

	public PagingList getAllHotelAlbums() {
		return getPagingList(GET_ALL_HOTEL_ALBUMS);
	}

	private static final String ADD_HOTEL_ALBUM = "insert into album(NAME,CONTENT,POSTTIME,USERNAME) values(?,?,now(),?)";

	public void addHotelAlbum(Map parameters, String userName) {
		Object[] params = MapUtil.getObjectArrayFromMap(parameters,
				"name,content");
		DB.update(ADD_HOTEL_ALBUM, new Object[] { params[0], params[1],
				userName });
	}

	private static final String GET_HOTEL_ALBUM_BY_ID = "select * from album where ID=?";

	public Map getHotelAlbumById(String albumId) {
		return DB.queryForMap(GET_HOTEL_ALBUM_BY_ID, new Object[] { albumId });
	}

	private static final String GET_PICS_IN_ALBUM_BY_ALBUM_ID = "select p.* from album_pic ap join album a on ap.ALBUMID=a.ID join pic p on ap.PICID=p.PICID where ap.ALBUMID=?";

	public List getPicsInAlbumByAlbumId(String albumId) {
		return DB.queryForList(GET_PICS_IN_ALBUM_BY_ALBUM_ID,
				new Object[] { albumId });
	}

	private static final String GEL_PICS_NOT_IN_ALBUM_BY_ALBUM_ID = "select p.* from pic p where p.PICID not in (select PICID from album_pic ap where ap.ALBUMID=?)";

	public PagingList getPicsNotInAlbumByAlbumId(String albumId) {
		return getPagingList(GEL_PICS_NOT_IN_ALBUM_BY_ALBUM_ID,
				new Object[] { albumId });
	}

	private static final String ADD_PIC_TO_ALBUM = "insert into album_pic(ALBUMID,PICID) values(?,?)";

	public void addPicToAlbum(String albumId, String picId) {
		DB.update(ADD_PIC_TO_ALBUM, new Object[] { albumId, picId });
	}

	private static final String DELETE_PIC_FROM_ALBUM = "delete from album_pic where ALBUMID=? and PICID=?";

	public void deletePicFromAlbum(String albumId, String picId) {
		DB.update(DELETE_PIC_FROM_ALBUM, new Object[] { albumId, picId });
	}

	private static final String UPDATE_ALBUM_BY_ID = "update album set NAME=?, CONTENT=? where ID=?";

	public void updateAlbumById(Map parameters) {
		Object[] params = MapUtil.getObjectArrayFromMap(parameters,
				"name,content,id");
		DB.update(UPDATE_ALBUM_BY_ID, params);
	}

	private static final String DELETE_PIC_FORM_ALBUM_BY_ALBUM_ID = "delete from album_pic where ALBUMID=?";

	private static final String DELETE_ALBUM_BY_ID = "delete from album where ID=?";

	public void deleteAlbumById(String id) {
		DB.update(DELETE_PIC_FORM_ALBUM_BY_ALBUM_ID, new Object[] { id });
		DB.update(DELETE_ALBUM_BY_ID, new Object[] { id });
	}
}