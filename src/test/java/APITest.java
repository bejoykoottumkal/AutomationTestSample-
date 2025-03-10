import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITest {

    @Test
    public void testGetUsers() {
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .body("data.size()", greaterThan(0))
                .body("data[0].email", containsString("@"));
    }
}
