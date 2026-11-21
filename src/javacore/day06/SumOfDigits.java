package javacore.day06;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  sum = 0;
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp = temp / 10;
        }
    System.out.println(sum);
    }
}
