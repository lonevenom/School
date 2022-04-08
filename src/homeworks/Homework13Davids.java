package homeworks;

import utilities.RandomNumberGenerator;

import java.util.ArrayList;

public class Homework13Davids {
    public static void main(String[] args) {

        // =========================   TASK 1   =========================
        System.out.println(" ********* TASK 1 ********* ");

        for (int i = 1; i < 11; i++) {
            if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("FooBar");
            } else if (i % 5 == 0) {
                System.out.println("Bar");
            } else if (i % 2 == 0) {
                System.out.println("Foo");
            } else {System.out.println(i);}
            }


        // =========================   TASK 2   =========================
        System.out.println(" ********* TASK 2 ********* ");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        int pos = 0;
        int neg = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (neg == 0) {
                if (numbers[i] <= -1) {
                    neg = numbers[i];
                }
            }
            if (pos == 0) {
                if (numbers[i] >= 1) {
                    pos = numbers[i];
                }
            }
        } System.out.println("First positive number is: " + pos);
          System.out.println("First negative number is: " + neg);


        // =========================   TASK 3   =========================
        System.out.println(" ********* TASK 3 ********* ");

        int num1 = RandomNumberGenerator.getRandomNumber(1,10);
        int[] randomNums = {
                RandomNumberGenerator.getRandomNumber(1,10),
                RandomNumberGenerator.getRandomNumber(1,10),
                RandomNumberGenerator.getRandomNumber(1,10),
                RandomNumberGenerator.getRandomNumber(1,10),
                RandomNumberGenerator.getRandomNumber(1,10)
        };
        boolean twoOrThree = false;
        for (int object : randomNums) {
            if (object == 2 || object == 3) {
                twoOrThree = true;
                break;
            }
        }
        System.out.println(twoOrThree);


        // =========================   TASK 4   =========================
        System.out.println(" ********* TASK 4 ********* ");

        String[] list = {"banana","orange","Apple"};
        boolean apple = false;
        for (String object : list) {
            if (object.equalsIgnoreCase("apple")){
                apple = true;
            }
        }
        System.out.println(apple);


        // =========================   TASK 5   =========================
        System.out.println(" ********* TASK 5 ********* ");

        int[] numbers1 = {10,20,30,50,70};
        int[] numbers2 = {20,50,70,100,300};
        for (int object : numbers1) {
            for (int i = 0; i <= numbers2.length -1; i++) {
                if (object == numbers2[i]) {
                    System.out.println(object);
                }
            }
        }


        // =========================   TASK 6   =========================
        System.out.println(" ********* TASK 6 ********* ");

        String str = "AhhHle";
        char[] charList = str.toCharArray();
        ArrayList<Character> duplicates = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (Character.toLowerCase(charList[i]) == Character.toLowerCase(charList[j])) {
                    boolean isInUpper = duplicates.contains(str.toUpperCase().charAt(i));
                    boolean isInLower = duplicates.contains(str.toLowerCase().charAt(i));

                    if (!(isInLower) && !(isInUpper)) {
                        duplicates.add(charList[i]);
                    }
                    break;
                }
            }
        }
        System.out.println("The string is:" + str);
            for (char object : duplicates) {
                System.out.println(object);
            }
    }
}
