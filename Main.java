import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,a,b;

        System.out.printf("Введите двухзанчное число" + "\n");
        n = scanner.nextInt();
        a = n/10%100;
        b = n%10;
        n = a+b;

        System.out.println("Сумма цифр в числе "+n);


    }
}