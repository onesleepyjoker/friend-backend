package com.yupi.yupao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @author <a href="https://github.com/onesleepyjoker/friend-backend">一只小小丑</a>
 * @from <a href="https://github.com/onesleepyjoker/friend-backend">一只小小丑</a>
 */
@SpringBootApplication
@MapperScan("com.yupi.yupao.mapper")
@EnableScheduling
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

// 作_者 [一只小小丑](https://github.com/onesleepyjoker/friend-backend/)