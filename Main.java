import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rez1,rez2,q,w;
        System.out.printf("Введите 2 натуральных числа" + "\n");
        q = scanner.nextInt();
        w = scanner.nextInt();

        rez1 =  q / w;
        rez2 = q % w;
        System.out.println("Результат деления " + rez1 + " " + "остаток " + rez2);
    }
}