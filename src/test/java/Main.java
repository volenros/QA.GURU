package test.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char sim = scanner.next().charAt(0);
        int sum;

        if (sim == '+') {
            sum = num1 + num2;
            System.out.println("Результат: " + sum);
        } else {
            sum = num1 - num2;
            System.out.println("Результат: " + sum);
        }
    }
}
