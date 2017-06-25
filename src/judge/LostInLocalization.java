package judge;

import java.io.PrintWriter;
import java.util.Scanner;

public class LostInLocalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        if(n >=1 && n <=4) {
            out.print("few");
        } else if(n >= 5 && n <= 9) {
            out.print("several");
        } else if(n >= 10 && n <= 19) {
            out.print("pack");
        } else if (n >= 20 && n <= 49) {
            out.print("lots");
        } else if(n >= 50 && n <= 99) {
            out.print("horde");
        } else if(n >= 100 && n <= 249) {
            out.print("throng");
        } else if(n >= 250 && n <= 499) {
            out.print("swarm");
        } else if(n >= 500 && n <= 999) {
            out.print("zounds");
        } else {
            out.print("legion");
        }
        out.flush();
    }
}
