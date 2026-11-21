package javacore.day06;

import java.util.Scanner;

public class Find_the_Largest_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int temp = n;
        int largest=0;
        while (temp > 0) {
            int rem = temp % 10;
            if(rem>largest)
            {
               largest=rem;
            }
            temp = temp / 10;
        }
    System.out.println("Largest:"+largest);}
}
