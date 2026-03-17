public class inheritance {
    public static void main(String[] args) {
        EngineeringStudent s1 = new EngineeringStudent();

        s1.markAttendance();
        s1.attendLab();

        MechanicalStudent s2 = new MechanicalStudent();

        s2.markAttendance();
        s2.attendLab();
        s2.carRepair();
    };
};

class Student {
    String name;
    int age;

    void markAttendance() {
        System.out.println("Attendance");
    };
};

class EngineeringStudent extends Student {
    void attendLab() {
        System.out.println("lab attended");
    };
};

class MechanicalStudent extends EngineeringStudent {
    void carRepair() {
        System.out.println("car repairing lab");
    }
}