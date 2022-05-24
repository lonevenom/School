package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate); // Sat Apr 30 10:13:46 CDT 2022

        SimpleDateFormat sdf = new SimpleDateFormat("EEE hh:mm a");
        System.out.println("Today is = " + sdf.format(currentDate));




    }
}
