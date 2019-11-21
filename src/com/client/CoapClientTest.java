package com.client;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
public class CoapClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoapClient client = new CoapClient("coap://localhost/Hello");
		
		CoapResponse response = client.get();
		
		if (response != null) {
			System.out.println(response.getCode().value);
			System.out.println(response.getResponseText());
		} else {
			System.out.println("Request failed");
		}
		
		response = client.post("Bla", 0);
		System.out.println(response.getCode().value);

	}

}
