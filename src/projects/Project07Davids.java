package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07Davids {

    //   ====================== TASK 1 METHOD ======================
    public static int[] taskOneMethod(int[] userArray) {
        int smallest = 0;
        int greatest = 0;
        if (userArray.length == 1) {
            smallest = userArray[0];
            greatest = userArray[0];
        } else if (userArray.length > 1) {
            Arrays.sort(userArray);
            smallest = userArray[0];
            greatest = userArray[userArray.length - 1];
        }
        int[] answer = {smallest, greatest};
        return answer;
    }

    //   ====================== TASK 2 METHOD ======================
    public static int[] taskTwoMethod(int[] testData) {
        int smallest = 0;
        int greatest = 0; // 10
        if (testData.length == 1) {
            smallest = testData[0];
            greatest = testData[0];
        } else if (testData.length > 1) {
            for (int i = 0, j = i + 1; i < testData.length; i++, j++) {
                if (i == testData.length - 1) {
                    break;
                }
                if (i >= testData[j]) {
                    greatest = testData[i];
                }
                if (i <= testData[j]) {
                    smallest = testData[i];
                }
            }
        }
        int[] answer = {smallest, greatest};
        return answer;
    }

    //   ====================== TASK 3 METHOD ======================
    public static int[] taskThreeMethod(int[] userNumbers) {
        int secondSmallest = 0;
        int secondGreatest = 0;
        Arrays.sort(userNumbers);
        if (userNumbers.length == 1) {
            secondSmallest = userNumbers[0];
            secondGreatest = userNumbers[0];
        } else if (userNumbers.length == 2) {
            secondSmallest = userNumbers[0];
            secondGreatest = userNumbers[1];
        } else if (userNumbers.length > 2) {
            secondSmallest = userNumbers[1];
            secondGreatest = userNumbers[userNumbers.length - 2];
            for (int i = 0, j = i + 1; i < userNumbers.length / 2 - 1; i++, j++) {
                if (userNumbers[i] == userNumbers[j]) {
                    secondSmallest = userNumbers[j];
                    if (secondSmallest != userNumbers[j + 1]) {
                        secondSmallest = userNumbers[j + 1];
                    }
                }
            } // 5 5 8 13 22 29 34 45 45
            for (int i = userNumbers.length - 1, j = userNumbers.length - 2; i > userNumbers.length / 2 + 1; i--, j--) {
                if (userNumbers[i] == userNumbers[j]) {
                    secondGreatest = userNumbers[j];
                    if (secondGreatest != userNumbers[j - 1]) {
                        secondGreatest = userNumbers[j - 1];
                    }
                }
            }
        }

        int[] answer = {secondSmallest, secondGreatest};
        return answer;
    }

    //   ====================== TASK 4 METHOD ======================
    public static int[] taskFourMethod(int[] userList) {
        int secondSmallest = 0;
        int secondGreatest = 0;
        // The following for loop is to sort the userList
        for (int i = 0; i < userList.length; i++) {
            for (int j = i + 1; j < userList.length; j++) {
                int tmp = 0;
                if (userList[i] > userList[j]) {
                    tmp = userList[i];
                    userList[i] = userList[j];
                    userList[j] = tmp;
                }
            }
        } // ---
        if (userList.length == 1) {
            secondSmallest = userList[0];
            secondGreatest = userList[0];
        } else if (userList.length == 2) {
            secondSmallest = userList[0];
            secondGreatest = userList[1];
        } else if (userList.length > 2) {
            secondSmallest = userList[1];
            secondGreatest = userList[userList.length - 2];
            for (int i = 0, j = i + 1; i < userList.length / 2 - 1; i++, j++) {
                if (userList[i] == userList[j]) {
                    secondSmallest = userList[j];
                    if (secondSmallest != userList[j + 1]) {
                        secondSmallest = userList[j + 1];
                    }
                }
            }
            for (int i = userList.length - 1, j = userList.length - 2; i > userList.length / 2 + 1; i--, j--) {
                if (userList[i] == userList[j]) {
                    secondGreatest = userList[j];
                    if (secondGreatest != userList[j - 1]) {
                        secondGreatest = userList[j - 1];
                    }
                }
            }
        }

        int[] answer = {secondSmallest, secondGreatest};
        return answer;
    }

    //   ====================== TASK 5 METHOD ======================
    public static ArrayList<String> taskFiveMethod(String[] userStrArray) {
        ArrayList<String> duplicates = new ArrayList<>();

        for (String object : userStrArray) {
            int counter = 0;
            for (int i = 0; i < userStrArray.length; i++) {
                if (object.equals(userStrArray[i])) {
                    counter++;
                }
                if (i == userStrArray.length - 1 && counter >= 2) {
                    boolean present = duplicates.contains(object);
                    if (!present) {
                        duplicates.add(object);
                    }
                }
            }
        } return duplicates;
    }

    //   ====================== TASK 6 METHOD ======================
    public static String taskSixMethod(String[] userStrArray) {
        String biggest = "";
        int counter2 = 0;

        for (String object : userStrArray) {
            int counter = 0;

            for (int i = 0; i < userStrArray.length; i++) {
                if (object.equals(userStrArray[i])) {
                    counter++;
                }
                if (i == userStrArray.length - 1 && counter >= 2 && counter > counter2) {
                        counter2 = counter;
                        biggest = object;
                    }
                }
            } return biggest;
        }


    public static void main(String[] args) {

        System.out.println("******* TASK 1 *******");

        int[] methodOneTestData = {10,7,7,10,-3,10,-3};
        methodOneTestData = taskOneMethod(methodOneTestData);
        System.out.println("Smallest = " + methodOneTestData[0]);
        System.out.println("Greatest = " + methodOneTestData[1]);

        System.out.println("******* TASK 2 *******");

        int[] methodTwoTestData = {10,7,7,10,-3,10,-3};
        methodTwoTestData = taskTwoMethod(methodTwoTestData);
        System.out.println("Smallest = " + methodTwoTestData[0]);
        System.out.println("Greatest = " + methodTwoTestData[1]);

        System.out.println("******* TASK 3 *******");

        int[] methodThreeTestData = {10, 5, 6, 7, 8, 5, 15, 15};
        methodThreeTestData = taskThreeMethod(methodThreeTestData);
        System.out.println("Second Smallest = " + methodThreeTestData[0]);
        System.out.println("Second Greatest = " + methodThreeTestData[1]);

        System.out.println("******* TASK 4 *******");

        int[] methodFourTestData = {10, 5, 6, 7, 8, 5, 15, 15};
        methodFourTestData = taskFourMethod(methodFourTestData);
        System.out.println("Second Smallest = " + methodFourTestData[0]);
        System.out.println("Second Greatest = " + methodFourTestData[1]);

        System.out.println("******* TASK 5 *******");

        String[] methodFiveTestData = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        ArrayList<String> taskFiveAnswer = taskFiveMethod(methodFiveTestData);
        for (String object : taskFiveAnswer) {
            System.out.println(object);
        }

        System.out.println("******* TASK 6 *******");

        String[] methodSixTestData = {"pen", "eraser", "pencil", "pen", "123", "abc"};
        System.out.println(taskSixMethod(methodSixTestData));

    }
}
