package codingbat.warmup1;


public class MissingChar {
    public static void main(String[] args) {
        String str = "kitten";
        System.out.println(missingChar(str, 0));
    }

    public static String missingChar(String str, int n) {
        String s = str.substring(n, n + 1);
        return str.replace(s, "");
    }

}
