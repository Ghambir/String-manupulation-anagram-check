package org.jsp;

import java.util.Arrays;

public class Main {
    public static boolean isAnagram(String a, String b) {

        a=a.toLowerCase();
        b=b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        Arrays.sort(aChar);
        Arrays.sort(bChar);

        return Arrays.equals(aChar, bChar);



    }
    public static boolean isAnagram2(String c, String d) {
        c=c.toLowerCase();
        d=d.toLowerCase();
        if(c.length()!=d.length()){
            return false;
        }
        char[] cchar=c.toCharArray();
        char[] dchar=d.toCharArray();
        Arrays.sort(cchar);
        Arrays.sort(dchar);
        return Arrays.equals(cchar,dchar);


    }
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        System.out.println(isAnagram(a, b));
        String c = "hello";
        String d = "world";
        System.out.println(isAnagram(c, d));

    }
}