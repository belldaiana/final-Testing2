package com.example.minioDaianafinal.Test;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TestBackendAPI {
    @BeforeEach
    public void login() {
        RestAssured.baseURI = "https://parabank.parasoft.com/parabank/";

        Map<String, Object> jsonObject = new HashMap<>();
        jsonObject.put("username", "seb123");
        jsonObject.put("password", "seb123");

        given()
                .body(jsonObject)
                .and()
                .when()
                .post("login.html");

    }

    @Test
    @DisplayName("testRegistroURL")
    public void testRegistroURL() {
        Map<String, Object> jsonObject = new HashMap<>();

        jsonObject.put("customer.firstName", "Sebastian");
        jsonObject.put("customer.lastName", "Clay");
        jsonObject.put("customer.address.street", "calle 123");
        jsonObject.put("customer.address.city", "bs as");
        jsonObject.put("customer.address.state", "bs as");
        jsonObject.put("customer.address.zipCode", "1842bb");
        jsonObject.put("customer.phoneNumber", "(736) 416-5765");
        jsonObject.put("customer.ssn", "asd");
        jsonObject.put("customer.username", "seb123");
        jsonObject.put("customer.password", "seb123");

        given()
                .body(new Gson().toJson(jsonObject))
                .and()
                .when()
                .get("register.htm")
                .then()
                .statusCode(200);
    }

    @Test
    @DisplayName("testOpenNewAccountURL")
    public void testOpenNewAccountURL() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("customerId", "13893");
        jsonObject.put("newAccountType", "2");
        jsonObject.put("fromAccountId", "21114");


        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .body(jsonObject.toString())
                .when()
                .post("services_proxy/bank/createAccount?customerId=12545&newAccountType=1&fromAccountId=12551")
                .then()
                .statusCode(401);
    }

    @Test
    @DisplayName("testOverview")
    public void testOverview() {
        given()
                .when()
                .cookie("JSESSIONID", "707EDF2223CA9193E1F37DBCFC52C421")
                .get("overview.htm")
                .then()
                .statusCode(200);
    }

    @Test
    @DisplayName("testTransferFoundsURL")
    public void testTransferFoundsURL() {
        Integer fromAccountId = 13566;
        Integer toAccountId = 13677;
        Integer amount = 250;

        given()
                .cookie("JSESSIONID", "707EDF2223CA9193E1F37DBCFC52C421")
                .queryParams(Map.of("fromAccountId", fromAccountId,"toAccountId",toAccountId,"amount",amount))
                .when()
                .post("/services_proxy/bank/transfer")
                .then()
                .statusCode(200);

    }

    @Test
    @DisplayName("testActiveAccountAllMonth")
    public void testActiveAccountAllMonth() {
        given()
                .when()
                .cookie("JSESSIONID", "707EDF2223CA9193E1F37DBCFC52C421")
                .get("services_proxy/bank/accounts/13893/transactions/month/All/type/All")
                .then()
                .statusCode(200);

    }
}
