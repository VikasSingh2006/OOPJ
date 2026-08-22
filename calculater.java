public class calculater {

    int num1 = 10;
    int num2 = 2;
    
    void add() {
        int sum = num1 + num2;
        System.out.println("Addition is: " + sum);
    }

    void div() {
        int div = num1 / num2;
        System.out.println("Division is: " + div);
    }
    void sub() {
        int sub = num1 - num2;
        System.out.println("Subtraction is: " + sub);
    }
    void mul() {
        int mul = num1 * num2;
        System.out.println("Multiplication is: " + mul);
    }
    public static void main(String[] args) {

        calculater c = new calculater();

        c.add();
        c.div();
        c.sub();
        c.mul();
    }
}