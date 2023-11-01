package cw;

import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Pattern.matches("[A-Z]{2}[0-9]{7}", "AD0693812"));
//        System.out.println(Pattern.matches("[A-Z]{2}[0-9]{7}", "jj0693812564"));

//        System.out.println(Pattern.matches(
//                "[01]?[10]?[30]?[40]?[50]?[60]?[70]?[75]?[90]?[95]?[A-Z]{2,3}[0-9]{3}[A-Z]{0,1}",
//                "01WDA075"));
//        System.out.println(Pattern.matches(
//                "[01]?[10]?[30]?[40]?[50]?[60]?[70]?[75]?[90]?[95]?[A-Z]{2,3}[0-9]{3}[A-Z]{0,1}",
//                "01WE075B"));
//        System.out.println(Pattern.matches(
//                " [A-Z]{2,3}[0-9]{3}[A-Z]{0,1}",
//                "55WB877A"));

//        System.out.println(Pattern.matches(
//                     "(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))" +
//                        "\\.(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))" +
//                        "\\.(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))" +
//                        "\\.(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))",
//                "192.168.43.1"));
//
        System.out.println(Pattern.matches(
                  "(([1-9])|(1[0-9])|(2[0-9])|(3[0-1]))" +
         "((.)|(/)|(_)|(\\s))((0[1-9])|(1[0-2]))" +
         "((.)|(/)|(_)|(\\s))((\\d{4}))",
                "12.02.2022"));
    }


}