import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        System.out.printf("Введите вещественное число" + "\n");
        n = scanner.nextDouble();
        System.out.printf("Число после округления до ближайшего целого "+"%.0f",n);


    }
}