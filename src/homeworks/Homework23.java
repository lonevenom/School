package homeworks;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Homework23 {

    // ============================= Task 1 =============================
    public static HashMap<Integer, String> parseData(String value){
        //Fetch all Integers from String and store in Integer ArrayList
        ArrayList<String> strKeys = new ArrayList<>();
        ArrayList<Integer> intKeys = new ArrayList<>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m1 = p.matcher(value);
        while(m1.find()) {strKeys.add(m1.group());}
        for (String object : strKeys) {intKeys.add(Integer.parseInt(object));}
        //Fetch all Locations from String and store in ArrayList
        ArrayList<String> locations = new ArrayList<>();
        Pattern k = Pattern.compile("[a-zA-Z]+");
        Matcher m2 = k.matcher(value);
        while(m2.find()) {locations.add(m2.group());}
        //Add both keys and values to HashMap
        HashMap<Integer, String> answer = new HashMap<Integer, String>();
        for (int v = 0; v < intKeys.size(); v++) {
            answer.put(intKeys.get(v), locations.get(v));
        }
        return answer;
    }
    // ============================= Task 2 =============================
    public static double calculateTotalPrice1(HashMap<String, Integer> userMap){
        ArrayList<Integer> numOfFruit = new ArrayList<>(userMap.values());
        ArrayList<String> typeOfFruit = new ArrayList<>(userMap.keySet());
        double[] totalPriceOfEachItem = new double[userMap.size()];
        //Storing prices in a Hashmap
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Apple", 2.00);
        prices.put("Orange", 3.29);
        prices.put("Mango", 4.99);
        prices.put("Pineapple", 5.25);
        /* === if you want to print out the prices that will be used ===
        for (int i = 0; i < userMap.size(); i++) {
            System.out.println(prices.get(typeOfFruit.get(i)));
        }*/
        for (int i = 0; i < userMap.size(); i++) {
            double v = prices.get(typeOfFruit.get(i)) * numOfFruit.get(i);
            totalPriceOfEachItem[i] = v;
        }
        return DoubleStream.of(totalPriceOfEachItem).sum();
    }
    // ============================= Task 3 =============================
    public static double calculateTotalPrice2(HashMap<String, Integer> userMap){
        ArrayList<Integer> numOfFruit = new ArrayList<>(userMap.values());
        ArrayList<String> typeOfFruit = new ArrayList<>(userMap.keySet());
        double[] totalPriceOfEachItem = new double[userMap.size()];
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Apple", 2.00);
        prices.put("Orange", 3.29);
        prices.put("Mango", 4.99);
        prices.put("Pineapple", 5.25);
        for (int i = 0; i < numOfFruit.size(); i++) {
            double v = 0.0;
            if (typeOfFruit.get(i).equals("Apple")) {
                if (numOfFruit.get(i) % 2 == 0) v = numOfFruit.get(i) * (prices.get(typeOfFruit.get(i)) * .75);
                else v = ((numOfFruit.get(i) - 1) * ((prices.get(typeOfFruit.get(i)) * .75)) + 2.00);
            } else if (typeOfFruit.get(i).equals("Mango")) {
                if (numOfFruit.get(i) < 4) v = prices.get(typeOfFruit.get(i)) * numOfFruit.get(i);
                int howManyFreeFromFruitCount = numOfFruit.get(i) / 4;
                v = prices.get(typeOfFruit.get(i)) * (numOfFruit.get(i) - howManyFreeFromFruitCount);
            } else {
                v = prices.get(typeOfFruit.get(i)) * numOfFruit.get(i);
            }
            totalPriceOfEachItem[i] = v;
        }
        return DoubleStream.of(totalPriceOfEachItem).sum();
    }


    public static void main(String[] args){
        // ============================= Task 1 =============================
        System.out.println("************ Task 1 ************");

        String testData1 = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
        System.out.println(parseData(testData1));

        // ============================= Task 2 =============================
        System.out.println("************ Task 2 ************");

        HashMap<String, Integer> testData2 = new HashMap<>();
        testData2.put("Apple", 2);
        testData2.put("Pineapple", 1);
        testData2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(testData2));

        // ============================= Task 3 =============================
        System.out.println("************ Task 3 ************");

        HashMap<String, Integer> testData3 = new HashMap<>();
        testData3.put("Apple", 3);
        testData3.put("Mango", 8);
        testData3.put("Orange", 3);

        System.out.println(calculateTotalPrice2(testData3));
    }

}