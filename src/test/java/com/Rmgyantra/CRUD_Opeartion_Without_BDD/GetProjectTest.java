package com.Rmgyantra.CRUD_Opeartion_Without_BDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetProjectTest {

	@Test
	public void getProjectTest() {
		
		Response resps = RestAssured.get("http://localhost:8084/projects");
//		resps.prettyPrint();
//		System.out.println(resps.getStatusCode());
//		System.out.println(resps.getTime());
		ValidatableResponse vresp = resps.then();
		vresp.log().all();
		vresp.assertThat().statusCode(200);
	
		
//		RestAssured.delete("http://localhost:8084/projectsTY_PROJ_826");

	}
}
