package judge;

import java.io.PrintWriter;
import java.util.Scanner;

public class BicycleCodes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int firstCode = Integer.valueOf(in.nextLine());
        int secondCode = Integer.valueOf(in.nextLine());
        boolean stopFlag = false;
        for (int i = 0; i < 10000 && !stopFlag; i++) {
            if(i % 2 == 0 && i == firstCode) {
                out.print("yes");
                stopFlag = true;
            } else if(i % 2 != 0 && i == secondCode) {
                out.print("yes");
                stopFlag = true;
            } else if(i > firstCode && i > secondCode) {
                out.print("no");
                stopFlag = true;
            }
        }
        out.flush();
    }
}
