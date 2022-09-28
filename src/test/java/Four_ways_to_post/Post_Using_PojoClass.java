package Four_ways_to_post;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rmgyantra.PojoClass.Pojo_Class;

import io.restassured.http.ContentType;


public class Post_Using_PojoClass {
	@Test(dataProvider = "ProvideMeData")
	public void postUsingpojoclass(String createdBy, String projectName, String status, int teamSize) {

		Pojo_Class p =new Pojo_Class(createdBy ,projectName, status , teamSize);
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		
	}
	
	@DataProvider
	
	public Object ProvideMeData() {
		
		Object [][] objArr=new Object[2][4];
		
		objArr[0][0]="AkashDG";
		objArr[0][1]="RMG_561284";
		objArr[0][2]="completed";
		objArr[0][3]=5;
		
		objArr[1][0]="AkashDG";
		objArr[1][1]="RMG_56ehuijggf124";
		objArr[1][2]="completed";
		objArr[1][3]=8;
		
		return objArr;
	}
	
	
}
