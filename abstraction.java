import javax.smartcardio.Card;

public class abstraction {
    public static void main(String[] args) {
        FuelCar f1 = new FuelCar();
        f1.start();
        f1.accelerate();
        f1.brake();
    }
};

abstract class Car {
    void start() {
        System.out.println("car is starting");
    };

    abstract void accelerate();

    abstract void brake();
};

class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("accelrating fuel car");
    }

    void brake() {
        System.out.println(
                "breaking fuel car");
    }
};

class Electric extends Car {
    @Override
    void brake() {
        System.out.println("breaking electric car");
    };

    void accelerate() {
        System.out.println("accelrating electric car");

    }
};
