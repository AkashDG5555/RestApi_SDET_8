package validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicValidation {

	@Test
	public void DynamivalidationTest() {
		String actData="Deepak_pro_46901";

		Response rsps = when().get("http://localhost:8084/projects");
		rsps.then().log().all();

		List<String> explist = rsps.jsonPath().get("projectName");
		int count = explist.size();
		System.out.println(count);
		for (int i=0;i<count;i++) {
			String expData = explist.get(i);
			System.out.println(expData);
			if(actData.equals(expData)) {
				System.out.println(actData+"project is available");
				break;
			}
		}

	}
}
