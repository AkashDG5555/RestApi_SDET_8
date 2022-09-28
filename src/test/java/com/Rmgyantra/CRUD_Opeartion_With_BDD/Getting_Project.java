package com.Rmgyantra.CRUD_Opeartion_With_BDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Getting_Project {

	@Test
	  public void getting_Project(){
		
	     when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
