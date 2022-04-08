package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework14Davids {

    // ========================== Task 1 Method ==========================

/* ===== Method that does not store or return =====
    public static void firstDupNumberInArray(int[] a) {
        int counter = 0;
        int duplicate = 0;
        boolean duplicates = false;

        for (int object: a) {
            for (int i = 0; i < a.length; i++) {
                if (object == a[i]) {
                    counter++;
                    if (counter==2) {duplicates = true; duplicate = object;}
                }
            }
            if (duplicates) break;
        }
        System.out.println((duplicates) ? (duplicate): "There is no duplicates");
    }
*/

    public static String firstDupNumberInArray(int[] a) {
        int counter = 0;
        int duplicate = 0;
        boolean duplicates = false;
        String answer = "";

        for (int object : a) {
            for (int i = 0; i < a.length; i++) {
                if (object == a[i]) {
                    counter++;
                    if (counter == 2) {
                        duplicates = true;
                        duplicate = object;
                        break;
                    }
                }
            }
            if (duplicates) break;
        }
        return (duplicates) ? ("" + duplicate) : "There is no duplicates";
    }

    // ========================== Task 2 Method ==========================
    public static String firstDupStringInArray(String[] a) {
        int counter = 0;
        String duplicate = "";
        boolean duplicates = false;

        for (String object : a) {
            for (int i = 0; i < a.length; i++) {
                if (object.equalsIgnoreCase(a[i])) {
                    counter++;
                    if (counter == 2) {
                        duplicates = true;
                        duplicate = object;
                        break;
                    }
                }
            }
            if (duplicates) break;
        }
        return (duplicates) ? (duplicate) : "There is no duplicates";
    }
    // ========================== Task 3 Method ==========================

    public static ArrayList<Integer> allDuplicatesInArray(int[] a) {
        int counter = 0;
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int object : a) {
            counter = 0;
            for (int i = 0; i < a.length; i++) {
                if (object == a[i]) {
                    counter++;
                    if (counter >= 2 && (!(duplicates.contains(object)))) {
                        duplicates.add(object);
                        break;
                    }
                }
            }
        }
        return duplicates;
    }

    // ========================== Task 4 Method ==========================

    public static ArrayList<String> allDupStringsInArray(String[] a) {
        int counter = 0;
        ArrayList<String> duplicates = new ArrayList<>();

        for (String object : a) {
            counter = 0;
            for (int i = 0; i < a.length; i++) {
                if (object.equalsIgnoreCase(a[i])) {
                    counter++;
                    boolean notContainLower = !(duplicates.contains(object.toLowerCase()));
                    boolean notContainUpper = !(duplicates.contains(object.toUpperCase()));
                    if (counter >= 2 && notContainUpper && notContainLower) {
                        duplicates.add(object);
                        break;
                    }
                }
            }
        }
        return duplicates;
    }

    // ========================== Task 5 Method ==========================
    public static String[] reverseStringArray (String[] a) {
        String[] revArray = new String [a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++)  {
            revArray[j] = a[i];
        }

    return revArray;
    }

    // ========================== Task 6 Method ==========================
    public static String[] reverseString (String a) {
        String[] stringArray = a.split(" ");
        String[] revStringArray = new String[stringArray.length];
        String tempStr = "";
        int counter = 0;

        for(String object: stringArray) {
            tempStr = "";
            for (int i = object.length() - 1, j = 0; i >= 0; i--, j++)  {
                tempStr += object.charAt(i);
            }
            revStringArray[counter] = tempStr;
            counter++;
        }
        return revStringArray;
    }

    public static void main(String[] args) {
        System.out.println("*********** TASK 1 ***********");
        int[] numbers = {-4, 99, -7, 99, 5, 10, 45, 45};
        String intDup = firstDupNumberInArray(numbers);
        System.out.println(intDup);

        System.out.println("*********** TASK 2 ***********");
        String[] words = {"Z", "abc", "z", "123", "#"};
        String stringDup = firstDupStringInArray(words);
        System.out.println(stringDup);

        System.out.println("*********** TASK 3 ***********");
        int[] testData3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        ArrayList<Integer> allDup = allDuplicatesInArray(testData3);
        if (allDup.size() == 0) {
            System.out.println("There is no duplicates");
        } else {
            for (int object : allDup) {
                System.out.println(object);
            }
        }

        System.out.println("*********** TASK 4 ***********");
        String[] testData4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        ArrayList<String> allStringDup = allDupStringsInArray(testData4);
        if (allDup.size() == 0) {
            System.out.println("There is no duplicates");
        } else {
            for (String object : allStringDup) {
                System.out.println(object);
            }
        }

        System.out.println("*********** TASK 5 ***********");
        String[] testData5 = {"abc", "foo", "bar"};
        String[] revStringArray = reverseStringArray(testData5);
        System.out.println(Arrays.toString(revStringArray));

        System.out.println("*********** TASK 6 ***********");
        String testData6 = "Java is fun";
        String[] taskSixAnswer = reverseString(testData6);
        String answer = "";
        for (String object:  taskSixAnswer) {
            answer += object + " ";
        }
        System.out.println(answer.substring(0, answer.length() - 1));

    }
}