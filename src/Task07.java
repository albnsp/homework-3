import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание 7");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите символ: ");
        String simvol = sc.nextLine();
        Pattern patlatletter = Pattern.compile("[a-zA-Z]");
        Matcher matlatletter = patlatletter.matcher(simvol);

        Pattern patkirletter = Pattern.compile("[а-яА-Я]");
        Matcher matkirletter = patlatletter.matcher(simvol);

        Pattern patnumber = Pattern.compile("[0-9]");
        Matcher matnumber = patnumber.matcher(simvol);

        if (matlatletter.matches()) {
            System.out.println("латиница");
        } else if (matkirletter.matches()){
            System.out.println("кириллица");
        } else if (matnumber.matches()) {
            System.out.println("цифра");
        } else {
            System.out.println("невозможно определить");
        }
        System.out.println();
    }
}
