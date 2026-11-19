package javacore.day04;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("Largest number is "+a);
            }
            else{
                System.out.println("Largest number is "+c);
            }
        }
        else{
            if(b>c){
                System.out.println("Largest number is "+b);
            }
            else{
                System.out.println("Largest number is "+c);
            }
        }
//        int largest=(a>b)?(a>c?a:c):(b>c?b:c);
//        System.out.println("Largest number is "+largest);
    }
}
