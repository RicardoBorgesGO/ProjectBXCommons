package com.upschool.util;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UtilConverter {
	
	private static Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy HH:mm").create();

	/**
	 * Converte Objeto em JSON
	 * @param object
	 * @return
	 */
	public static <T> String objectToJson(T object) {
		return gson.toJson(object);
	}
	
	/**
	 * Converte JSON em Objeto
	 * @param object
	 * @return
	 */
	public static <T> T jsonToObject(String json, Class<T> objectType) {
		return gson.fromJson(json, objectType);
	}
	
	/**
	 * Converte JSON em Objeto, 
	 * @param json
	 * @param objectType
	 * @param dateDefault
	 * @return
	 */
	public static <T> T jsonToObject(String json, Type objectType) {
		return gson.fromJson(json, objectType);
	}
	
	
	
}
