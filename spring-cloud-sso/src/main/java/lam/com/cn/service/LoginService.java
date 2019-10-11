package lam.com.cn.service;

import lam.com.cn.utils.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: spring-cloud-parent
 * @ClassName: LoginService
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-10-11 14:47
 **/
public interface LoginService {

    @GetMapping("/userLogin/{userName}/{password}")
    BaseResponse userLogin(HttpServletRequest request, HttpServletResponse response, @PathVariable String userName, @PathVariable String password);

}
