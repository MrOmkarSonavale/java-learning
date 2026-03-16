public class Operator {
    public static void main(String[] args) {

        // Arithmatic operator --> * / + - % += *= /= -=
        // %=

        int a = 5;
        int b = 10;

        int add = a + b;
        int sub = a - b;
        int mutliply = a * b;
        int divide = a / b;
        int module = a % b;

        System.out.println(add + " , "
                + sub + ", " + mutliply + " , " + divide + " , " + module);

        int num1 = add + 2;
        System.out.println(num1);

        num1 = num1 + add;
        System.out.println(num1);

    }
};