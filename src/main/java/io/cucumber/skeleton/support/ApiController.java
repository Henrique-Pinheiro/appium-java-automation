package io.cucumber.skeleton.support;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class ApiController {


    protected static String ENDPOINT_DELETE_LINK_PAGAMENTO = "https://apihom.cielo.com.br/appcielo/v1/ecommerce/payment/link";
    protected static String ENDPOINT_POST_LOGIN = "http://apollo-core-ecscluster-hml-1454189126.sa-east-1.elb.amazonaws.com/api/apollo/user-login/v1/token";
    protected static String ENDPOINT_GET_LINK_PAGAMENTOS = "https://apihom.cielo.com.br/appcielo/v1/ecommerce/payment/link?size=1000&page=1";
    protected static String ENDPOINT_POST_NEW_LINK = "https://apihom.cielo.com.br/appcielo/v1/ecommerce/payment/link";
    protected static String ENDPOINT_GET_HELP_CENTER = "https://apihom.cielo.com.br/appcielo/v1/help/help-center";

    private String token = "";
    private String ec;
    private String username;
    private String password;

    public void setToken(String ec, String username, String password) {
        baseURI = ENDPOINT_POST_LOGIN;
        RequestSpecification request = given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("merchant", ec);
        requestParams.put("username", username);
        requestParams.put("password", password);
        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());
        Response response = request.post();
        JsonPath json = response.jsonPath();
//        response.prettyPrint();
        token = json.get("access_token").toString();
    }

    public void deleteAllLinks() {
        baseURI = ENDPOINT_GET_LINK_PAGAMENTOS;
        RequestSpecification request = given();
        JSONObject requestParams = new JSONObject();
        request.params("size", "1000");
        request.params("page", "1");
        request.header("Authorization", "Basic Wml0WmxOdlhnQXpiOmFXblB3SmJDdERuMA==");
        request.header("client_id", "ZitZlNvXgAzb");
        request.header("access_token", token);
        request.header("Content-Type", "application/json");
        Response response = request.get();
        JsonPath json = response.jsonPath();
//        System.out.println(token);
//        response.prettyPrint();
        int totalElements = json.get("pagination.totalElements");
        for (int i = 0; i < totalElements; i++) {
            deleteLink(json.get("items.id[" + i + "]"));
        }
    }

    private void deleteLink(String id) {
        baseURI = ENDPOINT_DELETE_LINK_PAGAMENTO;
        RequestSpecification request = given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("id", id);
        request.header("Authorization", "Basic Wml0WmxOdlhnQXpiOmFXblB3SmJDdERuMA==");
        request.header("client_id", "ZitZlNvXgAzb");
        request.header("Content-Type", "application/json");
        request.header("access_token", token);
        request.body(requestParams.toString());
        Response response = request.delete();
//        response.prettyPrint();
//        JsonPath json = response.jsonPath();
    }

    public void createLink(String linkName, int linkValue) {
        baseURI = ENDPOINT_POST_NEW_LINK;
        RequestSpecification request = given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", linkName);
        requestParams.put("price", linkValue);
        request.header("Authorization", "Basic Wml0WmxOdlhnQXpiOmFXblB3SmJDdERuMA==");
        request.header("client_id", "ZitZlNvXgAzb");
        request.header("access_token", token);
        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());
        Response response = request.post();
        JsonPath json = response.jsonPath();
//        json.prettyPrint();
    }

}