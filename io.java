public class io {
    
}

//java.io :
//is used to process the o/p and produce the o/p
//user the concept of a stream to make i/o operation
//java.io package contains all the classes required for i/p and o/poperations.

//Stream :
//is a sequence of data.
//is composed bytes.
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;


public void UpdateRecords(){
		int empid = 15410;

		RestAssured.baseURI ="https://prod-24.centralindia.logic.azure.com/workflows/78d6df0ed1384ee0b7d04918f1a32b85/triggers/request/paths/invoke?api-version=2016-10-01&sp=%2Ftriggers%2Frequest%2Frun&sv=1.0&sig=i6gXuS7-5_fFVf-0u8M4UfymINDULCMifsscfN5cPKM";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("Name", "Chandu"); // Cast
		requestParams.put("Email", "");
		requestParams.put("College", "");
        requestParams.put("StudentId", "");
        requestParams.put("FileName", "");
        requestParams.put("Password", "");


		request.body(requestParams.toJSONString());

		int statusCode = response.getStatusCode();
		System.out.println(response.asString());
		Assert.assertEquals(statusCode, 200); 

	}