package javacore.day10;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int product=Math.abs(m*n);
        while (n > 0) {
            int rem = m % n;
            m = n;
            n = rem;
        }
        System.out.println("LCM:"+(product/m));
    }
}
