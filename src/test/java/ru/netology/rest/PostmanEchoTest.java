package ru.netology.rest;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostmanEchoTest {
    @Test
    public void shouldPostRawTextTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("testing text")
                .when()
                .post("/post")
                .then()
                .statusCode(401)
                .body("data", equalTo("testing text"));
    }
}