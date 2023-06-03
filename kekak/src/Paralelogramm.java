import java.util.*;

public class Paralelogramm {

    static int count = 0;
    double num1;
    double num2;
    public Paralelogramm() {
        this.num1 = 5.0;
        this.num2 = 3.0;
        count++;
    }

    public Paralelogramm(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        count++;
    }

    public double getArea() {

        return num1 * num2;
    }

    public double getPerimeter() {

        return 2 * (num1 + num2);
    }

    public static int getCount() {

        return count;
    }
}