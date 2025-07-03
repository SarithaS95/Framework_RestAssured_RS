import EndPoints.APIConstants;
//import com.sun.source.tree.AssertTree;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TC01_CreateBooking extends APIConstants{
    @Test
    public void CreateBooking()
    {

        RequestSpecification r=RestAssured.given();
        Response response;
        ValidatableResponse vr;



//        r.baseUri("https://restful-booker.herokuapp.com/");
//        r.basePath("booking");
        //r.body(payload);
        r.contentType(ContentType.JSON);


        response=r.when().log().all().post();

        vr=response.then().log().all();

        System.out.println(vr.toString());

        int BookID=vr.log().all().extract().path("bookingid");
        String additional=vr.log().all().extract().path("booking.additionalneeds");
        String firstname=vr.log().all().extract().path("booking.firstname");
        System.out.println(additional);
        System.out.println(firstname);
        vr.statusCode(200);
        System.out.println(BookID);
        Assertions.assertThat("harsha").isEqualTo("harsha").isNotBlank();

    }
    }


