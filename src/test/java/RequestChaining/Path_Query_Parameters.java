package RequestChaining;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Path_Query_Parameters {

	@Test
	
	public void path_query_parameter_test() {
		
		given()
		.pathParam("username", "AkashDg5555")
		.queryParam("sort", "created")
		.when()
		.get("https://api.github.com/users/{username}/repos")
		.then()
		.log().all();
	}
}
