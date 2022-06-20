package homeworks;
import java.util.*;

public class Homework22 {

    // =========================== Task 1 Method ===========================
    public static int[] fibonacciSeries1(int n) {
        int[] answer = new int[n + 1];
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        answer[0] = 0;

        if (n > 0) {
            answer[1] = 1;

            for (i = 2; i <= n; i++) {
                /* Add the previous 2 numbers in the series
             and store it */
                answer[i] = answer[i - 1] + answer[i - 2];
            }
        }
        int newArr[] = Arrays.copyOf(answer, answer.length - 1);
        return newArr;
    }

    // =========================== Task 2 Method ===========================
    public static int fibonacciSeries2(int n) {
        int[] answer = new int[n + 1];
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        answer[0] = 0;

        if (n > 0) {
            answer[1] = 1;

            for (i = 2; i <= n; i++) {
                /* Add the previous 2 numbers in the series
             and store it */
                answer[i] = answer[i - 1] + answer[i - 2];
            }
        }
        return answer[n - 1];
    }

    // =========================== Task 3 Method ===========================
    public static int[] findUniques(int[] arr1, int[] arr2) {
        List<Integer> newArr1 = new ArrayList<>();
        for (int object : arr1) {
            for (int i = 0; i < arr1.length; i++) {
                if (!newArr1.contains(object)) {
                    newArr1.add(object);
                }
            }
        }
        List<Integer> newArr2 = new ArrayList<>();
        for (int object : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (!newArr2.contains(object)) {
                    newArr2.add(object);
                }
            }
        }
        TreeSet<Integer> tempHolder = new TreeSet<Integer>();
        for (int i : arr1) {
            tempHolder.add(i);
        }
        for (int i : arr2) {
            tempHolder.add(i);
        }
        ArrayList<Integer> intArr = new ArrayList<>(tempHolder);
        intArr.removeIf(object -> newArr1.contains(object) && newArr2.contains(object));
        return intArr.stream().mapToInt(Integer::intValue).toArray();
    }
    // =========================== Task 4 Method ===========================
    public static boolean isPowerOf3(int n) {
        boolean answer = false;
        if (n == 3) {
            return false;
        } else if (n % 3 == 0) {
            answer = true;
        }
        return answer;
    }
    // =========================== Task 5 Method ===========================
    public static int firstDuplicate(int[] arr) {
        if (arr.length < 2) return -1; // If there is none, return -1.
        List<Integer> set = new ArrayList<>();
        List<Integer> dupCheck = new ArrayList<>();
        // Gets list of duplicated numbers / ex = 1, 2, 5, 2, 2, 1, 5
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    set.add(arr[j]);
            }
        }
        // Filters that list into set to get rid of dup's and only have list of numbers which have dup's
        // ex = 1, 2, 5, 2, 2, 1, 5 filters down to 1, 2, 5
        for (int object : set) {
            for (int i = 0; i < set.size(); i++) {
                if (!dupCheck.contains(object)) {
                    dupCheck.add(object);
                }
            }
        }
        /* Check number of duplicated numbers.
        If there is none, return -1.
        If there is one, return first dup number.
        If there is more than one return dup number where sec number has smallest index
         */
        if (dupCheck.size() < 2) {
            return dupCheck.get(0);
        } else {
            Set<Integer> set1 = new HashSet<>();
            for(int num : arr){
                if(!set1.add(num)){
                    return num;
                }
            }
            return -1;
        }
    }

    public static void main (String[]args){
        // ============================= Task 1 =============================
        System.out.println("************ Task 1 ************");
        int testData1 = 7;
        System.out.println(Arrays.toString(fibonacciSeries1(testData1)));

        // ============================= Task 2 =============================
        System.out.println("************ Task 2 ************");
        int testData2 = 8;
        System.out.println(fibonacciSeries2(testData2));

        // ============================= Task 3 =============================
        System.out.println("************ Task 3 ************");
        int[] test1Data3 = {1, 2, 3, 4};
        int[] test2Data3 = {3, 4, 5, 5};
        System.out.println(Arrays.toString(findUniques(test1Data3, test2Data3)));

        // ============================= Task 4 =============================
        System.out.println("************ Task 4 ************");
        int testData4 = 1;
        System.out.println(isPowerOf3(testData4));

        // ============================= Task 5 =============================
        System.out.println("************ Task 5 ************");
        int[] testData5 = {1, 2, 3, 3, 4, 1};
        System.out.println(firstDuplicate(testData5));

        }
    }