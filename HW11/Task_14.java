package HW11;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task_14 {
    public static void main(String[] args) {
        Matcher m;

        String A = """
            1 \\
            1qwe \\
            mibegev562@luxiu2.com \\
            123 \\
            weyrt2344 \\
            aqwuyetqa \\
            qqqqq \\
            vowamot374@luxiu2.com \\
            goblin734@algo.com \\
            iwuery3455 \\
            """;
        
        // a)
        System.out.println("Number of words = " + A.split("\\s+").length + "\n");
 

        // б)
        List<String> allMatches = new ArrayList<String>();
        m = Pattern.compile("\\b\\d\\S*\\b").matcher(A);
        while (m.find()) allMatches.add(m.group());
        System.out.println("Number of words starting with a digit = " + allMatches.size());
        for (String i : allMatches) System.out.println(i);
        System.out.println();


        // в)
        allMatches.clear();
        m = Pattern.compile("\\b\\S*\\d{3,}\\s+").matcher(A);
        while (m.find()) allMatches.add(m.group());
        System.out.println("Number of words ending with a three-digit = " + allMatches.size());
        for (String i : allMatches) System.out.println(i);
        System.out.println();


        // г)
        allMatches.clear();
        m = Pattern.compile("\\b(\\S)\\S*\\1\\b").matcher(A);
        while (m.find()) allMatches.add(m.group());
        System.out.println("Number of words starting and ending with a same symbol = " + allMatches.size());
        for (String i : allMatches) System.out.println(i);
        System.out.println();


        // д)
        allMatches.clear();
        m = Pattern.compile("\\b[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})\\b").matcher(A);
        while (m.find()) allMatches.add(m.group());
        System.out.println("Number of emails = " + allMatches.size());
        for (String i : allMatches) System.out.println(i);
    }
}