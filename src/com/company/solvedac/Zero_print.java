package com.company.solvedac;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zero_print {
    public static void main(String[] args) {
        //2557 Hello World
        System.out.println("Hello World!");

        //10699 오늘 날짜
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String formattedDate = dateFormat.format(date);

        System.out.println(formattedDate);

        //7287 등록
        System.out.println("3");
        System.out.println("cw118");

        //10171 고양이
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");

        //10172 개
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");

        //25083 새싹
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");

    }
}
