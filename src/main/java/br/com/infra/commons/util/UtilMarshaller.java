package br.com.infra.commons.util;

import java.lang.reflect.Type;
import java.util.List;

public class UtilMarshaller {

	@SuppressWarnings("unchecked")
	public static <T> List<T> marshallerAllJsonToObject(String json, Type objectType) {
		List<T> list = null;
		try {
			list = (List<T>) UtilConverter.jsonToObject(json, objectType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
