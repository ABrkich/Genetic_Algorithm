package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;

import javax.inject.Inject;
import java.util.Iterator;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;
    private Iterator it;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }



    /**
     * Index page
     *
     */
    public Result index() {
        return ok(views.html.index.render(""));
    }
    public Result services() {

        JsonNode response = ServicesResponse.getServices();
        String fitnessText = "The Fitness is " + response.get("Fitness");

        JsonNode responseServices = response.get("Services");

        String servicesText = null;
        if(responseServices.isArray()){

            servicesText = "The best route to chose is S1" + responseServices.get(0) + " to ";
            if(responseServices.get(1).intValue() == 1|| responseServices.get(1).intValue() == 2 || responseServices.get(1).intValue() == 3 ){

                servicesText += "S2" + responseServices.get(1) + " to ";

            }

            servicesText += "S3" + responseServices.get(2);

        }



        return ok(views.html.services.render(fitnessText,servicesText));
    }

    public Result servicesHandler(){
        JsonNode test = ServicesResponse.getServices();

        return ok(views.html.services.render("",""));

    }

}