package javacore.day06;

import java.util.Scanner;

public class Check_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0,temp=0;
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        temp=n;
        while (temp > 0) {
            int rem =temp% 10;
            rev = rev * 10 + rem;
            temp=temp/ 10;
        }
        if(rev==n){
            System.out.println(n+" is a palindome");
        }
        else{
            System.out.println(n+" is not a palindome");
        }
    }
}
