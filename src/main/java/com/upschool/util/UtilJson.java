package com.upschool.util;

import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class UtilJson {

	private static Client client;

	public static Client getClient() {
		if (client == null)
			client = Client.create();
		return client;
	}

	public static MensagemRespostaServico postJson(String resourceUrl,
			String jsonData) {
		try {
			WebResource webResource = getClient().resource(resourceUrl);

			ClientResponse response = webResource.type(
					MediaType.APPLICATION_JSON).post(ClientResponse.class,
					jsonData);

			// Lan�ar exce��o caso o status n�o seja na centena 200.
			if (!String.valueOf(response.getStatus()).substring(0, 1)
					.equals("2")) {
				throw response.getEntity(Exception.class);
			}

			return response.getEntity(MensagemRespostaServico.class);
		} catch (Exception e) {
			e.printStackTrace();
			return MensagemRespostaServico.ERRO_NAO_CADASTRADO;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> getAllObjectJson(String resourceUrl,
			Class<T> objectType) {
		List<T> list = null;

		try {
			WebResource webResource = getClient().resource(resourceUrl);

			ClientResponse response = webResource.accept(
					MediaType.APPLICATION_JSON).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			list = (List<T>) UtilConverter.jsonToObject(output, objectType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> getAllObjectJson(String resourceUrl,
			Type objectType) {
		List<T> list = null;

		try {
			WebResource webResource = getClient().resource(resourceUrl);

			ClientResponse response = webResource.accept(
					MediaType.APPLICATION_JSON).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			list = (List<T>) UtilConverter.jsonToObject(output, objectType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
