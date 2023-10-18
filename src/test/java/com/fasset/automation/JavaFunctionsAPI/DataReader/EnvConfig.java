package com.fasset.automation.JavaFunctionsAPI.DataReader;

import com.fasset.automation.JavaFunctionsAPI.ReusableFunctions;
import org.json.simple.JSONObject;

import java.util.Map;

public class EnvConfig extends ReusableFunctions {

    static ReusableFunctions RS = new ReusableFunctions();
    public static String jsonFileType;
    public static JSONObject dataToBeUsed;
    private static final  String PathToFile = "/src/test/resources/Features/api/mobileApi/payloads/";

    // Used Keywords which cannot be changed during execution

    // Data Objects
    public static Map<String, String> CreateAccountValidData;
    public static Map<String, String> RegisteredUserLoginData;
    public static Map<String, String> InvalidUser_Login;

    public static void loadTestDataFile(String environment) {
        try {
        String fileName = environment.toLowerCase()+"DataAPI.json";
        jsonFileType = System.getProperty("user.dir")+ PathToFile + fileName;
        dataToBeUsed = JsonReader.getJSONDataURL(EnvConfig.jsonFileType);
        RegisteredUserLoginData = JsonReader.getDataAsMap(dataToBeUsed,"LoginCredentials", "RegisteredUser_Login");
        InvalidUser_Login = JsonReader.getDataAsMap(dataToBeUsed,"LoginCredentials", "InvalidUser_Login");
        }
        catch (Exception ex){
            System.out.println("Exception File Not Found");
        }
    }
    public static String getTestDataAsString(String mainObject, String identifier, String value){
        return JsonReader.fetchDataJsonObjectArrayObject(dataToBeUsed,mainObject, identifier, value);
    }

}
