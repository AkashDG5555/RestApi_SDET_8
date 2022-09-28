package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class staticValidationTest {

	@Test
	public void staticTest() {
		
		String actData="Deepak_pro_46901";
		
		Response rsps = when().get("http://localhost:8084/projects");
		rsps.then().log().all();
		String expData = rsps.jsonPath().get("[1].projectName");
		
		Assert.assertEquals(actData, expData);
	}
}
