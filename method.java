public class method {
    static int num;
    static String mystr;
    static{
        num=100;
        mystr="Static keyword in java";
    }
    public static void main(String args[]){
        System.out.println("Value of num: " + num);
        System.out.println("Value of mystr: " + mystr);
    }
}
