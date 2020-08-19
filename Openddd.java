package Openddd;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @Author Mecry
 * @Version 1.2020.6.8
 *
 */

public class Openddd {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("[1] notepad  [2] ms paint  \n" +
                    "[3] Shut down immediately  " +
                    "[4] Restart  \n" +
                    "[5] Disconnect network  \n" +
                    "[6] Check whether the network is unobstructed  \n" +
                    "[811] Exit");
            Scanner sc = new Scanner(System.in);
            int incr = sc.nextInt();
            if (incr == 1) {
                Runtime.getRuntime().exec("notepad");
                System.out.println("SYS: Open notepad\n");
            } else if (incr == 2) {
                Runtime.getRuntime().exec("mspaint");
                System.out.println("SYS: Open ms paint\n");
            } else if (incr == 3) {
                Runtime.getRuntime().exec("shutdown -s -t 00");
                System.out.println("[741] Cancel shutdown\n");
            } else if (incr == 4) {
                Runtime.getRuntime().exec("shutdown -r -t 00");
                System.out.println("SYS: Restart\n");
            } else if (incr == 5) {
                Runtime.getRuntime().exec("netsh wlan disconnec");
                System.out.println("SYS: Disconnect network\n");
            } else if (incr == 6) {
                Runtime.getRuntime().exec("ping www.baidu.com");
                System.out.println("SYS: Check whether the network is unobstructed\n");
            } else if (incr == 811) {
                System.out.println("\n\nBye!    :)");
                return;
            } else {
                System.out.println("Sorry, " +
                        "the command you entered cannot be recognized.\n" +
                        "Please check the command you entered and try again.\n");
            }
        }
    }
}
