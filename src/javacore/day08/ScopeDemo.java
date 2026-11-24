public class ScopeDemo {

    static void display() {
        int number = 10;
        System.out.println(number);
    }

    public static void main(String[] args) {
        display();
       // System.out.println(number); // Error!
    }
}
//public class Test {
//    public static void main(String[] args) {
//        int x = 10;
//
//        if (x > 5) {
//            int y = 20;
//            System.out.println(x + y);
//        }
//
//        System.out.println(x);
//        System.out.println(y);          error....
//    }
//}