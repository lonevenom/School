package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12Davids {
    public static void main(String[] args) {

        //   ============================   TASK 1   ============================
        System.out.println("*************** TASK 1 ***************");

        int[] numbers = {89,0,23,0,12,0,15,34,0,7};
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));


        //   ============================   TASK 2   ============================
        System.out.println("*************** TASK 2 ***************");

        String[] letterList = new String[5];
        letterList[1] = "abc";
        letterList[4] = "xyz";
        System.out.println(letterList[3]);
        System.out.println(letterList[0]);
        System.out.println(letterList[4]);
        System.out.println(Arrays.toString(letterList));


        //   ============================   TASK 3   ============================
        System.out.println("*************** TASK 3 ***************");

        int[] numbers1 = {23,-34,-56,0,89,100};
        System.out.println(Arrays.toString(numbers1));
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));


        //   ============================   TASK 4   ============================
        System.out.println("*************** TASK 4 ***************");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
        String animal = "pig";


        //   ============================   TASK 5   ============================
        System.out.println("*************** TASK 5 ***************");

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));
        boolean hasPluto = false;
        for (String object : cartoonDogs) {
            if (object.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);


        //   ============================   TASK 6   ============================
        System.out.println("*************** TASK 6 ***************");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        boolean wantedCat = false;
        boolean cat1 = false;
        boolean cat2 = false;
        for (String object : cats) {
            if (object.equals("Garfield")) {
                cat1 = true;
            } else if (object.equals("Tom")) {
                cat2 = true;
            }
        }
        if (cat1 && cat2) { //checking if both cats are present then return true
            wantedCat = true;
        }
        System.out.println(wantedCat);


        //   ============================   TASK 7   ============================
        System.out.println("*************** TASK 7 ***************");

        double[] numList = {10.5,20.75,70.0,80.0,15.75};
        System.out.println(Arrays.toString(numList));
        for (double object : numList) {
            System.out.println(object);
        }


        //   ============================   TASK 8   ============================
        System.out.println("*************** TASK 8 ***************");

        char[] taskEightList = {'A','b','G','H','7','5','&','*','e','@','4'};
        System.out.println(Arrays.toString(taskEightList));
        int letterCount = 0;
        int lowerLetter = 0;
        int upperLetter = 0;
        int digit = 0;
        int specialChar = 0;
        for (char object : taskEightList) {
            if (CharacterHelper.isLetter(object)) {
                letterCount++;
                if (CharacterHelper.isUppercase(object)) {
                    upperLetter++;
                } else {
                    lowerLetter++;
                }
            } else if (CharacterHelper.isDigit(object)) {
                digit++;
            } else if (CharacterHelper.isSpecial(object)) {
                specialChar++;
            }
        }
        System.out.println("Letters = " + letterCount);
        System.out.println("Uppercase letters = " + upperLetter);
        System.out.println("Lowercase letters = " + lowerLetter);
        System.out.println("Digits = " + digit);
        System.out.println("Special characters = " + specialChar);

        //   ============================   TASK 9   ============================
        System.out.println("*************** TASK 9 ***************");

        String[] randomItems = {"Pen","notebook","Book","paper","bag","pencil","Ruler"};
        System.out.println(Arrays.toString(randomItems));
        int upperCounter = 0;
        int lowerCounter = 0;
        int bOrPCounter = 0;
        int bookAndPenCounter = 0;
        for (String object : randomItems) {
            if (CharacterHelper.isUppercase(object.charAt(0)))  {
                upperCounter++;
            } else if (CharacterHelper.isLowercase(object.charAt(0))) {
                lowerCounter++;
            }
            if (object.toUpperCase().startsWith("B") || object.toUpperCase().startsWith("P") ) {
                bOrPCounter++;
            }
            if (object.toUpperCase().contains("BOOK") || object.toUpperCase().contains("PEN")) {
                bookAndPenCounter++;
            }

        }
        System.out.println("Elements starts with uppercase = " + upperCounter);
        System.out.println("Elements starts with lowercase = " + lowerCounter);
        System.out.println("Elements starting with B or P = " + bOrPCounter);
        System.out.println("Elements having \"book\" or \"pen\" = " + bookAndPenCounter);


        //   ============================   TASK 10   ============================
        System.out.println("*************** TASK 10 ***************");

        int[] numList1 = {3,5,7,10,0,20,17,10,23,56,78};
        System.out.println(Arrays.toString(numList1));
        int moreThanTen = 0;
        int lessThanTen = 0;
        int equalToTen = 0;
        for (int object : numList1) {
            if (object == 10) {
                equalToTen++;
            } else if (object > 10) {
                moreThanTen++;
            } else {lessThanTen++;}
        }
        System.out.println("Elements that are more than 10 = " + moreThanTen);
        System.out.println("Elements that are less than 10 = " + lessThanTen);
        System.out.println("Elements that are 10 = " + equalToTen);


        //   ============================   TASK 11   ============================
        System.out.println("*************** TASK 11 ***************");

        int[] numbaList1 = {5,8,13,1,2};
        int[] numbaList2 = {9,3,67,1,0};
        int[] numbaList3 = new int[5];
        System.out.println("1st array is = " + Arrays.toString(numbaList1));
        System.out.println("2nd array is = " + Arrays.toString(numbaList2));
        for (int i = 0; i < numbaList1.length; i++) {
            numbaList3[i] = Math.max(numbaList1[i], numbaList2[i]);
        }
        System.out.println(Arrays.toString(numbaList3));

    }
}
