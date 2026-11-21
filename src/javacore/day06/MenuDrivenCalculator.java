package javacore.day06;

import java.util.Scanner;

public class MenuDrivenCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("1.Addition\n2.Subtracion\n3.Mutiplication\n4.Division\n5.Exit\n");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Result:"+(a+b));
            break;
            case 2:  System.out.println("Enter two numbers");
                 a = sc.nextInt();
                 b = sc.nextInt();
                System.out.println("Result:"+(a-b));
            break;
            case 3: System.out.println("Enter two numbers");
                 a = sc.nextInt();
                 b = sc.nextInt();
                System.out.println("Result:"+(a*b));
            break;
            case 4:System.out.println("Enter two numbers");
                 a = sc.nextInt();
                b = sc.nextInt();
                if(b!=0){System.out.println("Result:"+(a/b));}
                else{System.out.println("Division by zero is not possible");}
            break;
            case 5:System.out.println("Exiting...");
            break;
            default:System.out.println("Enter valid choice");
        }
        }while(choice!=5);
    }
}
