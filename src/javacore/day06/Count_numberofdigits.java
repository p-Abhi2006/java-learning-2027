package javacore.day06;

import java.util.Scanner;

public class Count_numberofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        if (n == 0) {
            count=1;
        }
        while(n>0) {
        int rem=n%10;
        n=n/10;
        count++;
        }
        System.out.println("Count:"+count
        );
        }
    }

