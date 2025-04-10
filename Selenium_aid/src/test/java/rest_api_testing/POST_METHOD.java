package rest_api_testing;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_METHOD {

	public static void main(String[] args) {
		JSONObject js=new JSONObject();
		 js.put("empid", "101");
		 js.put("empname", "sadar");
		//post request
		 Response reqpost=RestAssured.given()
		.contentType(ContentType.JSON)
		.body(js.toString())
		.post("https://reqres.in/api/users");
		// print status code ,time and body
		int statusCode= reqpost.getStatusCode();
		long responseTime= reqpost.getTime();
		String bodyData=reqpost.asString();
		System.out.println(statusCode);
		System.out.println(responseTime);
		System.out.println(bodyData);

	}

}
