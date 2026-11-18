package javacore.day03;

public class TypeConversion {
    public static void main(String[] args) {

        int number = 100;
        double decimal = number;
        System.out.println("Original integer: " + number);
        double price = 99.99;
        System.out.println("Original price: " + price);
        int convertedPrice = (int) price;
        System.out.println("Widened value: " + decimal);
        System.out.println("Narrowed value: " + convertedPrice);
    }
}
