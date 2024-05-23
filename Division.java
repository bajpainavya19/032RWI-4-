//protected access modifier
public class Division {
    // Protected method to add two numbers
    protected int add(int a, int b) {
        return a + b;
    }
}

class TestDivision extends Division {
    public static void main(String[] args) {
        TestDivision division = new TestDivision();
        int result = division.add(25, 3); // Example values
        System.out.println("The sum is: " + result);
    }
}
