import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserTest {

    @Test
    public void testCreateUser() {
        String requestBody = "{ \"name\": \"Alice\", \"job\": \"QA Engineer\" }";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("Alice"))
                .body("job", equalTo("QA Engineer"));
    }
}
