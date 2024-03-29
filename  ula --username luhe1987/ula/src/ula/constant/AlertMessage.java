package ula.constant;

public interface AlertMessage {
	String GO_BACK = "返回";
	String URL_GO_BACK = "javascript:history.go(-1)";

	String URL_ABOUT = "aboutAdmin.action";
	String URL_WEATHER = "weatherAdmin.action";
	String URL_TOUR_CATEGORY = "categoryAdmin.action";
	String URL_TOUR = "tourAdmin.action";
	String URL_PRODUCT = "productAdmin.action";
	String URL_CITY = "cityAdmin.action";
	String URL_CITY_TOUR = "tourAdmin.action";
	String URL_CITY_FOOD = "foodAdmin.action";
	String URL_CITY_HOUSING = "housingAdmin.action";
	String URL_CITY_SHOPPING = "shoppingAdmin.action";
	String URL_CITY_TRANSPORTATION = "transportationAdmin.action";
	String URL_CITY_THERAPY = "therapyAdmin.action";
	String URL_CITY_FESTIVAL = "festivalAdmin.action";
	String URL_CITY_EXHIBITION = "exhibitionAdmin.action";
	String URL_SPECIAL = "specialAdmin.action";
	String URL_CONTACT = "contactAdmin.action";
	String URL_LINK = "linkAdmin.action";
	String URL_EXCHANGE = "exchangeAdmin.action";

	String UPDATE_SUCCESS = "更新成功";
	String UPDATE_FAILURE = "对不起，更新失败";
	String INSERT_SUCCESS = "添加成功";
	String INSERT_FAILURE = "添加失败";
	String DELTE_ERROR = "删除失败";
	String DELTE_SUCCESS = "删除成功";
	String INFO_EMPTY = "信息不存在";

	String CITY_HISTORY_EMPTY = "大连历史介绍没有添加，请添加";
	String CITY_UPDATE_SUCCESS = "大连城市信息更新成功";
	String cITY_UPDATE_FAILURE = "大连城市信息更新失败";

	String LINK_EMPTY = "友情链接没有添加，请添加";

	String PIC_SIZE_ZERO = "图片大小为零，请重新选择";
	String PIC_INSERT_SUCCESS = "图片上传成功";
	String PIC_INSERT_FAILURE = "图片上传失败";
	String PIC_INSERT_DENY = "图片格式不对，不能上传。请选择jpg/jpeg/gif/png/bmp等格式的文件";
	String PIC_DELETE_SUCCESS = "图片删除成功";

	String USER_DELETE_SUCCESS = "用户删除成功";
	String USER_DELETE_FAILURE = "用户删除失败";
	String USER_DELETE_DENY = "根用户不能删除";
	String USER_UPDATE_SUCCESS = "用户信息修改成功";
	String USER_UPDATE_FAILURE = "用户信息修改失败";
	String USER_ADD_SUCCESS = "用户添加成功";
	String USER_ADD_FAILURE = "用户添加失败";

	String ARTICLE_ADD_SUCCESS = "文章添加成功";
	String ARTICLE_ADD_FAILURE = "文章添加失败";
	String ARTICLE_UPDATE_SUCCESS = "文章更新成功";
	String ARTICLE_UPDATE_FAILURE = "文章更新失败";
	String ARTICLE_DELETE_SUCCESS = "文章删除成功";
	String ARTICLE_DELETE_FAILURE = "文章删除失败";

	String DONE_MARK = "标记为已处理。操作成功";
	String UNDONE_MARK = "标记为未处理。操作成功";

	String HOTEL_PARAM_NAME_EXIST = "酒店参数名称已经存在，请更换";
	String HOTEL_PARAM_ADD_SUCCESS = "酒店参数添加成功";
	String HOTEL_PARAM_ADD_FAILURE = "酒店参数添加失败";
	String HOTEL_PARAM_UPDATE_SUCCESS = "酒店参数修改成功";
	String HOTEL_PARAM_UPDATE_FAILURE = "酒店参数修改失败";
	String HOTL_PARAM_DELETE_SUCCESS = "酒店参数删除成功";
	String HOTL_PARAM_DELETE_FAILURE = "酒店参数删除失败";

	String HOTEL_ALBUM_ADD_SUCCESS = "酒店相册添加成功";
	String HOTEL_ALBUM_ADD_FAILURE = "酒店相册添加成功";
	String HOTEL_ADD_PIC_TO_ALBUM_SUCCESS = "照片添加到相册成功";
	String HOTEL_ADD_PIC_TO_ALBUM_FAILURE = "照片添加到相册失败";
	String HOTEL_DELETE_PIC_FROM_ALBUM_SUCCESS = "从相册中删除照片成功";
	String HOTEL_DELETE_PIC_FROM_ALBUM_FALIURE = "从相册中删除照片失败";
	String HOTEL_ALBUM_UPDATE_SUCCESS = "相册更新成功";
	String HOTEL_ALBUM_UPDATE_FAILURE = "相册更新失败";
	String HOTEL_ALBUM_DELETE_SUCCESS = "相册删除成功";
	String HOTEL_ALBUM_DELETE_FAILURE = "相册删除失败";

	String HOTEL_ADD_SUCCESS = "酒店添加成功";
	String HOTEL_ADD_FAILURE = "酒店添加失败";
	String HOTEL_UPDATE_SUCCESS = "酒店更新成功";
	String HOTEL_UPDATE_FAILURE = "酒店更新失败";
	String HOTEL_DELETE_SUCCESS = "酒店删除成功";
	String HOTEL_DELETE_FAILURE = "酒店删除失败";
	String HOTEL_RECOMMAND_UPDATE_SUCCESS = "酒店推荐更新成功";
	String HOTEL_RECOMMAND_UPDATE_FAILURE = "酒店推荐更新失败";

	String RECOMMAND_ADD_SUCCESS = "推荐添加成功";
	String RECOMMAND_ADD_FAILURE = "推荐添加失败";
	String RECOMMAND_UPDATE_SUCCESS = "推荐更新成功";
	String RECOMMAND_UPDATE_FAILURE = "推荐更新失败";
	String RECOMMAND_DELETE_SUCCESS = "推荐删除成功";
	String RECOMMAND_DELETE_FAILURE = "推荐删除失败";

	String WEATHER_UPDATE_SUCCESS = "天气预报更新成功";
	String WEATHER_UPDATE_FAILURE = "天气预报更新失败";
	String WEATHER_CONNECT_TIMEOUT = "网络请求超时，请稍后重试";
	String WEATHER_DEFAULT_CITY_SUCCESS = "默认城市设置成功";
	String WEATHER_DEFAULT_CITY_FAILURE = "默认城市设置失败";

	String RESOURCE_ADD_SUCCESS = "订阅资源添加成功";
	String RESOURCE_ADD_FAILURE = "订阅资源添加失败";
	String RESOURCE_UPDATE_SUCCESS = "订阅资源更新成功";
	String RESOURCE_UPDATE_FAILURE = "订阅资源更新失败";
	String RESOURCE_DELETE_SUCCESS = "订阅资源删除成功";
	String RESOURCE_DELETE_FAILURE = "订阅资源删除失败";

	String SUBSCRIBER_DELETE_SUCCESS = "订阅用户删除成功";
	String SUBSCRIBER_DELETE_FAILURE = "订阅用户删除失败";

	String TOUR_CATEGORY_ADD_SUCCESS = "行程分类添加成功";
	String TOUR_CATEGORY_ADD_FAILURE = "行车分类添加失败";
	String TOUR_CATEGORY_UPDATE_SUCCESS = "行程分类更新成功";
	String TOUR_CATEGORY_UPDATE_FAILURE = "行车分类更新失败";
	String TOUR_CATEGORY_DELETE_SUCCESS = "行程分类删除成功";
	String TOUR_CATEGORY_DELETE_FAILURE = "行程分类删除失败";

	String TOUR_ADD_SUCCESS = "行程文章添加成功";
	String TOUR_ADD_FAILURE = "行程文章添加失败";
	String TOUR_UPDATE_SUCCESS = "行程文章更新成功";
	String TOUR_UPDATE_FAILURE = "行程文章更新失败";
	String TOUR_DELETE_SUCCESS = "行程文章删除成功";
	String TOUR_DELETE_FAILURE = "行程文章删除失败";

	String PRODUCT_ADD_SUCCESS = "产品添加成功";
	String PRODUCT_ADD_FAILURE = "产品添加失败";
	String PRODUCT_UPDATE_SUCCESS = "产品更新成功";
	String PRODUCT_UPDATE_FAILURE = "产品更新失败";
	String PRODUCT_DELETE_SUCCESS = "产品删除成功";
	String PRODUCT_DELETE_FAILURE = "产品删除失败";
	String PRODUCT_TOUR_ADD_SUCCESS = "行程添加到产品中成功";
	String PRODUCT_TOUR_ADD_FAILURE = "行程添加到产品中失败";

	String LINK_ADD_SUCCESS = "链接添加成功";
	String LINK_ADD_FAILURE = "链接添加失败";
	String LINK_UPDATE_SUCCESS = "链接更新成功";
	String LINK_UPDATE_FAILURE = "链接更新失败";
	String LINK_DELETE_SUCCESS = "链接删除成功";
	String LINK_DELETE_FAILURE = "链接删除失败";
}
