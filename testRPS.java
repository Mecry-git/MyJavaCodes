package RPS;

import java.util.Scanner;

/**
 *
 * @Author Mecry
 * @Version 1.0
 * @Since 2020.6.11
 *
 */

public class testRPS {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a :");
            int a = sc.nextInt();
            System.out.print("Enter b :");
            int b = sc.nextInt();
            System.out.println("[1] +  [2] -  [3] x  [4] /");
            int jjcc = sc.nextInt();

            if (jjcc == 1) {
                int c = jia(a,b);
                System.out.println("=" + c);
            }
            if (jjcc == 2) {
                int c = jian(a,b);
                System.out.println("=" + c);
            }
            if (jjcc == 3) {
                int c = cheng(a,b);
                System.out.println("=" + c);
            }
            if (jjcc == 4) {
                int c = chu(a,b);
                System.out.println("=" + c + "\n\n");
            }

            while (true) {
                System.out.println("EXIT? (Y ,N)");
                sc = new Scanner(System.in);
                String str = sc.nextLine();
                if ("Y".equals(str)) {
                    System.out.println("Bye!~~    :)  ");
                    return;
                } else  if ("N".equals(str)){
                    System.out.println("OK, Continue...\n\n");
                    break;
                } else {
                    System.out.println("I don't know what your choice is.\n");
                }
            }
        }
    }

    //private static xx com.oop

    private static int jia(int a,int b) {
        return a + b;
    }

    private static int jian(int a,int b) {
        return a - b;
    }

    private static int cheng(int a, int b) {
        return a * b;
    }

    private static int chu(int a, int b) {
        return a / b;
    }
}
