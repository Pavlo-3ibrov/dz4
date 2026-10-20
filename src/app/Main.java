package app;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};

        System.out.println("Елементи масиву: " + Arrays.toString(numbers));


        int videmniSum = 0;
        int videmniCount = 0;
        for (int num : numbers) {
            if (num < 0) {
                videmniSum += num;
                videmniCount++;
            }
        }
        if (videmniCount > 0) {
            System.out.println("Сума від'ємних: " + videmniSum);
        } else {
            System.out.println("Від'ємних чисел немає");
        }


        int parni = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                parni++;
            }
        }
        if (parni > 0) {
            System.out.println("Кількість парних: " + parni);
        } else {
            System.out.println("Парних чисел немає");
        }


        int neparni = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                neparni++;
            }
        }

        if (neparni > 0) {
            System.out.println("Кількість непарних: " + neparni);
        } else {
            System.out.println("Непарних чисел немає");
        }


        int min = numbers[0];
        int minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Найменше число: " + min + "(З індексом " + minIndex + ")");


        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Найбільше число: " + max + "(З індексом " + maxIndex + ")");


        int firstNegative = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegative = i;
                break;
            }
        }
        if (firstNegative == -1) {
            System.out.println("від'ємних чисел немає");
        } else if (firstNegative == numbers.length - 1) {
            System.out.println("після першого від'ємного немає чисел...");
        } else {

            double sum = 0;
            int count = 0;

            for (int i = firstNegative + 1; i < numbers.length; i++) {
                sum += numbers[i];
                count++;
            }
            double average = sum / count;

            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n" , average);
        }
    }
}











