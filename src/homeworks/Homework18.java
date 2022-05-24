package homeworks;

import java.util.Arrays;

public class Homework18 {

    // =========================== Task 1 Method ===========================
    public static String noSpace(String userString) {
        userString = userString.replaceAll(" ","");
        return userString;
    }

    // =========================== Task 2 Method ===========================
    public static String replaceFirstLast(String userString) {
        userString = userString.trim();
        if (userString.length() < 2) return "";
        userString = userString.charAt(userString.length() - 1) + userString.substring(1, userString.length() - 1) + userString.charAt(0);

        return userString;
    }

    // =========================== Task 3 Method ===========================
    public static boolean hasVowel(String userString) {
        boolean hasVowel = false;

        for (int i = 0; i < userString.length(); i++) {
            userString = userString.toLowerCase();
            if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u' ) {
                hasVowel = true;
            }
        }
        return hasVowel;
    }

    // =========================== Task 4 Method ===========================
    public static String checkAge(int yearOfBirth) {
        String good = "AGE IS ALLOWED";
        String bad = "AGE IS NOT ALLOWED";
        String invalid = "AGE IS NOT VALID";

        if (yearOfBirth >= 2006 && yearOfBirth < 2022) return bad;
        if (yearOfBirth <= 2005 && yearOfBirth > 1922) return good;
        return invalid;
    }

    // =========================== Task 5 Method ===========================
    public static int averageOfEdges(int num1, int num2, int num3) {
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        int avg =  0;
        avg = (max + min) / 2;
        return avg;
    }

    // =========================== Task 6 Method ===========================
    public static String[] noA(String[] userStrArr) {

        for (int i = 0; i < userStrArr.length; i++) {
            if(userStrArr[i].startsWith("a") || userStrArr[i].startsWith("A")) {
                userStrArr[i] = "###";
            }
        }
        return userStrArr;
    }

    // =========================== Task 7 Method ===========================
    public static int[] no3or5(int[] userNumArr) {
        for (int i = 0; i < userNumArr.length; i++) {
            if(userNumArr[i] % 3 == 0 && userNumArr[i] % 5 == 0) {
                userNumArr[i] = 101;
            } else if (userNumArr[i] % 5 == 0) {
                userNumArr[i] = 99;
            } else if (userNumArr[i] % 3 == 0) userNumArr[i] = 100;
        }
        return userNumArr;
    }

    // =========================== Task 8 Method ===========================
    public static int countPrimes(int[] userNumArr) {
        int primeCounter = 0;
        for (int object : userNumArr) {
            boolean isItPrime = false;
            int factors = 0;
            int j = 1;
            while(j <= object) {
                if(object % j == 0)
                {
                    factors++;
                }
                j++;
            }
            if (factors == 2) isItPrime = true;
            if (isItPrime) primeCounter++;
        }
        return primeCounter;
    }

    public static void main(String[] args) {

        // ============================= Task 1 =============================
        System.out.println("************ Task 1 ************");

        String taskOneTestData = " Hello World   ";
        System.out.println(noSpace(taskOneTestData));

        // ============================= Task 2 =============================
        System.out.println("************ Task 2 ************");

        String taskTwoTestData = "Tech Global";
        System.out.println(replaceFirstLast(taskTwoTestData));

        // ============================= Task 3 =============================
        System.out.println("************ Task 3 ************");

        String taskThreeTestData = "1234";
        System.out.println(hasVowel(taskThreeTestData));

        // ============================= Task 4 =============================
        System.out.println("************ Task 4 ************");

        int taskFourTestData = 1800;
        System.out.println(checkAge(taskFourTestData));

        // ============================= Task 5 =============================
        System.out.println("************ Task 5 ************");

        int taskFiveTestData1 = -3;
        int taskFiveTestData2 = 15;
        int taskFiveTestData3 = -3;
        System.out.println(averageOfEdges(taskFiveTestData1, taskFiveTestData2, taskFiveTestData3));

        // ============================= Task 6 =============================
        System.out.println("************ Task 6 ************");

        String[] taskSixTestData = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(taskSixTestData)));

        // ============================= Task 7 =============================
        System.out.println("************ Task 7 ************");

        int[] taskSevenTestData = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(taskSevenTestData)));

        // ============================= Task 8 =============================
        System.out.println("************ Task 8 ************");

        int[] taskEightTestData = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(taskEightTestData));
    }
}
