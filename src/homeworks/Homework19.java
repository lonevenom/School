package homeworks;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Homework19 {

    // =========================== Task 1 Method ===========================
    public static String noDigit(String userString) {
        userString = userString.replaceAll("[0-9]","");
        return userString;
    }

    // =========================== Task 2 Method ===========================
    public static String noVowel(String userString) {
        userString = userString.replaceAll("[AEIOUaeiou]", "");
        return userString;
    }

    // =========================== Task 3 Method ===========================
    public static int sumOfDigits(String userString) {
        int sum = 0;

        userString = userString.replaceAll("\\D", "");
        int[] newArr = userString.chars().map(Character::getNumericValue).toArray();
        for (int object : newArr) {
            sum += object;
        }
        return sum;
    }
    // =========================== Task 4 Method ===========================
    public static boolean hasUpperCase(String userString) {
        return (userString.matches(".*[A-Z].*"));
    }
    // =========================== Task 5 Method ===========================
    public static int middleInt(int num1, int num2, int num3) {
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        if (num1 != max && num1 != min) return num1;
        else if (num2 != max && num2 != min) return num2;
        else return num3;
    }
    // =========================== Task 6 Method ===========================
    public static int[] no13(int[] userArr) {
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i] == 13) {
                userArr[i] = 0;
            }
        } return userArr;
    }
    // =========================== Task 7 Method ===========================
    public static int[] arrFactorial(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) num[i] = 1;
            int total = 1;
            for (int j = num[i]; j > 0; j--) {
                total *= j;
            }
            num[i] = total;
        }
        return num;
    }

    // =========================== Task 8 Method ===========================
    public static String[] categorizeCharacters(String userString) {
        String[] strArr = {"", "", ""};
        userString = userString.replaceAll("\\s", "");
        for (char object : userString.toCharArray()) {
            if (Character.isLetter(object)) {
                strArr[0] += "" + object;
            }
            else if (Character.isDigit(object)) {
                strArr[1] += "" + object;
            }
            else if (!Character.isSpaceChar(object)) {
                strArr[2] += "" + object;
            }
        }
        return strArr;
    }
    public static void main(String[] args) {

        // ============================= Task 1 =============================
        System.out.println("************ Task 1 ************");

        String taskOneTestData = "noVowel";
        System.out.println(noDigit(taskOneTestData));

        // ============================= Task 2 =============================
        System.out.println("************ Task 2 ************");

        String taskTwoTestData = "JAVA";
        System.out.println(noVowel(taskTwoTestData));

        // ============================= Task 3 =============================
        System.out.println("************ Task 3 ************");

        String taskThreeTestData = "John’s age is 29";
        System.out.println(sumOfDigits(taskThreeTestData));

        // ============================= Task 4 =============================
        System.out.println("************ Task 4 ************");

        String taskFourTestData = "s";
        System.out.println(hasUpperCase(taskFourTestData));

        // ============================= Task 5 =============================
        System.out.println("************ Task 5 ************");

        int num1 = -1;
        int num2 = 25;
        int num3 = 10;
        System.out.println(middleInt(num1, num2, num3));

        // ============================= Task 6 =============================
        System.out.println("************ Task 6 ************");

        int[] userArr = {13,13,3,13,13};
        System.out.println(Arrays.toString(no13(userArr)));

        // ============================= Task 7 =============================
        System.out.println("************ Task 7 ************");

        int[] arrInput = {0,2,4,1};
        System.out.println(Arrays.toString(arrFactorial(arrInput)));

        // ============================= Task 8 =============================
        System.out.println("************ Task 8 ************");

        String taskEightTestData = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(taskEightTestData)));


    }
}