package homeworks;


import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {

    // =========================== Task 1 Method ===========================
    public static boolean hasLowerCase(String userString) {
        return userString.matches(".*[a-z]+.*");
    }

    // =========================== Task 2 Method ===========================
    public static ArrayList<Integer> noZero(Integer[] userArr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (Integer i = 0; i < userArr.length; i++) {
            if (userArr[i] != 0) newArr.add(userArr[i]);
        }
        return newArr;
    }

    // =========================== Task 3 Method ===========================
    public static int[][] numberAndSquare(int[] userArr){
        int[][] number = new int[userArr.length][2];
        for (int i = 0; i < userArr.length; i++) {
            number[i][0] = userArr[i];
            number[i][1] = userArr[i] * userArr[i];
        }
        return number;
    }
    // =========================== Task 4 Method ===========================
    public static boolean containsValue(String[] userArr, String userStr){
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i].matches(userStr)) {
                return true;
            }
        }
        return false;
    }

    // =========================== Task 5 Method ===========================
    public static String reverseSentence(String userStr){
        userStr = userStr.toLowerCase();
        String newStr = "";
        String[] strArr = userStr.split(" ");
        if (strArr.length < 2) return "There is not enough words!";
        for (int i = strArr.length - 1; i >= 0; i--) {
            newStr += strArr[i] + " ";
        }
        newStr = newStr.substring(0, 1).toUpperCase() + newStr.substring(1);
        newStr = newStr.trim();
        return newStr;
    }

    // =========================== Task 6 Method ===========================
    public static String removeStringSpecialsDigits(String userStr){
        userStr = userStr.replaceAll("[0-9$&+,:;=?@#|'<>.^*()%!-]", "");
        return userStr;
    }


    // =========================== Task 7 Method ===========================
    public static String[] removeArraySpecialsDigits(String[] userArr) {
        String[] newArr = new String[userArr.length];
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = userArr[i].replaceAll("[0-9$&+,:;=?@#|'<>.^*()%!-]", "");
        }
        return userArr;
    }
    // =========================== Task 8 Method ===========================
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> userArr1, ArrayList<String> userArr2) {
        ArrayList<String> newArr = new ArrayList<>();
        for (String object : userArr1) {
            for (String element : userArr2) {
                if (object.equals(element) && !newArr.contains(object)) newArr.add(object);
            }
        }
        return newArr;
    }




    // =========================== Task 9 Method ===========================
    public static ArrayList<String> noXInVariables(ArrayList<String> userArr){

        for (int i = 0; i < userArr.size(); i++) {
            String noXElement = userArr.get(i).replaceAll("[xX]", "");
            if (noXElement.isEmpty()) userArr.remove(i--);
            else userArr.set(i, noXElement);
        }
        return userArr;
    }

    public static void main(String[] args) {
        // ============================= Task 1 =============================
        System.out.println("************ Task 1 ************");

        String taskOneTestData = "e123$";
        System.out.println(hasLowerCase(taskOneTestData));

        // ============================= Task 2 =============================
        System.out.println("************ Task 2************");

        Integer[] taskTwoTestData = {10, 0, 98};
        System.out.println(noZero(taskTwoTestData));

        // ============================= Task 3 =============================
        System.out.println("************ Task 3************");

        int[] taskThreeTestData = {0, 3, 6};
        System.out.println(Arrays.deepToString(numberAndSquare(taskThreeTestData)));

        // ============================= Task 4 =============================
        System.out.println("************ Task 4************");

        String[] taskFourTestData = {"abc", "foo", "java"};
        String taskFourStrData = "foo";
        System.out.println(containsValue(taskFourTestData, taskFourStrData));

        // ============================= Task 5 =============================
        System.out.println("************ Task 5************");

        String taskFiveTestData = "This is a sentence";
        System.out.println(reverseSentence(taskFiveTestData));

        // ============================= Task 6 =============================
        System.out.println("************ Task 6************");

        String taskSixTestData = "Selenium 123#$%Cypress";
        System.out.println(removeStringSpecialsDigits(taskSixTestData));

        // ============================= Task 7 =============================
        System.out.println("************ Task 7************");

        String[] taskSevenTestData = {"123Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(taskSevenTestData)));

        // ============================= Task 8 =============================
        System.out.println("************ Task 8************");
        ArrayList<String> set1TestData = new ArrayList<>();
        set1TestData.add("Java");
        set1TestData.add("is");
        set1TestData.add("fun");
        ArrayList<String> set2TestData = new ArrayList<>();
        set2TestData.add("Java");
        set2TestData.add("C#");
        set2TestData.add("Python");

        System.out.println(removeAndReturnCommons(set1TestData, set2TestData));

        // ============================= Task 9 =============================
        System.out.println("************ Task 9************");

        ArrayList<String> set3TestData = new ArrayList<>();
        set3TestData.add("xxxxxxxxx");
        set3TestData.add("123");
        set3TestData.add("#$%");

        System.out.println(noXInVariables(set3TestData));
    }
}
