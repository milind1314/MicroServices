package com.mi.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationsMSController {
	
	@Value("${spring.application.instance-id}")
	 private String instanceid;
	
	@Value("${server.port}")
	private String port;
	

	@GetMapping("/bill")
	public ResponseEntity<String> doBilling(){
		
		//generate bill amount
		double billAmt = new Random().nextDouble(1000000.0);
		//return the output
		return new ResponseEntity<>("Bill Amount is :: "+billAmt+"--- Instance Id :: "+instanceid+"--- Port is :: "+port,HttpStatus.OK);
		
	}
}
