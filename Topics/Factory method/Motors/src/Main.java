import java.util.Scanner;

/* Product - Motor */
abstract class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "motor={model:" + model + ",power:" + power + "}";
    }
}

class PneumaticMotor extends Motor {
    public PneumaticMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        System.out.print("Pneumatic ");
        return super.toString();
    }
    // write your code here ...
}

class HydraulicMotor extends Motor {
    public HydraulicMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        System.out.print("Hydraulic ");
        return super.toString();
    }
    // write your code here ...
}

class ElectricMotor extends Motor {
    public ElectricMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        System.out.print("Electric ");
        return super.toString();
    }
    // write your code here ...
}

class WarpDrive extends Motor {
    public WarpDrive(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        System.out.print("WarpDrive ");
        return super.toString();
    }
    // write your code here ...
}

class MotorFactory {

    /**
     * It returns an initialized motor according to the specified type by the first character:
     * 'P' or 'p' - pneumatic, 'H' or 'h' - hydraulic, 'E' or 'e' - electric, 'W' or 'w' - warp.
     */
    public static Motor make(char type, String model, long power) {

        switch (Character.toString(type).toLowerCase()) {
            case "p":
                return new PneumaticMotor(model, power);

            case "h":
                return new HydraulicMotor(model, power);

            case "e":
                return new ElectricMotor(model, power);

            case "w":
                return new WarpDrive(model, power);

            default:
                return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);
        final String model = scanner.next();
        final long power = scanner.nextLong();
        final MotorFactory motorFactory = new MotorFactory();
        final Motor motor = motorFactory.make(type, model, power);
        scanner.close();
        System.out.println(motor);
    }
}