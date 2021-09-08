package com.devsuperior.dsvendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.dsvendas.controllers.SellerController;
import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;

@ComponentScan(basePackageClasses = SellerController.class)
@ComponentScan(basePackageClasses = {SellerService.class, SellerDTO.class})
@SpringBootApplication
public class DsvendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsvendasApplication.class, args);
	}

}
