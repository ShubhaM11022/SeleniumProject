package rest_api_testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_API_Method {

	public static void main(String[] args) {
Response deleteReq=RestAssured.delete("");
int statusCode=deleteReq.getStatusCode();
long time=deleteReq.getTime();
String body=deleteReq.asString();

System.out.println(statusCode);
System.out.println(time);
System.out.println(body);

	}

}
 