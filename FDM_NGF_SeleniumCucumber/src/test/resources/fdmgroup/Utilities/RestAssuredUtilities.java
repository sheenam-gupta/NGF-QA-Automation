package com.fdmgroup.Utilities;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUtilities {
	
	private static RestAssuredUtilities utilities;
	private RequestSpecBuilder builder = new RequestSpecBuilder();
	private String url;
	private String method;
	
	private RestAssuredUtilities() {
		super();
		this.url = "http://localhost:8080";
	}
	
	// Get & Reset Instance 
	public static RestAssuredUtilities getInstance() {
		if (utilities == null) {
			utilities = new RestAssuredUtilities();
		}
		
		return utilities;
	}
	
	public void resetUtilities() {
		utilities = null;
	}
	
	// Getters Setters
	public String getUrl() {
		return url;
	}

	public void setUrl(String uri) {
		this.url = "http://localhost:8080" + uri;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	
	public void setToken(String token) {
		if(token != null) {
			builder.addHeader("Authorization", token);
		}
	}
	
	// Building blocks
	public String authenticate(Map<String, String> body) {
		builder.setBody(body);
		
		return this.executeAPI().getHeader("Authorization");
	}
	
	public String authenticate(Object body) {
		builder.setBody(body);
		
		return this.executeAPI().getBody().jsonPath().get("access_token");
	}
	
	public void addQueryParams(Map<String, String> params) {
		builder.addQueryParams(params);
	}
	
	public void addPathParams(Map<String, String> params) {
		builder.addPathParams(params);		
	}
	
	public void addBody(Map<String, String> body) {
		builder.setBody(body);
	}
	
	public void addBody(Object body) {
		builder.setBody(body);
	}
	
	public ResponseOptions<Response> executeAPI() {
	    RequestSpecification request = RestAssured.given();
	    request.contentType(ContentType.JSON);
	    request.spec(builder.build());

	    if (method.equals("POST")) {
	        return request.post(this.url);
	    } else if (method.equals("GET")) { 
	        return request.get(this.url);
	    } else if (method.equals("DELETE")) {
	        return request.delete(this.url);
	    } else if (method.equals("PUT")) {
	        return request.put(this.url);
	    }

	    return null;
	}

	
}
