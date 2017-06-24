package habrahar.post44031;

class Grep {
    private String sample = "a";
    private String input = "line1: a" + "\n" + "line2: b" + "\n" + "line3: c";
    private String[] lines;

    private void showInput() {
        System.out.println(input);
    }
    private void showGrepResult() {
        for (String str: lines) {
            if(str.contains(sample)) {
                System.out.println(str);
            }
        }
    }
    private void split() {
        lines = input.split("\n");
        for(String str: lines) {
            System.out.println(str);
        }
        System.out.println("size: " + lines.length);
    }
    void  run() {
        showInput();
        split();
        showGrepResult();
    }

}
