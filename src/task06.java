import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        System.out.println("задание 6");
        Scanner sc = new Scanner(System.in);
        int daysInYear = 0;
        System.out.println("введите год: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год "+ year + " является високосным");
            daysInYear = 366;
        }else  {
            System.out.println("Год "+ year + " не является високосным");
            daysInYear = 365;
        }
        System.out.println("В году " + year + " " + daysInYear + " дней");

        System.out.println();
    }
}
