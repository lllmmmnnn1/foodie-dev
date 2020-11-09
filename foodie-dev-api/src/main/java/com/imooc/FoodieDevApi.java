package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.imooc.mapper")
public class FoodieDevApi {
    public static void main(String[] args) {
        SpringApplication.run(FoodieDevApi.class,args);
    }
}
