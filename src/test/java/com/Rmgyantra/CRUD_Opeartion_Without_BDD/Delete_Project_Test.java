package com.Rmgyantra.CRUD_Opeartion_Without_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_Project_Test {
@Test
	public void deleteProjectTest() {
		Response resps = RestAssured.get("http://localhost:8084/projects");
		RestAssured.delete("http://localhost:8084/projects/TY_PROJ_823");
	}

}
