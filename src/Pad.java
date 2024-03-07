public class Pad {
    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}