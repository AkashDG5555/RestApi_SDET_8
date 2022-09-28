package com.Rmgyantra.CRUD_Opeartion_With_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Creat_Project_using_BDD {

	@Test
	public void createProject() {
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Akash");
		jobj.put("projectName", "SDETHYD4633");
		jobj.put("status", "created");
		jobj.put("teamSize", 10);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
