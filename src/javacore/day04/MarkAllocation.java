package javacore.day04;

import java.util.Scanner;

public class MarkAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks=sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }
        if(marks>=90 && marks<=100){
            System.out.println("A");
        }
        else if(marks>=80 && marks<90){
            System.out.println("B");
        }
        else if(marks>=70 && marks<80){
            System.out.println("C");
        }
        else if(marks>=60 && marks<70){
            System.out.println("D");
        }
        else{
                System.out.println("Fail");
        }}
}
