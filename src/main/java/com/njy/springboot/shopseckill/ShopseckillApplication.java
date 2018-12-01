package com.njy.springboot.shopseckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.njy.springboot.shopseckill.mapper")
public class ShopseckillApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopseckillApplication.class, args);
	}
}
