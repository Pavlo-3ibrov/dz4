package app;

import java.util.Arrays;
import java.util.Scanner;

//Рецепт коктейлю «Рекурсивний»: десять грамів рому, тридцять грамів кока-коли і шістдесят грамів коктейлю «Рекурсивний».


public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{34, 10, 56, 22, 78, 5, 7, 15, 42, 30, 91, 1, 50, 18, 99};

        System.out.println("Елементи масиву: " + Arrays.toString(numbers));


        int n = numbers.length;
        for (int i = 1; i < n; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {

                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
        }
        System.out.println("Відсортовані елементи масиву: " + Arrays.toString(numbers));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку в масиві: ");
        int target = scanner.nextInt();


        int left = 0;
        int right = numbers.length - 1;
        int foundIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (numbers[mid] == target) {
                foundIndex = mid;
                break;

            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві:  " + foundIndex);
        } else {
            System.out.println("Число " + target + " відсутнє в масиві.");
        }

        scanner.close();


    }
}



