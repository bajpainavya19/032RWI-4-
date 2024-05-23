//public access modifier
public class Multiplication {
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        int result = multiplication.multiply(5, 3); // Example values
        System.out.println("The product is: " + result);
    }
}
