

import java.util.Scanner;

public class CheckRotation {
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            System.out.println("False");
        }
        // Concatenate the first string with itself
        String concatenatedStr = str1 + str1;
        System.out.println(concatenatedStr.contains(str2));

    }
}