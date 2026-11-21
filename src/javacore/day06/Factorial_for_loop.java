package javacore.day06;

import java.util.Scanner;

public class Factorial_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int product=1;
        for(int i=2;i<=n;i++){
           product*=i;
        }
        System.out.println("Factorial of "+n+" is:"+product);
}
}
