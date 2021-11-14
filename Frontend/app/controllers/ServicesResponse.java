package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class ServicesResponse {

    private String Service1;
    private String Service2;
    private String Service3;
    private double fitness;

    public String getService1(){return this.Service1;}
    public String getService2(){return this.Service2;}
    public String getService3(){return this.Service3;}
    public double getFitness(){return this.fitness;}

    public static CompletionStage<WSResponse> getServices() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/services");
        ObjectNode res = Json.newObject();
        res.put("Service 1", this.Service1);
        res.put("Service 2", this.Service2);
        res.put("Service 3", this.Service3);
        res.put("fitness", this.fitness);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
