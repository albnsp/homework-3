import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("задание 10");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер квартиры");
        int number = sc.nextInt();
        var podezd = (number+35) /36;
        number-= (podezd - 1) * 36;
        var etag = (number +3) / 4;
        System.out.println("podezd " + podezd);
        System.out.println("etag " + etag);
    }
}
