package javacore.day07;


public class ArrayTraversal {
    public static void main(String[] args) {
        int []arr={12, 25, 36, 48, 59};

        for(int i=0;i<arr.length;i++){
            arr[i]+=5;
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
    }
}
