package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16Davids {

    // =========================== Task 1 Method ===========================
    public static int countWords(String str) {
        int counter = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') counter++;
        }
        return counter + 1;
    }

    // =========================== Task 2 Method ===========================
    public static int countA(String str) {
        int counter = 0;
        String[] newStr = str.split("");
        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i].equalsIgnoreCase("a")) counter++;
        }
        return counter;
    }

    // =========================== Task 3 Method ===========================
    public static int countPos(ArrayList<Integer> testData) {
        int counterPos = 0;
        for (int object : testData) {
            if (object > 0) counterPos++;
        }
        return counterPos;
    }

    // =========================== Task 4 Method ===========================
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> testData) {
        ArrayList<Integer> newLst = new ArrayList<>();
        for (Integer object : testData) {
            if (!newLst.contains(object)) {
                newLst.add(object);
            }
        }
        return newLst;
    }
    // =========================== Task 5 Method ===========================
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> testData) {
        ArrayList<String> newLst = new ArrayList<>();
        for (String object : testData) {
            if (!newLst.contains(object)) {
                newLst.add(object);
            }
        }
        return newLst;
    }
    // =========================== Task 6 Method ===========================
    public static String removeExtraSpaces(String str) {
        String[] newStr = str.trim().split("");
        String answer = "";
        int counter = 0;
        for (String object: newStr) {
            if (!object.equals(" ")) {
                counter = 0;
                answer += object;
            }
            if (object.equals(" ")) {
                counter++;
                if (counter <= 1) answer += object;
            }

        }
        return answer;
    }
    // =========================== Task 7 Method ===========================
    public static int[] add(int[] a, int[] b) {
        int[] c = new int[(int) Math.max(a.length, b.length)];
        for (int i = 0; i < c.length; i++) {
            if (a.length > i) {
                c[i] += a[i];
            }
            if (b.length > i) {
                c[i] += b[i];
            }
        }
        return c;
    }
    // =========================== Task 8 Method ===========================
    public static int findClosestTo10(int[] testData) {
        int closest = Integer.MAX_VALUE;

        for (int object: testData) {
            if (object > 10) {
                if (closest > object - 10)
                    closest = object - 10;
            } else if (object < 10) {
                if (closest > Math.abs(object - 10));
                    closest = Math.abs(object - 10);
            }
        }
        return closest;
    }

    public static void main(String[] args) {

        // ============================= Task 1 =============================
        System.out.println("************ Task 1 ************");

        String taskOneTestData = "      Java is fun       ";
        System.out.println(countWords(taskOneTestData));

        // ============================= Task 2 =============================
        System.out.println("************ Task 2 ************");

        String taskTwoTestData = "TechGlobal is a QA bootcamp";
        System.out.println(countA(taskTwoTestData));
        // ============================= Task 3 =============================
        System.out.println("************ Task 3 ************");

        Integer[] taskThreeData = {-45, 0, 0, 34, 5, 67};
        ArrayList<Integer> taskThreeTestData = new ArrayList<>(Arrays.asList(taskThreeData));
        System.out.println(countPos(taskThreeTestData));
        // ============================= Task 4 =============================
        System.out.println("************ Task 4 ************");

        Integer[] taskFourTestData = {10, 20, 35, 20, 35, 60, 70, 60};
        ArrayList<Integer> taskFourData = new ArrayList<>(Arrays.asList(taskFourTestData));
        System.out.println(removeDuplicateNumbers(taskFourData));
        // ============================= Task 5 =============================
        System.out.println("************ Task 5 ************");

        String[] taskFiveTestData = {"java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"};
        ArrayList<String> taskFiveData = new ArrayList<>(Arrays.asList(taskFiveTestData));
        System.out.println(removeDuplicateElements(taskFiveData));
        // ============================= Task 6 =============================
        System.out.println("************ Task 6 ************");

        String taskSixTestData = "    I   am      learning     Java";
        System.out.println(removeExtraSpaces(taskSixTestData));
        // ============================= Task 7 =============================
        System.out.println("************ Task 7 ************");

        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        // ============================= Task 8 =============================
        System.out.println("************ Task 8 ************");

        int[] taskEightTestData = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(taskEightTestData));
    }
}