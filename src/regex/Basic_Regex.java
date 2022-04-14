package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(" ");

        System.out.println(matcher.matches());


    }
}
