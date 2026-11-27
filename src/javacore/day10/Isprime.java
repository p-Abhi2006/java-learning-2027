package javacore.day10;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Not a prime");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag=true;
                System.out.println("Not a prime");
                break;
            }
        }
        if(flag==false)
            System.out.println("Prime");

    }
}
