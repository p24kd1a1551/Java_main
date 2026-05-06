// Java program to implement Wrapper Classes
public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = 25.5;

        Integer obj1 = Integer.valueOf(a);
        Double obj2 = Double.valueOf(b);

        int x = obj1.intValue();
        double y = obj2.doubleValue();

        System.out.println("Integer object: " + obj1);
        System.out.println("Double object: " + obj2);
        System.out.println("Unboxed int value: " + x);
        System.out.println("Unboxed double value: " + y);
    }
}
