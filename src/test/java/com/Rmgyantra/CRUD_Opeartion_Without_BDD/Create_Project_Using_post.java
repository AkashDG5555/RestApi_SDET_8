package com.Rmgyantra.CRUD_Opeartion_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Create_Project_Using_post {

	@Test
	public void createProjectTest() {
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Akash");
		jobj.put("projectName", "SDETHYD46833");
		jobj.put("status", "created");
		jobj.put("teamSize", 10);
		
		RequestSpecification reqspec = RestAssured.given();
		reqspec.contentType(ContentType.JSON);
		reqspec.body(jobj);
		
		Response rsps = reqspec.post("http://localhost:8084/addProject");
		
		 ValidatableResponse vres = rsps.then();
		 vres.assertThat().statusCode(201);
		 vres.log().all();
}
}
