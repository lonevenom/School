package file_handling;

import java.io.File;

public class WriteData {
    public static void main(String[] args){

        /*
        Create a file called as studentList.txt
        After creating, put a wait for 5 seconds, and delete it
         */

        File myFile = new File("studentList.txt");

        try {
            myFile.createNewFile();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            myFile.delete();
        }
        System.out.println("End of the program!");



    }
}
