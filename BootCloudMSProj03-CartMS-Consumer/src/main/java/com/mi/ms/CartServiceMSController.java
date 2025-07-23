package com.mi.ms;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mi.client.BillingMSClientComp;

@RestController
@RequestMapping("/cart-api")
public class CartServiceMSController {

	@Autowired
	private BillingMSClientComp compo;

	@GetMapping("/cart")
	public ResponseEntity<String> cartOperations(){
		//generate order oid
		int oid = new Random().nextInt(100000);
		
		//Assume some items added to cart
		String items[] =new String[]{"Shirt","Trouser"};
		String cartMsg = Arrays.toString(items)+" are added to cart having order id : "+oid;
		
		//use client compo to invoke target MS
		String billingMsg = compo.invokeDoBilling();
		
		//return the final output
		return new ResponseEntity<String>(cartMsg+" ----- "+billingMsg, HttpStatus.OK);
	}
}
