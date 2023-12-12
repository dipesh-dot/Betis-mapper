package com.mybatismapper;

import com.mybatismapper.model.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("com.mybatismapper.mapper")
@SpringBootApplication
public class MyBatisMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisMapperApplication.class, args);
	}

}
