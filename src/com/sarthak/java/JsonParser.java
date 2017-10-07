package com.sarthak.java;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {
	
	public static void main(String args[]) throws ParseException{
		
		String Response = "{\"Profile\":{\"Name\":\"Sarthak\", \"Age\":\"23\"," + "\"Address\":\"Lucknow\"} }";

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(Response);

		JSONObject jsonObject = (JSONObject) obj;
		JSONObject jsonObject1 = (JSONObject) jsonObject.get("Profile");
		String name = (String) jsonObject1.get("Name");
		Long age = new Long((String) jsonObject1.get("Age"));
		String address = (String) jsonObject1.get("Address");
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);

	}

}
