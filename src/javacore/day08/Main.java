package javacore.day08;
import java.util.Scanner;
public class Main {
    static boolean Iseven(int x){
        if(x%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
    static int findMax(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static int square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter an integer:");
int n=sc.nextInt();
        boolean iseven=Iseven(n);
if(iseven) {
    System.out.println("Even");
}
else{
    System.out.println("Odd");
        }
int result=square(n);
System.out.println("Square of "+n+" is: "+result);
        System.out.println("Enter two integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int largest=findMax(a,b);
System.out.println("Largest:"+largest);
    }
}

