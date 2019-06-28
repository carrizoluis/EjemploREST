package rest.controller;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import rest.com.example.Example;

public class RestController {
	
	
	public static String doGet() {
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("https://httpbin.org/get")
		  .get()
		  .addHeader("cache-control", "no-cache")
		  .addHeader("Postman-Token", "a8438664-7521-4931-9bd2-bf457d262e72")
		  .build();
		
		try {
			Response response = client.newCall(request).execute();
			return response.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}
	
	public static String doPost(Example ex) {
		
		OkHttpClient client = new OkHttpClient();
		RequestBody formBody = new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("JSON", getJson(ex)).build();
		Request request = new Request.Builder().url(ex.getUrl()).post(formBody).build();
		Response response;
		try {
			response = client.newCall(request).execute();
			return response.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
		
	private static String getJson(Example ex) {
		ObjectMapper mapper=new ObjectMapper();
	    String json;
		try {
			json = mapper.writeValueAsString(ex);
			return json;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
