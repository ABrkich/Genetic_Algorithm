package utils;

import org.json.JSONObject;


public class Services {

    public static JSONObject initializeServices()
    {
        JSONObject returnObj = new JSONObject();

        JSONObject S1 = new JSONObject();
        S1.put("name", "S1");
        JSONObject S2 = new JSONObject();
        S2.put("name", "S2");
        JSONObject S3 = new JSONObject();
        S3.put("name", "S3");


        //read in S1 services
        JSONObject S11 = new JSONObject();
        S11.put("name", "1");
        S11.put("cost", 0.667);
        S11.put("reliability", 0.959);
        S11.put("time", 0.087);
        S11.put("availability", 0.969);

        JSONObject S12 = new JSONObject();
        S12.put("name", "2");
        S12.put("cost", 1);
        S12.put("reliability", 1);
        S12.put("time", 0.13);
        S12.put("availability", 0.908);

        JSONObject S13 = new JSONObject();
        S13.put("name", "3");
        S13.put("cost", 0.767);
        S13.put("reliability", 0.989);
        S13.put("time", 1);
        S13.put("availability", 1);

        JSONObject S14 = new JSONObject();
        S14.put("name", "4");
        S14.put("cost", 0.4);
        S14.put("reliability", 1);
        S14.put("time", 0.043);
        S14.put("availability", 0.02);

        JSONObject S15 = new JSONObject();
        S15.put("name", "5");
        S15.put("cost", 0.833);
        S15.put("reliability", 0.898);
        S15.put("time", 0.13);
        S15.put("availability", 0.796);

        //read in S2 Services
        JSONObject S21 = new JSONObject();
        S21.put("name", "1");
        S21.put("cost", 0.226);
        S21.put("reliability", 0.707);
        S21.put("time", 0.375);
        S21.put("availability", 0.728);

        JSONObject S22 = new JSONObject();
        S22.put("name", "2");
        S22.put("cost", 0.283);
        S22.put("reliability", 1);
        S22.put("time", 0.625);
        S22.put("availability", 0.969);

        JSONObject S23 = new JSONObject();
        S23.put("name", "3");
        S23.put("cost", 1);
        S23.put("reliability", 0.969);
        S23.put("time", 1);
        S23.put("availability", 1);

        JSONObject S24 = new JSONObject();
        S24.put("name", "4");
        S24.put("cost", 0.1);
        S24.put("reliability", 1);
        S24.put("time", 0.1);
        S24.put("availability", 1);

        JSONObject S25 = new JSONObject();
        S25.put("name", "5");
        S25.put("cost", 0.1);
        S25.put("reliability", 1);
        S25.put("time", 0.1);
        S25.put("availability", 1);

        JSONObject S26 = new JSONObject();
        S26.put("name", "6");
        S26.put("cost", 0.1);
        S26.put("reliability", 1);
        S26.put("time", 0.1);
        S26.put("availability", 1);

        //read in S3 services
        JSONObject S31 = new JSONObject();
        S31.put("name", "1");
        S31.put("cost", 0.478);
        S31.put("reliability", 1);
        S31.put("time", 0.75);
        S31.put("availability", 0.99);

        JSONObject S32 = new JSONObject();
        S32.put("name", "2");
        S32.put("cost", 0.522);
        S32.put("reliability", 0.918);
        S32.put("time", 1);
        S32.put("availability", 0.908);

        JSONObject S33 = new JSONObject();
        S33.put("name", "3");
        S33.put("cost", 0.522);
        S33.put("reliability", 0.928);
        S33.put("time", 0.83);
        S33.put("availability", 0.918);

        JSONObject S34 = new JSONObject();
        S34.put("name", "4");
        S34.put("cost", 0.652);
        S34.put("reliability", 0.938);
        S34.put("time", 0.25);
        S34.put("availability", 1);

        JSONObject S35 = new JSONObject();
        S35.put("name", "5");
        S35.put("cost", 0.783);
        S35.put("reliability", 0.577);
        S35.put("time", 0.5);
        S35.put("availability", 0.571);

        JSONObject S36 = new JSONObject();
        S36.put("name", "6");
        S36.put("cost", 1);
        S36.put("reliability", 0.701);
        S36.put("time", 0.167);
        S36.put("availability", 0.684);

        JSONObject S37= new JSONObject();
        S37.put("name", "7");
        S37.put("cost", 0.957);
        S37.put("reliability", 0.608);
        S37.put("time", 0.083);
        S37.put("availability", 0.602);

        JSONObject S38 = new JSONObject();
        S38.put("name", "8");
        S38.put("cost", 0.913);
        S38.put("reliability", 0.948);
        S38.put("time", 0.167);
        S38.put("availability", 0.908);

        //push services to service list
        S1.put("S11",S11);
        S1.put("S12",S12);
        S1.put("S13",S13);
        S1.put("S14",S14);
        S1.put("S15",S15);

        S2.put("S21", S21);
        S2.put("S22", S22);
        S2.put("S23", S23);
        S2.put("S24", S24);
        S2.put("S25", S25);
        S2.put("S26", S26);

        S3.put("S31", S31);
        S3.put("S32", S32);
        S3.put("S33", S33);
        S3.put("S34", S34);
        S3.put("S35", S35);
        S3.put("S36", S36);
        S3.put("S37", S37);
        S3.put("S37", S38);

        returnObj.put("S1", S1);
        returnObj.put("S2", S2);
        returnObj.put("S3", S3);

        return returnObj;
    }
}
