package com.shoppingmall.shopmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.shop.controller"})
//@ComponentScan("com.shop.repository")
//@ComponentScan("com.shop.service")
//@EnableJpaRepositories("com.shop.repository")

public class MallShopModulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallShopModulApplication.class, args);
	}

}
