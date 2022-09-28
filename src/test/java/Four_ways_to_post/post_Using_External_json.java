package Four_ways_to_post;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class post_Using_External_json {
	
@Test
	public void ExternalFile() {
		
	File f= new File("./postman.json");
	
	given()
	.contentType(ContentType.JSON)
	.body(f)
	.post("http://localhost:8084/addProject")
	.then()
	.log().all();
	}
}
