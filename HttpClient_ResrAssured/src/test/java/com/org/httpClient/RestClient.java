package com.org.httpClient;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

	String path = getFilePath();

	public String getFilePath() {
		File f = new File("");
		String absPath = f.getAbsolutePath();
		String filePath = absPath.replace("\\\\+", "/");
		return filePath;
	}

	public CloseableHttpResponse postHttpWithHeader(String url, HashMap<String, String> hm) throws IOException {
		CloseableHttpClient con = HttpClients.createDefault();
		HttpPost postRequest = new HttpPost(url);
		String jsonPath = path + "//JSON//POST.json";
		String jsonString = new String(Files.readAllBytes(Paths.get(jsonPath)));
		postRequest.setEntity(new StringEntity(jsonString));
		for (Map.Entry<String, String> value : hm.entrySet()) {
			postRequest.addHeader(value.getKey(), value.getValue());
		}
		CloseableHttpResponse rawResponse = con.execute(postRequest);
		return rawResponse;

	}

	public CloseableHttpResponse getHttpWithHeader(String url, HashMap<String, String> hm) throws ClientProtocolException, IOException {
		CloseableHttpClient con = HttpClients.createDefault();
		HttpGet getRequest = new HttpGet(url);
		for (Map.Entry<String, String> value : hm.entrySet()) {
			getRequest.addHeader(value.getKey(), value.getValue());
		}
		CloseableHttpResponse rawResponse = con.execute(getRequest);
		return rawResponse;
	}

}
