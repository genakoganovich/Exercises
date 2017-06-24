package habrahar.post44031.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Sort {
    private String inputName = "c:\\Users\\gennady\\IdeaProjects\\Exercises\\src\\habrahar\\post44031\\sort\\input.txt";
    private String outputName = "c:\\Users\\gennady\\IdeaProjects\\Exercises\\src\\habrahar\\post44031\\sort\\sortedOutput.txt";
    private ArrayList<String> lines;

    Sort() {
        lines = new ArrayList<>();
    }
    private void readInput() throws IOException {
        File inputFile = new File(inputName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String str;

        while ((str = bufferedReader.readLine()) != null) {
            lines.add(str);
        }
        bufferedReader.close();
    }
    private void sort() {
        Collections.sort(lines);
    }
    private void writeOutput() throws IOException {
        File outputFile = new File(outputName);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
        for (String line: lines) {
            bufferedWriter.write(line + "\r\n");
        }
        bufferedWriter.close();
    }
    void run() throws IOException {
        readInput();
        sort();
        writeOutput();
    }
}
