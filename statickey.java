public class statickey {
    public static void main(String[] args) {
        Student s1 = new Student("omkar", 24, 101);
        Student s2 = new Student("shubham", 26, 102);

        System.out.println(s1.name + " , " + s1.age + " , " + s1.num + " , " + Student.collage);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.num + " , " + Student.collage);
    };
};

class Student {
    String name;
    int age;
    int num;
    static String collage;

    Student(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    };

    static {
        collage = "jpa";
    }
}
