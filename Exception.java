public class Exception {

    int num1 = 10;
    int num2 = 5;

    void add() {
        System.out.println("Addition: " + (num1 + num2));
    }

    void sub() {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    void mul() {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    void div() {
        try {
            System.out.println("Division: " + (num1 / num2));
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally Done");
        }
    }

    public static void main(String[] args) {

        Exception obj = new Exception();

        obj.add();
        obj.sub();
        obj.mul();
        obj.div();

        String text = "Hello";

        try {
            System.out.println("Letter is " + text.charAt(9));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
