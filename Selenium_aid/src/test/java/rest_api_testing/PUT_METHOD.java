package rest_api_testing;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PUT_METHOD {

	public static void main(String[] args) {
JSONObject jobj= new JSONObject();
jobj.put("empId", "101");
jobj.put("empname","sadar");


Response putReq=RestAssured.given().contentType(ContentType.JSON).body(jobj.toString()).put(" put req api url");
int statusCode=putReq.getStatusCode();
long time=putReq.getTime();
String bodyData=putReq.asString();

System.out.println(statusCode);
System.out.println(time);
System.out.println(bodyData);

	}

}
