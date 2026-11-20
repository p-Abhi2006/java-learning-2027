package javacore.day05;

import java.util.Scanner;

public class ATM_Withdrawal_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance amount:");
        int bal_amt=sc.nextInt();
        System.out.println("Enter the withdrawal amount:");
        int with_amt=sc.nextInt();
        if(with_amt<=0||bal_amt<0){
            System.out.println("Enter valid value");
        }
        else if(with_amt%100==0&&with_amt<=bal_amt){
            bal_amt-=with_amt;
            System.out.println("Current balance is :"+bal_amt);
        }
        else{
            System.out.println("Amount cannot be withdawn");
        }}
}
