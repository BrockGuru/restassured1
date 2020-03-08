package com.testgetdata.demo;



import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TestGetData {
	/*
	 * @Test public void testdata() { Response response = RestAssured.get(
	 * "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22"
	 * ); int code = response.getStatusCode(); System.out.println(code);
	 * Assert.assertEquals(200, code); }
	 */

	@Test
	public void testpost() {
		RequestSpecification request = RestAssured.given();
		request.header("content-type", "application.json");
		JSONObject object=new JSONObject();

		object.put("id", "45");
		object.put("employee_name", "guru");
		object.put("employee_salary", "100000");
		object.put("employee_age", "24");
		object.put("profile_image", "");
		request.body(object.toJSONString());
		Response response=request.post("http://dummy.restapiexample.com/api/v1/create");
		int code=response.getStatusCode();
		System.out.println(code);
		Assert.assertEquals(200,code);
	}
}