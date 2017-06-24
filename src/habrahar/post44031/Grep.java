package habrahar.post44031;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class Grep {
    private String sample = "a";
    private String[] lines;

    private void doGrep() {
        for (String str: lines) {
            if(str.contains(sample)) {
                System.out.println(str);
            }
        }
    }
    private void readInput() {
        /*String input = "line1: a" + "\n" + "line2: b" + "\n" + "line3: c";
        System.out.println(input);

        lines = input.split("\n");
        for(String str: lines) {
            System.out.println(str);
        }
        System.out.println("size: " + lines.length);*/
        File file = new File("input.txt");
    }
    void  run() {
        readInput();
        doGrep();
    }
}
