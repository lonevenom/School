package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args){
        /*
        TASK
        Create a new txt file called objects
        Write below data in it
            Computer
            Phone
            Table
            Chair
            Mouse
            Screen
            Remote
        Print objects that has r or R as a letter
        EXPECTED OUTPUT
        Computer
        Chair
        Screen
        Remote
         */
        File file = new File("objects.txt");
        try{
            FileWriter fileWriter = new FileWriter("objects.txt");
            fileWriter.write("Computer\n");
            fileWriter.write("Phone\n");
            fileWriter.write("radio\n");
            fileWriter.write("Chair\n");
            fileWriter.write("Mouse\n");
            fileWriter.write("Screen\n");
            fileWriter.write("Remote\n");
            fileWriter.close();

            Scanner input = new Scanner(file);


            while(input.hasNextLine()){
                String next = input.nextLine();
                if (next.startsWith("r") || next.startsWith("R")) {
                    System.out.println(next);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            file.delete();
        }


    }
}
