package javacore.day06;

import java.util.Scanner;
public class Isprime{
    public static boolean Isprime(int n){
        if (n < 2) {
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
       boolean counter= Isprime(n);
        if(counter){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }
    }
}
