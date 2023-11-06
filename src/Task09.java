import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("задание 9");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите координаты начало отрезка (x1 y1)");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        System.out.println("введите координаты конца отрезка (x2 y2)");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        if (x1 == x2 && y1 == y2) {
            System.out.println("Отрезок является точкой.");
        } else if (x1 == x2) {
            System.out.println("Отрезок является вертикальной линией.");
        } else {
            double slope = (y2 - y1) / (x2 - x1);
            if (slope == 0) {
                System.out.println("Отрезок является горизонтальной линией.");
            } else if (slope > 0) {
                System.out.println("Отрезокявляется подъемом.");
            } else {
                System.out.println("Отрезок является спуском.");
            }
        }
    }
}
