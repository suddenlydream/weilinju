/*
 * @project :Weilinju
 * @auther  :huqiming 
 * @date    :2013-9-7
 */
package com.weilinju.utils;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 *
 */
public class JsonUtil {
	private static final String TAG = "JsonUtil";
	public static ObjectMapper mObjectMapper = new ObjectMapper();

	public static String obj2Json(Object obj) {
		if (obj == null) {
			return null;
		}
		try {
			return mObjectMapper.writer().writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
			Log.e(TAG, e.getMessage());
		}
		return null;
	}

	public static <T> T json2Obj(String json, Class<T> cls) {
		if (json == null) {
			return null;
		}
		try {
			T obj = mObjectMapper.readValue(json, cls);
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			Log.e(TAG, e.getMessage());
		}
		return null;
	}

	public static <T> ArrayList<T> json2List(String json, Class<T> cls) {
		if (json == null) {
			return null;
		}
		try {
			ArrayList<T> jsonlist = mObjectMapper.readValue(json, TypeFactory.defaultInstance()
					.constructArrayType(cls));

			return jsonlist;
		} catch (Exception e) {
			e.printStackTrace();
			Log.e(TAG, e.getMessage());
		}
		return null;
	}
}
