package lam.com.cn.service;

import com.cn.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-parent
 * @ClassName: OrderServiceImpl
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-10-10 17:46
 **/
@RestController
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrder() {
        return "getOrder";
    }
}
