package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {

            // ======================= TASK 1 Method =======================
            public static int countMultipleWords(String[] testData) {
                int counter = 0;
                for (String object : testData) {
                    object = object.trim();
                    if (object.contains(" ")) {
                        counter++;
                    }
                }
                return counter;
            }
            // ======================= TASK 2 Method =======================
            public static ArrayList<Integer> removeNegatives(ArrayList<Integer> testData) {
                testData.removeIf(object -> object < 0);
                return testData;
            }
            // ======================= TASK 3 Method =======================
            public static boolean validatePassword(String testData) {
                String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*'\"\\-])(?=\\S+$).{8,16}$";
                return (testData.matches(pattern));
            }
             // ======================= TASK 4 Method =======================
             public static boolean validateEmailAddress(String testData) {

                 String pattern = "^([a-z A-Z]).{2,}@([a-z A-Z]).{2,}.([a-z A-Z]).{2,}$";
                 return (testData.matches(pattern));
             }

        public static void main(String[] args) {

            // =========================== TASK 1 ===========================
            System.out.println("********** TASK 1 **********\n");

            String[] taskOneTestData = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
            int answer = countMultipleWords(taskOneTestData);
            System.out.println(answer);


            // =========================== TASK 2 ===========================
            System.out.println("\n********** TASK 2 **********\n");

            Integer[] a = {2, -5, 6, 7, -10, -78, 0, 15};
            ArrayList<Integer> taskTwoTestData = new ArrayList<>(Arrays.asList(a));
            System.out.println(removeNegatives(taskTwoTestData));

            // =========================== TASK 3 ===========================
            System.out.println("\n********** TASK 3 **********\n");

            String taskThreeTestData = "Abcd123!";
            System.out.println(validatePassword(taskThreeTestData));


            // =========================== TASK 4 ===========================
            System.out.println("\n********** TASK 4 **********\n");

            String taskFourTestData = "abcd@gmail.com";
            System.out.println(validateEmailAddress(taskFourTestData));

    }

}
