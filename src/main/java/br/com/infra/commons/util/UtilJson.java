package br.com.infra.commons.util;

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

	public static String postJson(String resourceUrl, String jsonData) {
		try {
			WebResource webResource = getClient().resource(resourceUrl);

			ClientResponse response = webResource
					.type(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, jsonData);

			// Lancar excecao caso o status nao seja na centena 200.
			if (!String.valueOf(response.getStatus()).substring(0, 1)
					.equals("2")) {
				throw response.getEntity(Exception.class);
			}
			
			String resposta = response.getEntity(String.class);

			return resposta;
		} catch (Exception e) {
			e.printStackTrace();
			// return "Substituir por exceção";
			return MensagemRespostaServico.ERRO_NAO_CADASTRADO.getMensagem();
		}
	}
	
	public static boolean postVerifyJson(String resourceUrl, String jsonData) {
		try {
			WebResource webResource = getClient().resource(resourceUrl);

			ClientResponse response = webResource
					.type(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, jsonData);

			// Lancar excecao caso o status nao seja na centena 200.
			if (!String.valueOf(response.getStatus()).substring(0, 1)
					.equals("2")) {
				throw response.getEntity(Exception.class);
			}
			
			boolean resposta = response.getEntity(Boolean.class);

			return resposta;
		} catch (Exception e) {
			e.printStackTrace();
			// return "Substituir por exceção";
//			return MensagemRespostaServico.ERRO_NAO_CADASTRADO.getMensagem();
		}
		
		return false;
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

//	@SuppressWarnings("unchecked")
//	public static <T> List<T> getAllObjectJson(String resourceUrl, Type objectType) {
//		List<T> list = null;
//
//		try {
//			WebResource webResource = getClient().resource(resourceUrl);
//
//			ClientResponse response = webResource.accept(
//					MediaType.APPLICATION_JSON).get(ClientResponse.class);
//
//			if (response.getStatus() != 200) {
//				throw new RuntimeException("Failed : HTTP error code : "
//						+ response.getStatus());
//			}
//
//			String output = response.getEntity(String.class);
//
//			list = (List<T>) UtilConverter.jsonToObject(output, objectType);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
	
	public static String getAllObjectJson(String resourceUrl, Type objectType) {
		String json = null;

		try {
			WebResource webResource = getClient().resource(resourceUrl);

			ClientResponse response = webResource.accept(
					MediaType.APPLICATION_JSON).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			return response.getEntity(String.class);

//			list = (List<T>) UtilConverter.jsonToObject(output, objectType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
}
