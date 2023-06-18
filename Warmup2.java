public class Warmup2 {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 3));

    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }
}
