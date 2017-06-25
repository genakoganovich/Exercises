package judge;

import java.io.PrintWriter;
import java.util.Scanner;

public class Eniya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        out.print(n * a * b * 2);
        out.flush();
    }
}
