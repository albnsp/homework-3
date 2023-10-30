import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        System.out.println("задание 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("выберете животное:");
        System.out.println("1.кошка: ");
        System.out.println("2.собака: ");
        System.out.println("3.корова: ");
        System.out.println("4.волк: ");
        System.out.println("5.осел: ");
        System.out.println("6.лев: ");
        System.out.println("7.поросенок: ");
        System.out.println("8.лошадь: ");
        System.out.println("9.курица: ");
        System.out.println("10.мышка: ");
        int choiсe = sc.nextInt();
                switch (choiсe) {
                    case 1:
                        System.out.println("мяу");
                        break;
                    case 2:
                        System.out.println("гав");
                        break;
                    case 3:
                        System.out.println("муу");
                        break;
                    case 4:
                        System.out.println("ауф");
                        break;
                    case 5:
                        System.out.println("иА");
                        break;
                    case 6:
                        System.out.println("ррррррр");
                        break;
                    case 7:
                        System.out.println("хрю");
                        break;
                    case 8:
                        System.out.println("игого");
                        break;
                    case 9:
                        System.out.println("кококо");
                        break;
                    case 10:
                        System.out.println("пипипи");
                        break;
                    default:
                        System.out.println("неправильно ввели животное");

                        System.out.println();
                }
                }
    }




