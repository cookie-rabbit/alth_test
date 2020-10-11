package chapter_1.quater_1;

public class test_1 {
    public static void main(String[] args) {
        System.out.println(float_calculate((5 + 10), 2));
        System.out.println(int_calculate((5 + 10), 2));

        System.out.println(sci_calculate(2.0e-6, 100000000.1));

        System.out.println(bool_calculate(true, false, true, true));
    }

    //( 0 + 15 ) / 2
    public static float float_calculate(float a, float b) {
        return a / b;
    }

    public static int int_calculate(int a, int b) {
        return a / b;
    }

    //2.0e-6 * 100000000.1
    public static double sci_calculate(double a, double b) {
        return a * b;
    }

    //true && false || true && true
    public static boolean bool_calculate(boolean a, boolean b, boolean c, boolean d) {
        return a && b || c && d;
    }

}
