package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import models.*;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    public Result index() {
        return ok(Json.toJson("Welcome to backend!"));
    }

}
