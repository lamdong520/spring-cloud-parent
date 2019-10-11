package lam.com.cn.utils;

public interface Constants {
    // 响应请求成功
	String HTTP_RES_CODE_200_VALUE = "success";
	// 系统错误
	String HTTP_RES_CODE_500_VALUE = "fial";
	// 响应请求成功code
	Integer HTTP_RES_CODE_200 = 200;
	// 系统错误
	Integer HTTP_RES_CODE_500 = 500;
	/*// 未关联QQ账号
	Integer HTTP_RES_CODE_201 = 201;
	// 发送邮件
	String MSG_EMAIL = "email";
	// 会员token
	String TOKEN_MEMBER = "TOKEN_MEMBER";
	// 用户有效期 90天
	Long TOKEN_MEMBER_TIME = (long) (60 * 60 * 24 * 90);
	int COOKIE_TOKEN_MEMBER_TIME = (60 * 60 * 24 * 90);
	// cookie 会员 totoken 名称
	String COOKIE_MEMBER_TOKEN = "cookie_member_token";
	// 微信code
	String WEIXINCODE_KEY = "weixin.code";
	// 微信注册码有效期30分钟
	Long WEIXINCODE_TIMEOUT = 1800l;

    // 用户登录token
    String MEMBER_TOKEN_KEYPREFIX = "user.login";
*/
	//用户名存在
	String USER_ALREADY_EXIST = "用户名已被注册";

	//手机号已被注册
	String USER_MOBILE_EXIST = "手机号已被注册";

	//图形验证码
	String BACK_GEN_CODE = "back_gen_code";

	//图形验证码有效期5分钟
	Long BACK_GEN_CODE_TIMEOUT = (long)60*5;

	//短信验证码
	String MOBILE_CODE="mobile_code";

    //短信验证码有效期5分钟
    Long MOBILE_CODE_TIMEOUT = (long)60*5;

	//手机号格式
    String MOBILE_REGEXP = "^(1[3-9][0-9])\\d{8}$";

	Long TOKEN_MEMBER_TIME = (long) (60 * 60 * 24);
	int COOKIE_TOKEN_MEMBER_TIME = (60 * 60 * 24);

}
