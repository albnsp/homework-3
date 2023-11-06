import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        System.out.println("задание 5");
        String[] nazvanie = {"кролик", "крыса", "бык", "тигр", "дракон", "змея", "лошадь", "коза",
                "обезьяна", "петух", "собака", "свинья"};
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число, месяц, год (например: 512 1974");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        String zodiacGod = nazvanie[(y - 4) % 12];

        String zodiacSing = "";
        switch (m) {
            case 1:
                if (d<20) {
                    zodiacSing = "козерог";
                } else {
                    zodiacSing = "водолей";
                }
                break;
            case 2:
                if (d<19) {
                    zodiacSing = "водолей";
                } else {
                    zodiacSing = "рыбы";
                }
                break;
            case 3:
                if (d<21) {
                    zodiacSing = "рыбы";
                } else {
                    zodiacSing = "овен";
                }
                break;
            case 4:
                if (d<20) {
                    zodiacSing = "овен";
                } else {
                    zodiacSing = "телец";
                }
                break;
            case 5:
                if (d<21) {
                    zodiacSing = "телец";
                } else {
                    zodiacSing = "близнецы";
                }
                break;
            case 6:
                if (d<22) {
                    zodiacSing = "близнецы";
                } else {
                    zodiacSing = "рак";
                }
                break;
            case 7:
                if (d<23) {
                    zodiacSing = "рак";
                } else {
                    zodiacSing = "лев";
                }
                break;
            case 8:
                if (d<23) {
                    zodiacSing = "лев";
                } else {
                    zodiacSing = "дева";
                }
                break;
            case 9:
                if (d<23) {
                    zodiacSing = "дева";
                } else {
                    zodiacSing = "весы";
                }
                break;
            case 10:
                if (d<23) {
                    zodiacSing = "весы";
                } else {
                    zodiacSing = "скорпион";
                }
                break;
            case 11:
                if (d<23) {
                    zodiacSing = "скорпион";
                } else {
                    zodiacSing = "стрелец";
                }
                break;
            case 12:
                if (d<22) {
                    zodiacSing = "стрелец";
                } else {
                    zodiacSing = "козерог";
                }
                break;
        }
        System.out.println("знак: " + zodiacSing);
        System.out.println("год: " + zodiacGod);
    }
}
