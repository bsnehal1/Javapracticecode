package Study_Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;


public class basicrestassured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To validate if Add Place API working as expected
		//given - all input details
		//when - Submit the API
		//then - validate the response
		/*RestAssured.baseURI="https://rahulshettyacademy.com/";
		given().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace()).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
		.body("scope",equalTo("APP")).header("Server","Apache/2.4.18 (Ubuntu)");*/
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		String response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace()).when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js=new JsonPath(response);
		String placeId=js.getString("place_id");
		System.out.println(placeId);
		
		//Update place
		
		String newAddress="Summer Walk Africa";
		
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"+
			"\"place_id\":\""+placeId+"\",\r\n"+
			"\"address\":\""+newAddress+"\",\r\n" +
			"\"key\":\"qaclick123\"\r\n"+
			"}").
		when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		//Get Place
		
		String getPlaceresponse=given().log().all().queryParam("key","qaclick123")
				.queryParam("place_id",placeId)
				.when().get("/maps/api/place/get/json")
				.then().assertThat().log().all().statusCode(200).extract().response().asString();	
		
		JsonPath js1=new JsonPath(getPlaceresponse);
		String actualAddress = js1.getString("address");
			System.out.println(actualAddress);
				
			
			}


	}


