package javacore.day05;

import java.util.Scanner;

public class Employee_Bonus_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the performance rating of the employee:");
        int rating=sc.nextInt();
        System.out.println("Enter the attendance of the employee:");
        int attendance=sc.nextInt();
        System.out.println("Enter the experience of the employee:");
        int experience=sc.nextInt();
        if(rating<1 || rating>5||attendance>100||attendance<0||experience<0){
            System.out.println("Enter valid values");
        }
         else if(rating>=4 && attendance>=90 && experience>=2){
            System.out.println("The employee is eligible for bonus");
        }
        else{
            System.out.println("The employee is not eligible for bonus");
        }
    }
}