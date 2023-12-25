import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.printf("Введите 2 числа" + "\n");
        a = scanner.nextInt();
        b=a ;
        a = scanner.nextInt();


        System.out.println("Замена мест " + a + " "+ b);

    }
}