package com.company.solvedac;

import java.util.Scanner;

public class Zero_ifs {
    public static void main(String[] args) {
        //1330 두 수 비교하기
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if(a > b){
//            System.out.println(">");
//        }else if(a < b){
//            System.out.println("<");
//        }else if(a == b){
//            System.out.println("==");
//        }

        //9498 시험 성적
//        int score = scanner.nextInt();
//
//        if(score >= 90 && score <= 100){
//            System.out.println("A");
//        }else if(score >= 80 && score <= 89){
//            System.out.println("B");
//        }else if(score >= 70 && score <= 79){
//            System.out.println("C");
//        }else if(score >= 60 && score <= 69){
//            System.out.println("D");
//        }else System.out.println("F");

        //14681 사분면 고르기
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();

//        if(a > 0 && b > 0){
//            System.out.println(1);
//        }else if(a < 0 && b > 0){
//            System.out.println(2);
//        }else if(a < 0 && b < 0){
//            System.out.println(3);
//        }else if(a > 0 && b < 0){
//            System.out.println(4);
//        }

        //2753 윤년
//        int year = scanner.nextInt();
//
//        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.println(1);
//        }else System.out.println(0);

        //2420 사파리월드
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        long result = Math.abs(n - m);
        System.out.println(result);
    }
}
