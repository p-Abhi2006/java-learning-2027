package javacore.day05;

import java.util.Scanner;

public class Student_Admission_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in mathematics:");
        int math = sc.nextInt();
        System.out.println("Enter the marks in physics:");
        int phy = sc.nextInt();
        System.out.println("Enter the marks in chemistry:");
        int chem = sc.nextInt();
        if (math > 100 || chem > 100 || phy > 100 || math < 0 || chem < 0 || phy < 0) {
            System.out.println("Enter valid marks");
        } else if (math >= 60 && phy >= 50 && chem >= 50 && (math + phy + chem) >= 180) {
            System.out.println("Student is eligible for admission");
        } else {
            System.out.println("Student is not eligible for admission");
        }
    }
}