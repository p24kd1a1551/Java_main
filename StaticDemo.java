// Java program to implement Static property, method, block and package
public class StaticDemo {

    static int a = 10;

    static {
        System.out.println("Static Block Executed");
    }

    static void display() {
        System.out.println("Static Method Called");
        System.out.println("Value of a = " + a);
    }

    public static void main(String[] args) {
        display();
    }
}