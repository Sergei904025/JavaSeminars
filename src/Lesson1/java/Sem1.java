package Lesson1.java;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Sem1 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What os your name?");
//        String name = scanner.nextLine();
//        scanner.close();
//        System.out.println("Hello " + name);
        //task0();
        //task1();
        //task2();
        //task3();
        System.out.println(task4());

    }

    private static double task4() {
        // написать функцию, для возведения а в степень b (b может быть отрицательным);
        // пример а = 3; b = 2; ответ 9.
        Scanner scanner = new Scanner(System.in);

        System.out.println(" input a ");
        int a = scanner.nextInt();
        System.out.println(" input b ");
        int b = scanner.nextInt();
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result *= a;
        }
        return b > 0 ? result : 1/result;
    }



    public static void task3() {

        // текст задачи
        // во фразе -

        String frase = "I like to see you java";

        String[] fraseParts = frase.split(" ");

        for (int i = fraseParts.length - 1; i >= 0; i--) {
            System.out.print(fraseParts[i].toLowerCase() + " ");

        }
    }

    private static void task2() {
        // Дан массив и число val = 3;
        //  Если в массиве есть числа равные заданному, нкжно перенести эти элементы в конец массива.
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArr[current++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }

    // вывести максимальное количество подряд идущих 1.
    private static void task1() {

        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else if (count > maxOnes) {
                maxOnes = count;
                count = 0;
            }
            if (i == arr.length - 1 && count > maxOnes) maxOnes = count;

        }
        System.out.println(maxOnes);

    }

    static void task0() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        LocalTime localTime = LocalTime.now();
        int hour = LocalTime.now().getHour();
        if (hour > 5 && hour < 12) System.out.println("Good morning " + name);
        else if (hour < 18) System.out.println("Good afternoon " + name);
        else if (hour < 23) System.out.println("Good evening " + name);
        else System.out.println("Good night " + name);


    }


}
