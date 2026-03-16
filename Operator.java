public class Operator {
    public static void main(String[] args) {

        // Arithmatic operator --> * / + - % += *= /= -=
        // %=

        int a = 5;
        int b = 10;

        int add = a + b;
        int sub = b - a;
        int mutliply = a * b;
        int divide = a / b;
        int module = a % b;

        System.out.println(add + " , "
                + sub + ", " + mutliply + " , " + divide + " , " + module);

        int num1 = add + 2;
        System.out.println(num1);

        num1 = num1 + add;
        System.out.println(num1);

        num1 -= add;
        System.out.println(num1);

        num1 *= add;
        System.out.println(num1);

        num1 /= sub;
        System.out.println(num1);

        // increment and decrement
        num1++; // num1 = num1+1;
        num1--; // num1 = num1-1

        int i = 0;
        i++;
        i++;

        System.out.println("incrementing i " + i);

        ++i;

        System.out.println("preincrementing i " + i);

        int j = i;

        System.out.println(j);

        i++;
        System.out.println(j);

        // relational operator == , != < > <= >=
        int num2 = 10;
        int num4 = 20;

        boolean check = (num2 == num4);
        System.out.println(check);

        boolean isNotEqual = (num2 != num4);
        System.out.println(isNotEqual);

        boolean isLess = (num2 < num4);
        boolean isGreater = (num2 > num4);
        boolean isLessOrEqual = (num2 <= num4);
        boolean isGreaterOrEqual = (num2 >= num4);

        System.out.println("is num2 is less than num4 " + isLess);
        System.out.println("is num2 is greater than num4 " + isGreater);
        System.out.println("is num2 is greater than or equal to  num4 " + isGreaterOrEqual);
        System.out.println("is num2 is less than num4 " + isLessOrEqual);

        // bitwise opeator '&' '|' '^' '>>' '<<' '>>>'

        int bitA = 2;
        int bitB = 3;

        int c = bitA & bitB;

        System.out.println(c);

        c = bitA | bitB;

        System.out.println(c);

        c = bitA ^ bitB;

        System.out.println(c);

    }
}