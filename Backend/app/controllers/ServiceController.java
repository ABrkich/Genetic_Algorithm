package controllers;

import org.jgap.InvalidConfigurationException;
import play.mvc.Result;
import utils.ServiceDecider;

import static play.mvc.Results.ok;

public class ServiceController {

    public Result services(){


        try {
            ServiceDecider.serviceGenes();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }


        return ok("ok");

    }

}
