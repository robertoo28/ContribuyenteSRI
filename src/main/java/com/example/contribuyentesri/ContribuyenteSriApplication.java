package com.example.contribuyentesri;

import com.example.contribuyentesri.Controlador.ContribuyenteController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ContribuyenteSriApplication {

	public static void main(String[] args) {


		SpringApplication.run(ContribuyenteSriApplication.class, args

		);
	}

}
