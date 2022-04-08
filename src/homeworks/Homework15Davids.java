package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework15Davids {
    public static void main(String[] args) {

        // =========================== TASK 1 ===========================
        System.out.println("********** TASK 1 **********\n");

        int[] taskOneArr = {10,23,67,23,78};
        System.out.println(taskOneArr[3]);
        System.out.println(taskOneArr[0]);
        System.out.println(taskOneArr[2]);
        System.out.println(Arrays.toString(taskOneArr));

        // =========================== TASK 2 ===========================
        System.out.println("\n********** TASK 2 **********\n");

        String[] taskTwoArr = {"Blue","Brown","Red","White","Black","Purple"};
        System.out.println(taskTwoArr[1]);
        System.out.println(taskTwoArr[3]);
        System.out.println(taskTwoArr[5]);
        System.out.println(Arrays.toString(taskTwoArr));

        // =========================== TASK 3 ===========================
        System.out.println("\n********** TASK 3 **********\n");

        int[] taskThreeArr = {23,-34,-56,0,89,100};
        System.out.println(Arrays.toString(taskThreeArr));
        Arrays.sort(taskThreeArr);
        System.out.println(Arrays.toString(taskThreeArr));

        // =========================== TASK 4 ===========================
        System.out.println("\n********** TASK 4 **********\n");

        String[] taskFourArr = {"Istanbul", "Berlin", "Madrid", "Paris"};
        System.out.println(Arrays.toString(taskFourArr));
        Arrays.sort(taskFourArr);
        System.out.println(Arrays.toString(taskFourArr));

        // =========================== TASK 5 ===========================
        System.out.println("\n********** TASK 5 **********\n");

        String[] taskFiveArr = {"Spider Man", "Iron Man", "Black Panther", "Deadpool",
                "Captain America"};
        System.out.println(Arrays.toString(taskFiveArr));
        boolean wolfy = false;
        for (String superhero: taskFiveArr) {
            if (superhero.equals("Wolverine")) {
                wolfy = true;
                break;
            }
            break;
        }
        System.out.println(wolfy);

        // =========================== TASK 6 ===========================
        System.out.println("\n********** TASK 6 **********\n");

        String[] taskSixArr = {"Hulk", "Black Widow", "Captain America", "Iron Man"};
        Arrays.sort(taskSixArr);
        System.out.println(Arrays.toString(taskSixArr));

        boolean hulk = false;
        boolean irondude = false;
        for (String supahero: taskSixArr) {
            if (supahero.equals("Hulk")) hulk = true;
            else if (supahero.equals("Iron Man")) irondude = true;
        }
        boolean heroCheck = hulk && irondude;
        System.out.println(heroCheck);

        // =========================== TASK 7 ===========================
        System.out.println("\n********** TASK 7 **********\n");

        char[] taskSevenArr = {'A', 'x', '$', '%', '9', '*', '+', 'F', 'G'};
        System.out.println(Arrays.toString(taskSevenArr));
        for (char object: taskSevenArr) System.out.println(object);

        // =========================== TASK 8 ===========================
        System.out.println("\n********** TASK 8 **********\n");

        String[] taskEightArr = {"Desk", "Laptop", "Mouse", "Monitor",
                "Mouse-Pad", "Adapter"};
        System.out.println(Arrays.toString(taskEightArr));
        Arrays.sort(taskEightArr);
        System.out.println(Arrays.toString(taskEightArr));
        int mCounter = 0;
        int notAOrECounter = 0;
        String[] newArr = new String[taskEightArr.length];
        for (int i = 0; i < taskEightArr.length; i++) {
            newArr[i] = taskEightArr[i].toLowerCase();
        }
        for (String object: newArr) {
            if (object.startsWith("m")) mCounter++;
            if ( !(object.contains("a")) && !(object.contains("e"))) notAOrECounter++;
        }
        System.out.println(mCounter);
        System.out.println(notAOrECounter);

        // =========================== TASK 9 ===========================
        System.out.println("\n********** TASK 9 **********\n");

        String[] taskNineArr = {"Plate", "spoon", "fork", "Knife", "cup", "Mixer"};
        System.out.println(Arrays.toString(taskNineArr));
        int uCounter = 0;
        int lCounter = 0;
        int containP = 0;
        int startOrEndP = 0;
        for (String object: taskNineArr) {
            if (CharacterHelper.isUppercase(object.charAt(0))) uCounter++;
            else if (CharacterHelper.isLowercase(object.charAt(0))) lCounter++;
            if (object.toLowerCase().contains("p")) containP++;
            if (object.toLowerCase().startsWith("p") || object.toLowerCase().endsWith("p"))
                startOrEndP++;
        }
        System.out.println(
                "Elements starts with uppercase = " + uCounter + "\n" +
                "Elements starts with lowercase = " + lCounter + "\n" +
                "Elements having P or p = " + containP + "\n" +
                "Elements starting or ending with P or p = " + startOrEndP
        );

        // =========================== TASK 10 ===========================
        System.out.println("\n********** TASK 10 **********\n");

        int[] taskTenArr = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(taskTenArr));
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        for (int object: taskTenArr) {
            if (object % 10 == 0) counter1++;
            if (object % 2 == 0 && object > 15) counter2++;
            if (object % 2 != 0 && object < 20 ) counter3++;
            if (object < 15 || object > 50) counter4++;
        }
        System.out.println(
                "Elements that can be divided by 10 = " + counter1 + "\n" +
                "Elements that are even and greater than 15 = " + counter2 + "\n" +
                "Elements that are odd and less than 20 = " + counter3 + "\n" +
                "Elements that are less than 15 or greater than 50 = " + counter4
        );

    }
}
