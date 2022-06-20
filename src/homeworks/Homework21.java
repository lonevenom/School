package homeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Homework21 {

    // =========================== Task 1 Method ===========================
    public static String fizzBuzz1(int userNum) {
        StringBuilder str = new StringBuilder("");

        String fB = "FizzBuzz";
        String f = "Fizz";
        String b = "Buzz";
        for (int i = 1; i < userNum + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println(fB);
            else if (i % 3 == 0) System.out.println(f);
            else if (i % 5 == 0) System.out.println(b);
            else System.out.println(i);
        }
        return "";
    }

    // =========================== Task 2 Method ===========================
    public static String fizzBuzz2(int userNum) {
        StringBuilder str = new StringBuilder("");

        String fB = "FizzBuzz";
        String f = "Fizz";
        String b = "Buzz";
        if (userNum % 3 == 0 && userNum % 5 == 0) System.out.println(fB);
        else if (userNum % 3 == 0) System.out.println(f);
        else if (userNum % 5 == 0) System.out.println(b);
        else System.out.println(userNum);
        return "";
    }
    
    // =========================== Task 3 Method ===========================
    public static int findSumNumbers(String str) {
        str = str.replaceAll("[^0-9]", " ");
        int sum = 0;
        String[] strArr = str.split(" ");
        for (String object : strArr) {
            if (object.length() > 0)
                sum += Integer.parseInt(object);
        }
        return sum;
    }
    
    // =========================== Task 4 Method ===========================
    public static int findBiggestNumber(String str) {
        str = str.replaceAll("[^0-9]", " ");
        int biggest = 0;
        int max = 0;
        String[] strArr = str.split(" ");
        for (String object : strArr) {
            if (object.length() > 0)
                biggest = Integer.parseInt(object);
            if (biggest > max) max = biggest;
        }
        return max;
    }
    
    // =========================== Task 5 Method ===========================
    public static String countSequenceOfCharacters(String str) { // (I wanted to solve without two loops)
        StringBuilder answer = new StringBuilder("");
        List<String> temp = new ArrayList<>();
        // aaAAA
        for (int i = 0, j = i + 1; i < str.length() - 1; i++, j++) {
            if (str.charAt(i) == str.charAt(j)) {
                temp.add("" + str.charAt(i));
                if (i == str.length() - 2) {
                    temp.add("" + str.charAt(i));
                    answer.append(temp.size());
                    answer.append(temp.get(0));
                }
            } else {
                temp.add("" + str.charAt(i));
                answer.append(temp.size());
                answer.append(temp.get(0));
                temp.clear();
                if (i == str.length() - 2) {
                    temp.add("" + str.charAt(j));
                    answer.append(temp.size());
                    answer.append(temp.get(0));
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        // ============================= Task 1 =============================
        System.out.println("************ Task 1 ************");

        int task1TestData = 18;
        System.out.println(fizzBuzz1(task1TestData));

        // ============================= Task 2 =============================
        System.out.println("************ Task 2 ************");

        int task2TestData = 15;
        System.out.println(fizzBuzz2(task2TestData));

        // ============================= Task 3 =============================
        System.out.println("************ Task 3 ************");

        String task3TestData = "abc2abca      bc123bv";
        System.out.println(findSumNumbers(task3TestData));

        // ============================= Task 4 =============================
        System.out.println("************ Task 4 ************");

        String task4TestData = "ab110c045d";
        System.out.println(findBiggestNumber(task4TestData));

        // ============================= Task 5 =============================
        System.out.println("************ Task 5 ************");

        String task5TestData = "aHHHbbdjwUq";
        System.out.println(countSequenceOfCharacters(task5TestData));
    }
}
