public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student("omkar", 24, "gpa");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.collage);

    }
};

class Student {
    String name;
    int age;
    int rollnumber;
    String collage;

    // Student() {
    // name = "omakr";
    // age = 25;
    // collage = "iit avasari";
    // };

    // default construtor

    Student() {

    };

    Student(String name) {
        this(name, 0, null);
    }

    Student(String name, int age, String collage) {
        this.name = name;
        this.age = age;
        this.collage = collage;
    }

    void markAttendance() {
        System.out.println("Attendance marked by student" + name);
    }
};