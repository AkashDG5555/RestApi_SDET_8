package Autontication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BarerToken {

	@Test
	public void BarerTokenTest(){
		given()
		.auth().oauth2("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")
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.log().all();
	}
}
