package Pratice;

import java.util.Map;
import java.util.HashMap;

public class ServiceStation {
    public static void main(String[] args) {
        System.out.println(generateBill("Hatchback", new String[]{"BS01", "EF01"}));
        System.out.println(generateBill("Sedan", new String[]{"BS01", "EF01", "CF01"}));
        System.out.println(generateBill("SUV", new String[]{"BF01", "GF01"}));
    }

    public static String generateBill(String carType, String[] serviceCodes) {
        int totalBill = 0;
        Map<String, Map<String, Integer>> services = new HashMap<>();
        services.put("BS01", new HashMap<String, Integer>() {{
            put("Hatchback", 2000);
            put("Sedan", 4000);
            put("SUV", 5000);
        }});
        services.put("EF01", new HashMap<String, Integer>() {{
            put("Hatchback", 5000);
            put("Sedan", 8000);
            put("SUV", 10000);
        }});
        services.put("CF01", new HashMap<String, Integer>() {{
            put("Hatchback", 2000);
            put("Sedan", 4000);
            put("SUV", 6000);
        }});
        services.put("BF01", new HashMap<String, Integer>() {{
            put("Hatchback", 1000);
            put("Sedan", 1500);
            put("SUV", 2500);
        }});
        services.put("GF01", new HashMap<String, Integer>() {{
            put("Hatchback", 3000);
            put("Sedan", 6000);
            put("SUV", 8000);
        }});

        for (String code : serviceCodes) {
            totalBill += services.get(code).get(carType);
        }

        if (totalBill > 10000) {
            return totalBill + " (complimentary cleaning provided)";
        } else {
            return String.valueOf(totalBill);
        }
    }
}

