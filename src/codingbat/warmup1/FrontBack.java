package codingbat.warmup1;

public class FrontBack {
    public static void main(String[] args) {
        String str = "";
        System.out.println(frontBack(str));
    }
    public static String frontBack(String str) {
        if(str.length() <= 1) {
            return str;
        } else {
            return str.substring(str.length() - 1, str.length()) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }
    }
}
