package com.pe.relari.soap_ws_employee_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SoapWsEmployeeV1Application {

	public static void main(String[] args) {
		SpringApplication.run(SoapWsEmployeeV1Application.class, args);
	}

}
