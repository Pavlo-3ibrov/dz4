package app;

import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        kvadrat();
        obiemCilindra(3.5, 10.0);
        int[] numbers = {10, 20, 30, 40, 50};
        arraySum(numbers);
        reverseString();
        stepeniAB();
        printTextNTimes();
    }

    public static void kvadrat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Введіть ціле число:");
        int number = scanner.nextInt();
        int kvadrat = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює" + kvadrat + ".");
        System.out.println();
    }

    public static void obiemCilindra(double radius, double height) {
        double obiemCilindra = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + obiemCilindra + ".");
        System.out.println();

    }

    public static void arraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("3. Масив чисел: " + Arrays.toString(array));
        System.out.println("  Сума всіх елементів масиву дорівнює " + sum + ".");
        System.out.println();
    }

    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("4. Введіть рядок: ");
        String text = scanner.nextLine();

        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("  Рядок в зворотньому порядку: " + reversedText);
        System.out.println();

    }

    public static void stepeniAB() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("  Введіть b: ");
        int b = scanner.nextInt();

        int result = (int) Math.pow(a, b);
        System.out.println("  Результат " + a + "^" + b + " дорівнює " + result + ".");
        System.out.println();

    }

    public static void printTextNTimes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("6. Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("  Введіть текстовий рядок: ");
        String text = scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("  " + text);
        }
    }
}
