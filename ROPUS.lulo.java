package F5PLUS.runews.Game;

import java.util.Scanner;

/**
 *
 * @Author Mecry
 * @Version 1.25
 * @Since 2020.6.22
 *
 */

public class lulo {
    public void Gamexw (){
        System.out.println("SYS: Start Xiao wang");
        int chu = (int) (Math.random() * 3) + 1;
        produce();
        Scanner csc = new Scanner(System.in);
        String cu = csc.nextLine();
        switch (cu) {
            case "1":
                if (chu == 1) {
                    Draw();
                    tack1();
                } else if (chu == 2) {
                    Win();
                    tack2();
                } else if (chu == 3) {
                    Lost();
                    tack3();
                }
                break;
            case "2":
                if (chu == 1) {
                    Lost();
                    tack1();
                } else if (chu == 2) {
                    Draw();
                    tack2();
                } else if (chu == 3) {
                    Win();
                    tack3();
                }
                break;
            case "3":
                if (chu == 1) {
                    Win();
                    tack1();
                } else if (chu == 2) {
                    Lost();
                    tack2();
                } else if (chu == 3) {
                    Draw();
                    tack3();
                }
                break;
        }
    }
    public void Gamexh () {
        System.out.println("SYS: Start Xiao hong");
        int chu = (int) (Math.random() * 3) + 1;
        produce();
        Scanner csc = new Scanner(System.in);
        String cu = csc.nextLine();
        switch (cu) {
            case "1":
                if (chu == 1) {
                    Draw();
                    tack1();
                } else if (chu == 2) {
                    Win();
                    tack2();
                } else if (chu == 3) {
                    Lost();
                    tack3();
                }
                break;
            case "2":
                if (chu == 1) {
                    Lost();
                    tack1();
                } else if (chu == 2) {
                    Draw();
                    tack2();
                } else if (chu == 3) {
                    Win();
                    tack3();
                }
                break;
            case "3":
                if (chu == 1) {
                    Win();
                    tack1();
                } else if (chu == 2) {
                    Lost();
                    tack2();
                } else if (chu == 3) {
                    Draw();
                    tack3();
                }
                break;
        }
    }
    public void Gamexm () {
        System.out.println("SYS: Start Xiao ming");
        produce();
        Scanner csc = new Scanner(System.in);
        String cu = csc.nextLine();
        switch (cu) {
            case "1":
                Draw();
                tack1();
                break;
            case "2":
                Draw();
                tack2();
                break;
            case "3":
                Draw();
                tack3();
                break;
        }
    }
    public void GameMe () {
        System.out.println("SYS: Start Any One");
        produce();
        Scanner csc = new Scanner(System.in);
        String cu = csc.nextLine();
        switch (cu) {
            case "1":
                Win();
                tack2();
                break;
            case "2":
                Win();
                tack3();
                break;
            case "3":
                Win();
                tack1();
                break;
        }
    }
    public void Gameanyp () {
        System.out.println("SYS: Start Any One");
        int chu = (int) (Math.random() * 3) + 1;
        produce();
        Scanner csc = new Scanner(System.in);
        String cu = csc.nextLine();
        switch (cu) {
            case "1":
                if (chu == 1) {
                    Draw();
                    tack1();
                } else if (chu == 2) {
                    Win();
                    tack2();
                } else if (chu == 3) {
                    Lost();
                    tack3();
                }
                break;
            case "2":
                if (chu == 1) {
                    Lost();
                    tack1();
                } else if (chu == 2) {
                    Draw();
                    tack2();
                } else if (chu == 3) {
                    Win();
                    tack3();
                }
                break;
            case "3":
                if (chu == 1) {
                    Win();
                    tack1();
                } else if (chu == 2) {
                    Lost();
                    tack2();
                } else if (chu == 3) {
                    Draw();
                    tack3();
                }
                break;
        }
    }

    private void tack1() {
        System.out.println("He produced \"Rock\".");
    }
    private void tack2() {
        System.out.println("He produced \"Scissors\".");
    }
    private void tack3() {
        System.out.println("He produced \"Paper\".");
    }

    private void Win() {
        System.out.println("Win!");
    }
    private void Lost() {
        System.out.println("Lost!");
    }
    private void Draw() {
        System.out.println("Draw!");
    }
    private void produce() {
        System.out.println("produce [1]Rock  [2]Scissors  [3]Paper");
    }
}
