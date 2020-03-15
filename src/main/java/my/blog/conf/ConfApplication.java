package my.blog.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//因为Spring Cloud Config 服务是Spring Boot应用程序，因此需要用@SpringBootApplication进行标记
@SpringBootApplication

//@EnableConfigServer使服务成为Spring Cloud Config服务
@EnableConfigServer
public class ConfApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfApplication.class, args);
    }

}
