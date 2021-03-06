package habrahar.post44031.grep;

import java.io.*;
import java.util.ArrayList;

class Grep {
    private String inputName;
    private String outputName;
    private String outputResultName;
    private String sample;
    private ArrayList<String> lines;

    Grep() {
        inputName = "c:\\Users\\gennady\\IdeaProjects\\Exercises\\src\\habrahar\\post44031\\grep\\input.txt";
        outputName = "c:\\Users\\gennady\\IdeaProjects\\Exercises\\src\\habrahar\\post44031\\grep\\output.txt";
        outputResultName = "c:\\Users\\gennady\\IdeaProjects\\Exercises\\src\\habrahar\\post44031\\grep\\outputResult.txt";
        sample = "A";
        lines = new ArrayList<>();
    }
    private void doGrep() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(outputResultName)));
        for (String str: lines) {
            if(str.toLowerCase().contains(sample.toLowerCase())) {
                bufferedWriter.write(str + " contains " + sample + "\r\n");
            }
        }
        bufferedWriter.close();
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
