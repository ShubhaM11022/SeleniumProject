package rest_api_testing;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_API_GET_METHOD {

	public static void main(String[] args) {

		Response responseApi=RestAssured.get("https://reqres.in/api/users/2");
		int statusCode=responseApi.getStatusCode();
		long responsetime=responseApi.getTime();
		String body=responseApi.asString();
		
		System.out.println(statusCode);
		System.out.println(responsetime);
		System.out.println(body);
		
Assert.assertEquals(responseApi.getStatusCode(),200);
System.out.println("api working");
// done
}
	

}
