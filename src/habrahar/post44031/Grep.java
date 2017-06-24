package habrahar.post44031;

import java.io.*;
import java.util.ArrayList;

class Grep {
    private String inputName;
    private String outputName;
    private String sample;
    private ArrayList<String> lines;

    Grep() {
        inputName = "c:\\Users\\gennady\\IdeaProjects\\Exercises\\src\\habrahar\\post44031\\input.txt";
        outputName = "c:\\Users\\gennady\\IdeaProjects\\Exercises\\src\\habrahar\\post44031\\output.txt";
        sample = "a";
        lines = new ArrayList<>();
    }
    private void doGrep() {
        for (String str: lines) {
            if(str.contains(sample)) {
                System.out.println(str);
            }
        }
    }
    private void readInput() throws IOException {
        File file = new File(inputName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(outputName)));
        for (String str: lines) {
            bufferedWriter.write(str + "\r\n");
        }
        bufferedWriter.close();
    }
    void  run() throws IOException {
        readInput();
        doGrep();
    }
}
