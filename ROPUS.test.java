package ROPUS.test;

import java.util.Scanner;

/**
 *
 * @Author Mecry
 * @Version 1.21
 * @Since 2020.6.27
 *
 */

public class test {
    public static void main(String[] args) {
        int ThisNum = (int) (Math.random() * 100) + 1
                , min = 1, max = 100, times = 0;
        while (true) {
            System.out.print("(" + min +
                    "~" + max + ") Please enter the number" +
                    " you want to guess：\n");
            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            times ++;

            if (in == ThisNum) {
                System.out.println("It took only " + times +
                        " times to guess right! That's great!\n" +
                        "Exit? [2]");
                Scanner sc2 = new Scanner(System.in);
                int exit = sc2.nextInt();
                if (exit == 2) {
                    return;
                } else {
                    ThisNum = (int) (Math.random() * 100) + 1;
                    times = 0;
                    min = 1;
                    max = 100;
                }
            } else if (in < ThisNum  &&  in >= min  &&  in <= max) {
                sm();
                min = in;
            } else if (in > ThisNum  &&  in >= min  &&  in <= max) {
                bi();
                max = in;
            } else {
                System.out.print("no in " + min +
                        "~" + max + ".");
                times  --;
            }
        }
    }

    private static void bi() {
        System.out.println("The number you guessed was bigger.");
    }

    private static void sm() {
        System.out.println("The number you guessed was small.");
    }
}
