package lam.com.cn.service;

import com.cn.service.MemberService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-parent
 * @ClassName: MemberServiceImpl
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-10-10 17:41
 **/
@RestController
public class MemberServiceImpl implements MemberService {
    @Override
    public String getMember() {
        return "hello getMember";
    }
}
