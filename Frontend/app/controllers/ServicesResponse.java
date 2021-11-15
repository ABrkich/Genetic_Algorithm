package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLConnection;

public class ServicesResponse {

    public static JsonNode getServices() {

        try {
            URL url = new URL("http://localhost:9005/services");

            URLConnection connection = null;

            connection = url.openConnection();


            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String i = br.readLine();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode outNode = mapper.readTree(i);

            System.out.println(outNode);

            return outNode;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
