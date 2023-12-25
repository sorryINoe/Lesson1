import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.printf("Введите числа b и c для вычесления выражения a=4*(b+c-1)/2" + "\n"
                + "Введите b" + "\n");
        b = scanner.nextInt();
        System.out.printf("Введите c" + "\n");
        c = scanner.nextInt();
        a=0;
        a = 4*(b+c-1)/2;

        System.out.println( "a=" + a );
    }
}