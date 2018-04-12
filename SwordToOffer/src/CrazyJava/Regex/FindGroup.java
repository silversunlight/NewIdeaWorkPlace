package CrazyJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
    public static void main(String[] args) {
        String str = "klajdkfjalkdfjaslkjf13245678911" +
                "djahfdhfjadhfjkhajd15123456789" +
                "jkldshfjkahsdjkf13123456789";
        Pattern p=Pattern.compile("((13\\d)|(15\\d))\\d{8}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
