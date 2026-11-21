package javacore.day06;

import java.util.Scanner;

public class Sum_of_n_numbers {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            sum += i;
        }
    System.out.println("Sum="+sum);
    }
}
