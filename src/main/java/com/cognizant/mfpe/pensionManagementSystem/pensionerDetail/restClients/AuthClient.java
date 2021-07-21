package com.cognizant.mfpe.pensionManagementSystem.pensionerDetail.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.mfpe.pensionManagementSystem.pensionerDetail.model.AuthResponse;

/**
 * To access Authorization microservice
 * 
 */
@FeignClient(name = "authorization-service", url = "http://pmsauthorization-env.eba-rmfjbea5.ap-south-1.elasticbeanstalk.com/")
public interface AuthClient {

	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
