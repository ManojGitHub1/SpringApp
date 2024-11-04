package com.manoj.myWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


// @Controller
// We use RestController is a RESTAPI(Representational State Transfer) returns data from server to client.
// Transfers Data from Server to Client not the layout of the page only the JSON data instead of view.
// REST uses HTTP methods
@RestController
public class HomeController {

    // ReqMapp is used to mapping of the request(like GET,POST,PUT,DELETE) to the method of the class.
    // CRED (create-POST, read-GET, update-PUT, delete-DELETE)
    // Response State Code
    // @RequestMapping("/home")
    // RespBody is used to return the data in the form of JSON. Used for REST API.
    // Used when @Controller is used not when @RestController
    @RequestMapping("/")
    @ResponseBody
    public String great(){
        return "Welcome Manoj!";
    }
    

    @RequestMapping("/about")
    public String about(){
        return "Welcome to About Page!";
    }

}
