package Four_ways_to_post;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

@Test
public class Post_Using_Hashmap {

	public void Post_Using_Hashmap() {
	HashMap hp = new HashMap();
	hp.put("createdBy", "Akash");
	hp.put("projectName", "SDETHYD46897633");
	hp.put("status", "created");
	hp.put("teamSize", 10);
	
	given()
	.contentType(ContentType.JSON)
	.body(hp)
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().statusCode(201)
	.log().all();
}

}
