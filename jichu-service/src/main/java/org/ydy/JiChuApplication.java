package org.ydy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 姚端阳
 * @date 2018/10/21 14:36
 */
@SpringBootApplication
@MapperScan("org.ydy.mapper")
@EnableEurekaClient
public class JiChuApplication {
    public static void main(String[] args){
        SpringApplication.run(JiChuApplication.class,args);
    }
}
