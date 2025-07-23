package com.mi.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Component
public class BillingMSClientComp {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	public String invokeDoBilling() {
		//get target MS instances from eureka server
		List<ServiceInstance> listInstance = discoveryClient.getInstances("BillingMS");
		
		//pick certain instance manually to get endpoint details
		URI baseUrl = listInstance.get(0).getUri();
		
		//Complete the endpoint url
		
		String endpointUrl = baseUrl+"/BillingMS/billing-api/bill";
		
		//Use RestTemplate to invoke the services of priveder MS
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.exchange(endpointUrl, HttpMethod.GET, null, String.class);
		
		//send the response body as the return value
		return response.getBody();
		
	}
	
}
