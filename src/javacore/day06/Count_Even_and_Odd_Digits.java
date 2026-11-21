package javacore.day06;

import java.util.Scanner;

public class Count_Even_and_Odd_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int temp = n;
        int evencount=0,oddcount=0;
        while (temp > 0) {
            int rem = temp % 10;
           if(rem%2==0){evencount++;}
           else{oddcount++;}
            temp = temp / 10;
        }
        if(n==0){
            evencount=1;
        }
        System.out.println("Number of even digits:"+evencount);
        System.out.println("Number of odd digits:"+oddcount);
    }
    }
