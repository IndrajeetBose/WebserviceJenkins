package com.org.apiTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.org.httpClient.RestClient;
import com.org.utils.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_API_Test extends TestBase{
	
	String webUrl;
	String serviceUrl;
	String completeUrl;
	RestClient restClient;
	CloseableHttpResponse rawResponse;
	
	@BeforeTest
	public void setup() {
		webUrl = propertyReader.readTedtData("URL");
		serviceUrl = propertyReader.readTedtData("serviceUrl");
		completeUrl = webUrl + serviceUrl;
	}
	
	@Test(priority = 1)
	public void postApiTest() throws IOException {
		restClient = new RestClient();
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Content-Type", "application/json");
		rawResponse = restClient.postHttpWithHeader(completeUrl, hm);
		
		int statusCode = rawResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code----> "+statusCode);
	}
	
	@Test(priority = 2)
	public void restAssuredPostApiTest() throws IOException {
		RestAssured.baseURI=webUrl;
		
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type","application/json");
		String path = restClient.getFilePath();
		String jsonPath = path + "//JSON//POST.json";
		String jsonString = new String(Files.readAllBytes(Paths.get(jsonPath)));
		
		JSONObject jo = new JSONObject(jsonString);
		
		request.body(jo.toString());
		
		Response response = request.request(Method.POST,serviceUrl);
		
		int statusCode = response.getStatusCode();
		System.out.println("Rest Assured status code----> "+ statusCode);
		
		String body = response.getBody().asString();
		System.out.println("Rest Assured Body----> "+body);
	}
	
	@Test(priority=3)
	public void getHttpRequest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Content-Type", "application/json");
		rawResponse = restClient.getHttpWithHeader(completeUrl, hm);
		
		int statusCode = rawResponse.getStatusLine().getStatusCode();
		String expectedStatusCode = propertyReader.readTedtData("StatusCode200");
		Assert.assertEquals(statusCode, Integer.parseInt(expectedStatusCode));
		System.out.println("Status code validated");
		
		String responseBody = EntityUtils.toString(rawResponse.getEntity(), "UTF-8");
		JSONObject jo = new JSONObject(responseBody);
		System.out.println("Response Body----> "+jo);
		
		JSONArray jarr = new JSONArray(jo.getJSONArray("data").toString());
		for(int i =0; i<jarr.length(); i++) {
			JSONObject jo2 = jarr.getJSONObject(i);
			String lastName = jo2.optString("last_name");
			System.out.println("Array Last Name-----> "+lastName);
		}
		
		Header[] arr = rawResponse.getAllHeaders();
		
		HashMap<String, String> hm2 = new HashMap<String, String>();
		for(Header header : arr) {
			hm2.put(header.getName(), header.getValue());
		}
		System.out.println(hm2);
	}

}
