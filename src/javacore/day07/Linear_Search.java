package javacore.day07;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        boolean found=false;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Entr the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of key element:");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found=true;
                System.out.println("Element found at " + i);
                break;
            }

        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }
}