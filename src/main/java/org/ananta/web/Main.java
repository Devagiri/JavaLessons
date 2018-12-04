package org.ananta.web;

import spark.Request;
import spark.Response;


public class Main {

    public static void main(String[] args) {

        spark.Spark.get("/", (Request req, Response res) -> "<html><head></head><body>привет<br><a href='/contacts'>Contacts</a></body></html>");
        spark.Spark.get("/contacts", (Request req, Response res) -> "телефон: 5555555");
    }

}