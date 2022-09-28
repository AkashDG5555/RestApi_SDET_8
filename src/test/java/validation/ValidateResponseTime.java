package validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

public class ValidateResponseTime {

	@Test
	public void validateResposeTiming() {

		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS)
		.assertThat().body("[1].projectName", Matchers.equalTo("Deepak_pro_46901"))
		.log().all();


	}
}
