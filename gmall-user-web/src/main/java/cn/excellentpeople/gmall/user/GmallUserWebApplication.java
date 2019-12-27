package cn.excellentpeople.gmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GmallUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserWebApplication.class, args);
    }

}
