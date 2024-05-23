class Addition {
    // Default (package-private) method to add two numbers
    int add(int a, int b) {
        return a + b;
    }
}

public class TestAddition {
    public static void main(String[] args) {
        Addition addition = new Addition();
        int result = addition.add(15, 30); // Example values
        System.out.println("The sum is: " + result);
    }
}
