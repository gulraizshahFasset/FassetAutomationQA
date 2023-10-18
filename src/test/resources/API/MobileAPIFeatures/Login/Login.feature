@UserLogin
Feature: Login User
  Background: Background variables
    * url baseURL
    * def JavaData = Java.type('com.fasset.automation.JavaFunctionsAPI.DataReader.EnvConfig')
    * def payloadsData = read('../../payloads/devDataAPI.json')
    * def pathsTo = read('../../support/paths.json')

   @API @loginUserWithValidCredentials
  Scenario: Login User
    * def RegisteredUserLoginPayload = payloadsData.LoginCredentials.RegisteredUser_Login
    Given path pathsTo.MobileAPI.Login
    And request RegisteredUserLoginPayload
    When method POST
    Then status 200
    And match response.code == 200
    And match response.message == "Login successful"
    And match response.result.accessToken != null
#    * def accessToken = "Bearer "+response.result.accessToken
