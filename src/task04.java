import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        System.out.println("задание 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату х: ");
        double x = sc.nextDouble();
        System.out.println("Введите координату y:");
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("точка находится в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("точка находится в 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("точка находится в 3 четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("точка находится в 4 четверти");
        }
        System.out.println();
    }
}
