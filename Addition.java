//private access modifier
public class Addition {
    private int add(int a, int b) {
        return a + b;
    }

    public void performAddition() {
        int result = add(5, 3); // Example values
        System.out.println("The sum is: " + result);
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.performAddition();
    }
}
