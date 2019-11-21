package com.client;
import com.google.gson.Gson;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.MediaTypeRegistry;

public class CoapClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoapClient client = new CoapClient("coap://localhost/Hello");
		
		CoapResponse response = client.get();

		if (response != null) {
			System.out.println(response.getCode().value);
			System.out.println(response.getResponseText());
			System.out.println(MediaTypeRegistry.toString(response.getOptions().getContentFormat()));
		} else {
			System.out.println("Request failed");
		}

		Book book = new Book("title", 50);
		String bla = new Gson().toJson(book);
		response = client.post(bla, MediaTypeRegistry.APPLICATION_JSON);
		System.out.println(response.getCode().value);
	}

}
