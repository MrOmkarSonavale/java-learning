public class iteration {
    public static void main(String[] args) {

        // while iteration
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println('\n');
        // do while in
        i = 1;

        // do one time then check condition
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // for loop in java
        System.out.println('\n');

        for (int j = 11; j < 20; j++) {
            System.out.println(j);
        }
        ;
        System.out.println('\n');
        // nexted loop in java

        for (int m = 0; m < 5; m++) {
            for (int k = 0; k <= m; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    };
}