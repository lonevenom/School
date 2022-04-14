package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public String repeatSeparator(String word, String sep, int count) {

        int sep2 = count - 1;
        String answer = "";

        for (int i = 0; i >= sep2; i++) {
            if (i == count) {
                answer += word;
                break;
            }
            answer += (word + sep);
        }
        return answer;



    }







    public static void main(String[] args) {
        int[] numbers = {1, 5, 10}; // 0     2

        //numbers[3] = 3; // ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(numbers));




    }
}
