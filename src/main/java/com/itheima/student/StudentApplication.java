package com.itheima.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@MapperScan("com.itheima.student.mapper") // 扫描mapper接口
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

}
