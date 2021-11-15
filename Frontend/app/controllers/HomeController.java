package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletionStage;

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
        return ok(views.html.login.render(""));
    }

    public Result servicesHandler(){
        JsonNode test = ServicesResponse.getServices();

        System.out.println(test.get("Fitness"));

        return ok(views.html.login.render(""));

        /*ServicesResponse.getServices().thenApplyAsync((WSResponse r)->{

            if (r.getStatus() == 200 && r.asJson() != null) {

                String outString = "";

                JsonNode response = r.asJson();

                Iterator it = response.fieldNames();
                System.out.println(response.fields());

                while(it.hasNext()){
                    String key = it.next().toString();
                    JsonNode value = response.get(key);
                    System.out.println(value.toString());
                    if(value.toString() != "null"){
                        outString += key +":\t" + value + "\n";
                    }
                }


                return ok(views.html.services.render(outString));
            }
            else{
                return ok(views.html.services.render("No Title By That name"));
            }

        });*/
    }

}