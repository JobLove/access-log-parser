import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int first_number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int second_number = new Scanner(System.in).nextInt();
        System.out.println("Сумма: " + (first_number + second_number));
        System.out.println("Разность: " + (first_number - second_number));
        System.out.println("Произведение: " + (first_number * second_number));
        System.out.println("Чаcтное: " + ((double) first_number / second_number));
    }
}
