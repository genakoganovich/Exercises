package judge;

import java.io.PrintWriter;
import java.util.Scanner;

public class Grisha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int f = in.nextInt();
        if(4 * 60 - (12 - f) * 45 >= 0) {
            out.print("YES");
        } else {
            out.print("NO");
        }
        out.flush();

    }
}
