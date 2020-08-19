package F5PLUS.test.F5PLUS;

import F5PLUS.runews.Game.lulo;

import java.util.Scanner;

/**
 *
 * @Author Mecry
 * @Version 1.8
 * @Since 2020.6.22
 *
 */

public class test {
    public static void main(String[] args) {
        Ensnare();
        Scanner ymn = new Scanner(System.in);
        ymn.nextLine();
        while (true) {
            Ensnare2();
            Scanner sc = new Scanner(System.in);
            String people = sc.nextLine();

            switch (people) {
                case "1": {
                    System.out.println("\nAre you sure you want to" +
                            " compete with our" +
                            " \"king of victory\" Xiao Wang?\n" +
                            "  [1]Yes!  [2]No");
                    Scanner sc2 = new Scanner(System.in);
                    int b = sc2.nextInt();
                    if (b == 1) {
                        lulo lulo = new lulo();
                        lulo.Gamexw();
                    }
                    break;
                }
                case "2": {
                    System.out.println("\nAre you sure you want to" +
                            " compete with our" +
                            "\"a surprising\" Xiao hong?\n" +
                            "  [1]Yes!  [2]No");
                    Scanner sc2 = new Scanner(System.in);
                    int b = sc2.nextInt();
                    if (b == 1) {
                        lulo lulo = new lulo();
                        lulo.Gamexh();
                    }
                    break;
                }
                case "3": {
                    System.out.println("\nAre you sure you want to" +
                            " compete with our\n" +
                            "\" three or four after the line\"" +
                            "Xiao Ming?\n" +
                            "  [1]Yes!  [2]No");
                    Scanner sc2 = new Scanner(System.in);
                    int b = sc2.nextInt();
                    if (b == 1) {
                        lulo lulo = new lulo();
                        lulo.Gamexm();
                    }
                    break;
                }
                case "Mecry zui 6!": {
                    System.out.println("\nAre you sure you want to" +
                            " compete with our " +
                            "Mecry zui 6!?\n" +
                            "  [1]Yes!  [2]No");
                    Scanner sc2 = new Scanner(System.in);
                    int b = sc2.nextInt();
                    if (b == 1) {
                        lulo lulo = new lulo();
                        lulo.GameMe();
                    }
                    break;
                }
                default: {
                    System.out.println("\nAre you sure you want to" +
                            " compete with our " +
                            people + "?\n  [1]Yes!  [2]No");
                    Scanner sc2 = new Scanner(System.in);
                    int b = sc2.nextInt();
                    if (b == 1) {
                        lulo lulo = new lulo();
                        lulo.Gameanyp();
                    }
                    break;
                }
            }

        System.out.println("Exit? [2]");
            Scanner sc2 = new Scanner(System.in);
            int exit = sc2.nextInt();
            if (exit == 2) {
                return;
            }
        }
    }

    private static void Ensnare() {
        System.out.print("Hallo！" +
                "Welcome to compete with us " +
                "\"Rock Scissors Paper\"!\n\n" +
                "Please enter your name : ");
    }
    private static void Ensnare2() {
        System.out.println("Who do you want to" +
                " compete with? \nOur" +
                " \"king of victory\" Xiao Wang, [1]\n" +
                "\"a surprising\" Xiao hong [2]\nand" +
                "\" three, four, then go\"Xiao Ming[3]\n " +
                "and so on[any key] are your choice!");
    }
}
