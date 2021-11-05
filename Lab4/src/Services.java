import org.json.JSONObject;


public class Services {

    public JSONObject initializeServices()
    {
        JSONObject returnObj = new JSONObject();

        JSONObject S1 = new JSONObject();
        S1.put("name:", "S1");
        JSONObject S2 = new JSONObject();
        S1.put("name:", "S2");
        JSONObject S3 = new JSONObject();
        S1.put("name:", "S3");


        //read in S1 services
        JSONObject S11 = new JSONObject();
        S11.put("name:", "S11");
        S11.put("cost:", 20);
        S11.put("reliability:", 95);
        S11.put("time:", 2);
        S11.put("availability:", 95);

        JSONObject S12 = new JSONObject();
        S12.put("name:", "S12");
        S12.put("cost:", 30);
        S12.put("reliability:", 99);
        S12.put("time:", 3);
        S12.put("availability:", 89);

        JSONObject S13 = new JSONObject();
        S13.put("name:", "S13");
        S13.put("cost:", 23);
        S13.put("reliability:", 98);
        S13.put("time:", 23);
        S13.put("availability:", 98);

        JSONObject S14 = new JSONObject();
        S14.put("name:", "S14");
        S14.put("cost:", 12);
        S14.put("reliability:", 99);
        S14.put("time:", 1);
        S14.put("availability:", 2);

        JSONObject S15 = new JSONObject();
        S15.put("name:", "S15");
        S15.put("cost:", 25);
        S15.put("reliability:", 89);
        S15.put("time:", 3);
        S15.put("availability:", 78);

        //read in S2 Services
        JSONObject S21 = new JSONObject();
        S21.put("name:", "S21");
        S21.put("cost:", 12);
        S21.put("reliability:", 70);
        S21.put("time:", 3);
        S21.put("availability:", 70);

        JSONObject S22 = new JSONObject();
        S22.put("name:", "S22");
        S22.put("cost:", 15);
        S22.put("reliability:", 99);
        S22.put("time:", 5);
        S22.put("availability:", 93);

        JSONObject S23 = new JSONObject();
        S23.put("name:", "S23");
        S23.put("cost:", 53);
        S23.put("reliability:", 96);
        S23.put("time:", 8);
        S23.put("availability:", 96);

        //read in S3 services
        JSONObject S31 = new JSONObject();
        S31.put("name:", "S31");
        S31.put("cost:", 11);
        S31.put("reliability:", 97);
        S31.put("time:", 9);
        S31.put("availability:", 97);

        JSONObject S32 = new JSONObject();
        S32.put("name:", "S32");
        S32.put("cost:", 12);
        S32.put("reliability:", 89);
        S32.put("time:", 12);
        S32.put("availability:", 89);

        JSONObject S33 = new JSONObject();
        S33.put("name:", "S33");
        S33.put("cost:", 12);
        S33.put("reliability:", 90);
        S33.put("time:", 1);
        S33.put("availability:", 90);

        JSONObject S34 = new JSONObject();
        S34.put("name:", "S34");
        S34.put("cost:", 15);
        S34.put("reliability:", 91);
        S34.put("time:", 3);
        S34.put("availability:", 98);

        JSONObject S35 = new JSONObject();
        S35.put("name:", "S35");
        S35.put("cost:", 18);
        S35.put("reliability:", 56);
        S35.put("time:", 6);
        S35.put("availability:", 56);

        JSONObject S36 = new JSONObject();
        S36.put("name:", "S36");
        S36.put("cost:", 23);
        S36.put("reliability:", 68);
        S36.put("time:", 2);
        S36.put("availability:", 67);

        JSONObject S37= new JSONObject();
        S37.put("name:", "S37");
        S37.put("cost:", 22);
        S37.put("reliability:", 59);
        S37.put("time:", 1);
        S37.put("availability:", 59);

        JSONObject S38 = new JSONObject();
        S38.put("name:", "S38");
        S38.put("cost:", 21);
        S38.put("reliability:", 92);
        S38.put("time:", 2);
        S38.put("availability:", 89);

        //push services to service list
        S1.put("S11",S11);
        S1.put("S12",S12);
        S1.put("S13",S13);
        S1.put("S14",S14);
        S1.put("S15",S15);

        S2.put("S21", S21);
        S2.put("S22", S22);
        S2.put("S23", S23);

        S3.put("S31", S31);
        S3.put("S32", S32);
        S3.put("S33", S33);
        S3.put("S34", S34);
        S3.put("S35", S35);
        S3.put("S36", S36);
        S3.put("S37", S37);

        returnObj.put("S1", S1);
        returnObj.put("S2", S2);
        returnObj.put("S3", S3);

        return returnObj;
    }
}
