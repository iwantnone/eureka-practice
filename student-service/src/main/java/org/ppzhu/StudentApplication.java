package org.ppzhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@MapperScan("org.ppzhu.mapper")
@EnableEurekaClient
@EnableFeignClients
public class StudentApplication{
    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }
}
