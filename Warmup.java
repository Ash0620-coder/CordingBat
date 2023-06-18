public class Warmup {
    public static void main(String[] args) {
        System.out.println(sleepIn(true, false));
        System.out.println(monkeyTrouble(true, true));
        System.out.println(missingChar("kitten", 1));
    }

    public static String missingChar(String str, int n) {
        String result = str.substring(0, n) + str.substring(n+1);
        return result;
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return a * 4;
        } else {
            return a + b;
        }
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return Math.abs(21 - n);
        } else {
            return Math.abs(21 - n) * 2;
        }
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking == false) {
            return false;
        } else if (!(hour < 7 || 20 < hour)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (a * b < 0 && negative == false) {
            return true;
        } else if (a * b < 0 && negative == true) {
            return false;
        } else if (a < 0 && b < 00 && negative == true) {
            return true;
        } else {
            return false;
        }
    }

    public static String notString(String str) {

        if (str.startsWith("not")) {
            return str;
        } else {
            str = "not " + str;
            return str;
        }
    }
}
