import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("1-ый параллелаграмм:");

        Paralelogramm paralelogram1 = new Paralelogramm();

        System.out.println("Площадь 1-о параллелаграмма: " + paralelogram1.getArea());
        System.out.println("Периметр 1-о параллелаграмма: " + paralelogram1.getPerimeter());


        System.out.println("2-ой параллилограмм:");

        System.out.print("ширина:");

        double aoa = sc.nextDouble();

        System.out.print("высота:");

        double aoa2 = sc.nextDouble();

        Paralelogramm paralelogram2 = new Paralelogramm(aoa, aoa2);
        System.out.println("Площадь 2-go параллелоМама: " + paralelogram2.getArea());
        System.out.println("Периметр 2-go параллелоМама: " + paralelogram2.getPerimeter());


        System.out.println("3-ий параллелограмм:");

        Paralelogramm paralelogram3 = new Paralelogramm(6.0, 4.0);

        System.out.println("Площадь 3 параллелорамма: " + paralelogram3.getArea());
        System.out.println("Периметр 3 параллелорамма: " + paralelogram3.getPerimeter());
        System.out.println("Количество параллелограммов: " + Paralelogramm.getCount());
    }
}
