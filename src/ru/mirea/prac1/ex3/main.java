package ru.mirea.prac1.ex3;

public class main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        System.out.println(sum1);
        int i = 0;
        while (i < 3) {
            sum2 += array[i];
            i++;
        }
        System.out.println(sum2);
        i = 0;
        do {
            sum3 += array[i];
            i++;
        } while (i < 3);
        System.out.println(sum3);
    }
}
