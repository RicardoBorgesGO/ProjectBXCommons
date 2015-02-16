package com.upschool.util;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.upschool.entity.Evento;

public class UtilJson {

	private static Client client;

	/**
	 * Método singleton de Client
	 * @return
	 */
	public static Client getClient() {
		if (client == null)
			client = Client.create();
		return client;
	}

	/**
	 * Realiza o método POST HTML via JSON
	 * @param resourceUrl: url do recurso 
	 * @param jsonData: objeto em JSON
	 */
	public static void postJson(String resourceUrl, String jsonData) {
		try {

			WebResource webResource = getClient().resource(resourceUrl);

			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, jsonData);

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> getAllObjectJson(String resourceUrl, Class<T> objectType) {
		List<T> list = null;
		
		try {
			WebResource webResource = getClient().resource(resourceUrl);
	 
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
	 
			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
	 
			String output = response.getEntity(String.class);
			
			list = (List<T>) UtilConverter.jsonToObject(output, objectType);
		  } catch (Exception e) {
			e.printStackTrace();
		  }
		return list;
	}
}
