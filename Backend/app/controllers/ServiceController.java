package controllers;

import org.jgap.InvalidConfigurationException;
import play.mvc.Result;
import utils.ServiceDecider;
import org.json.JSONObject;

import static play.mvc.Results.ok;

public class ServiceController {

    public Result services(){

        JSONObject receivedJson = new JSONObject();

        try {
            receivedJson = ServiceDecider.serviceGenes();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }


        return ok(receivedJson.toString());

    }

}
