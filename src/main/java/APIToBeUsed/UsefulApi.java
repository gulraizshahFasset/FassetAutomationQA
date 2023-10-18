package APIToBeUsed;

import DataReader.EnvConfig;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import static ConfigFiles.Factory.ConfigFactory.getConfig;
import static Utilities.CommonFunctions.getCurrentDateOnly;
import static Utilities.CommonFunctions.getTime;
import static io.restassured.RestAssured.given;

public class UsefulApi {
    public static String baseURL = "https://"+System.getProperty("environmentType");

    public static final String devToken = "Bearer e992215cd20570e2782101a5fb9922a227ef2c9d025cf9e672a9d229c906225fef55e484e311f26b0e41f26583d08adedd78451102f73cb54e11c35f8d237708b73631278fe8a9925a2d1c759c68f4ef482071487dc80a9ef50c35e3e5ad7bd4fa1583329d89c371aae64ddce3e0afa8ccc8bbbc03b60c8657c20c58fa9d3a80d32553329b115a60982191c3aa5962a097749825360cb96445aa541891df4221473bbaa6185f3d8b8dd6f8b94875f90d429071358528053b2acf8f1b5a342915f4f2b70db19ad71e74bc10460d3c56f98ecb37280bfcdaaf67963b0f5d6c4f7ee7b0b96f00a889e41427329d7c79b74ee82a18853fc16ef031875fc05ea12674ca396fb2cae4d5456f71bc557ead137e";
    public static final String stagingToken = "Bearer e94754ed081872c4393e88e5dd1aaaa9252468d6e56288f7e533c77aa0701cada220a17c638d3c3d36276e43b7d1e8addd96faf40930fa4ea7b3e3576eb0c73cae5b0fd5a2f49e1345a616db4514ebac6a47ef6715b89509e18d3bc7d418e74c8770bb94ea910779c2c169b547cda63cad11aa06db706c8697002f2d7b63e3e7de8b79bce126b4354b2a531c7bfbc4bd23d1fef2a088ff03b2911a6d36de9eb92bf984e88a9d5b2fc503fd17607ba57aa8ccfcd8a93c744554b2dd85309d2f6ed770edd756216cc8aa669abb2770a664c9c4455e545228ea5d9dee040f3fe8f953e88d2864924a744d9eee4a70fe895e715d7b965706b6ef21607edabc62e85e610c9997933d3fe553789b48e1546ced";
   public static String requiredToken(){
        if(getConfig().EnvironmentType().toString().toLowerCase().equals("dev")){
            return devToken;
        }
        else if(getConfig().EnvironmentType().toString().toLowerCase().equals("staging")){
            return stagingToken;
        }
        else{
            return devToken;
        }
    }
    public static void createFileAndWriteData(String nameOfFile,String body){
        String pathOfFile = System.getProperty("user.dir")+"/src/test/java/com/fasset/automation/outputDataFiles/"+nameOfFile+".json";
        System.out.println(body);
        try{
        if(checkFileExists(pathOfFile)) {
            File myObj = new File(pathOfFile);
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + nameOfFile);
            } else {
                System.out.println("Failed to delete the file : "+ nameOfFile);
            }
            if (myObj.createNewFile()) {
                System.out.println("File created: " + nameOfFile);
            } else {
                System.out.println("File already exists :"+ nameOfFile);
            }
        }
        else{
            File myObj = new File(pathOfFile);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + nameOfFile);
            } else {
                System.out.println("File already exists :"+ nameOfFile);
            }
        }

        FileWriter file = new FileWriter(pathOfFile);
        file.write(body);
        file.flush();
        } catch (IOException e) {
            System.out.println("File Creation Error for :"+nameOfFile);
        }
    }
    public static void getDataAndWriteInFile(String path,String fileName){
        RestAssured.baseURI = baseURL;
        RequestSpecification request = given();
        request.header("Authorization",getToken("moiz@yopmail.com","Admin@123"));
        Response response = request.get(path);
        ResponseBody body = response.getBody();
        if(response.getStatusCode() == 200){
          createFileAndWriteData(fileName,body.asString());
        }else{
            System.out.println("Api failed for : " + fileName + " with status code : " + response.getStatusCode());
        }
    }
    public static String getToken(String userEmail,String password){
        String token = "";
        RestAssured.baseURI = "https://"+System.getProperty("environmentType")+"";
        Response response =  given().header("Content-Type","application/json")
                .body("{\"email\":\""+userEmail+"\",\"password\":\""+password+"\"}")
                .post().then().statusCode(200).extract().response();
        token = response.jsonPath().getString("data.user.access_token");
        return "Bearer "+token;
    }
    public static boolean checkFileExists(String fileName){
        try {
            File f = new File(fileName);
            if (f.exists() && !f.isDirectory()) {
                return true;
            }
        }
        catch (Exception ex){
            return false;
        }
        return false;
    }
    public static void getDataBeforeSuite(){
       // To get data before suite
    }
}
