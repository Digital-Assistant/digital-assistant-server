package voice.backend.indexing;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ClickeventsTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/voiceapi/clickevents/all")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}