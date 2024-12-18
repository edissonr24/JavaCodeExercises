package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;

public class Exercises04 {

    private static final String BARCODE_URL = "https://jsonmock.hackerrank.com/api/inventory?barcode=";

    public static void main(String[] args) throws IOException, ParseException {

        int total = getDiscountedPrice(74000548);
        //int total = getDiscountedPrice(74001777);
        System.out.println("Total: " + total);

    }


    public static int getDiscountedPrice(int barcode) throws IOException {

        int discountedPrice = -1;
        String apiUrl = BARCODE_URL + String.valueOf(barcode);
        URL url = new URL(apiUrl);

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.setRequestProperty("Accept", "application/json");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputText;
        StringBuilder content = new StringBuilder();
        while ((inputText = bufferedReader.readLine()) != null) {
            content.append(inputText);
        }

        bufferedReader.close();
        urlConnection.disconnect();

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonResponse = null;
        try {
            jsonResponse = (JSONObject) jsonParser.parse(content.toString());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        JSONArray jsonArray = (JSONArray) jsonResponse.get("data");

        if (jsonArray.size() == 1) {
            JSONObject product = (JSONObject) jsonArray.get(0);
            Long price = (Long) product.get("price");
            Long discount = (Long) product.get("discount");
            /*System.out.println("Price: " + price);
            System.out.println("Discount: " + discount);*/

            double discountedPriceb = price - ((discount / 100.0) * price);
            System.out.println("discountedPriceb: " + discountedPriceb);
            discountedPrice = (int) Math.round(discountedPriceb);
            System.out.println("discountedPrice: " + discountedPrice);

            //discountedPrice = (int) (price - ((discount / 100.0) * price));

        }
        return discountedPrice;
    }

}
