package com.company.solvedac;

import java.util.Scanner;

public class Zero_repeat {
    public static void main(String[] args) {
        //2741 N찍기
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for(int i = 1; i <= n; i++){
//            System.out.println(i);
//        }

        //10872 팩토리얼
//        int n = scanner.nextInt();
//        int result = 1;
//        if(n >= 0 && n <= 12){
//            for(int i = 1; i <= n; i++){
//                result *= i;
//            }
//            System.out.println(result);
//        }

        //10950 A+B - 3
//        int T = scanner.nextInt();
//        int arr[] = new int[T];
//        for (int i = 0; i < T; i++){
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            arr[i] = a + b;
//            System.out.println(arr[i]);
//        }

        //10952 A+B - 5
//        while (true){
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//            if(a == 0 && b == 0){
//                scanner.close();
//                break;
//            }
//            System.out.println(a + b);
//        }

        //2739 구구단
//        int n = scanner.nextInt();
//        if(n >= 1 && n <= 9){
//            for(int i = 1; i <= 9; i++){
//                System.out.println(n + " * " + i + " = " + n*i);
//            }
//        }else scanner.close();

        //2438 별 찍기 - 1
//        int n = scanner.nextInt();
//        if(n >= 1 && n <= 100){
//            for(int i = 1; i <= n; i++){
//                for(int j = 1; j <= i; j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }

        //10951 A+B-4
        while (scanner.hasNextInt()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
        }
        scanner.close();

    }
}
