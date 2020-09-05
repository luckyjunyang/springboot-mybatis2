package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Administrator
 * @create 2020-09-02 20:59
 */
@EnableTransactionManagement//启用声明式事务
@MapperScan("com.atguigu.dao")//扫描dao接口,创建代理对象
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }

}
