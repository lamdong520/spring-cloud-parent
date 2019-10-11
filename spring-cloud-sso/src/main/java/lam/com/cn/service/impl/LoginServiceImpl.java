package lam.com.cn.service.impl;

import lam.com.cn.dao.UserInfoDao;
import lam.com.cn.entity.UserInfo;
import lam.com.cn.service.LoginService;
import lam.com.cn.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @program: spring-cloud-parent
 * @ClassName: LoginServiceImpl
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-10-11 15:03
 **/

@RestController
public class LoginServiceImpl extends BaseApiService implements LoginService {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public BaseResponse userLogin(HttpServletRequest request, HttpServletResponse response, String userName, String password) {
        //校验用户名 密码是否为空
        //根据用户名密码查询数据库
        /*QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", userName);
        queryWrapper.eq("password", password);
        UserInfo userInfo = userInfoDao.selectOne(queryWrapper);*/
        UserInfo userInfo = userInfoDao.selectUser(userName,password);
        //如果查询到说明登录成功，生成token放入Redis中,放cookie中
        if(userInfo !=null){
            String token = UUID.randomUUID().toString();
            redisUtil.setString(token, userName, Constants.TOKEN_MEMBER_TIME);
            CookieUtils.setCookie(request,response,"token",token,Constants.COOKIE_TOKEN_MEMBER_TIME);
        }
        return null;
    }
}
