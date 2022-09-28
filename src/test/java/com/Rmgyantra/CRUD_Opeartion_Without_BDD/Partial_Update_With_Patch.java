package com.Rmgyantra.CRUD_Opeartion_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import okhttp3.Response;

public class Partial_Update_With_Patch {

	@Test
	public void creatingProTest()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "developer");
		
		
		RequestSpecification resqspec = RestAssured.given();
		resqspec.contentType(ContentType.JSON);
		resqspec.body(jobj);
		
		io.restassured.response.Response resp = resqspec.patch("https://reqres.in/api/users/2");
		ValidatableResponse vres = resp.then();
		vres.assertThat().statusCode(200);
		vres.log().all();
		
		
		
	}

}
