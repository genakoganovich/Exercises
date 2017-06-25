package judge;


import java.io.PrintWriter;
import java.util.Scanner;

public class TwoGangsters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int harry = in.nextInt();
        int larry = in.nextInt();
        out.print((harry + larry - 1 - harry) + " " + (harry + larry - 1 - larry));
        out.flush();
    }
}
