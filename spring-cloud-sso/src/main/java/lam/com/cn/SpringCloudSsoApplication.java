package lam.com.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("lam.com.cn.dao")
public class SpringCloudSsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSsoApplication.class, args);
	}

}
