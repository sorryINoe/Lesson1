import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,a,b,c;
        System.out.printf("Введите трехзначное число" + "\n");
        n = scanner.nextInt();

        a = n / 100 % 10;
        b = n / 10 % 10;
        c = n % 10;
        n = a+b+c;

        System.out.println("Cумма цифр в числе " + n);

    }
}