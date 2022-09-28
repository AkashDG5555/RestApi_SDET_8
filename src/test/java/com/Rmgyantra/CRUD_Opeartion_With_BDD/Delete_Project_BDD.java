package com.Rmgyantra.CRUD_Opeartion_With_BDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Delete_Project_BDD {

	@Test
	public void deleteProject() {
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_1002")
		.then()
		.assertThat().statusCode(204)
		.log().all();
		
	}
}
