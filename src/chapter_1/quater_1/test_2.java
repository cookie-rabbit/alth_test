package chapter_1.quater_1;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class test_2 {
    public static void main(String[] args) {
        getType(double_calculate((1 + 2.236), 2));

        //    Java中小数默认为double型，如果想输入float型需要在数字后面加 f
        getType(float_calculate(1, 2, 3, 4.0f));
        getType(double_calculate2(1, 2, 3, 4.0));

        getType(judge_bigger(4.1f, 4));

        //    注意单引号为 char ， 双引号为 String
        getType(int_int_str_plus(1, 2, '3'));
        getType(str_int_str_plus(1, 2, "3"));
    }

    //    输出传入的函数运行结果和结果类型
    public static void getType(Object test) {
        System.out.println(test);
        System.out.println(test.getClass().getName());
    }

    /*        (1 + 2.236)/2
            输出 double 型，输入 double 型*/
    public static double double_calculate(double a, double b) {
        return a / b;
    }

    //    输出float型，输入 float 型
    public static float float_calculate(int a, int b, int c, float d) {
        return a + b + c + d;
    }

    //    可以输出 double 型，输入 float 型,但是不能默认输入 double 型，输出 float 型，因为会损失精度，除非强制转换
    public static double double_calculate2(int a, int b, int c, double d) {
        return a + b + c + d;
    }

    //    4.1 >= 4
    public static boolean judge_bigger(float a, int b) {
        return a >= b;
    }

    /*1 + 2 + "3" 输出54
    当输入为 char 时， Java 会把字符转为 ASCII 码十进制数字后再进行加法运算,字符 3 的 ASCII 十进制码为 51*/
    public static int int_int_str_plus(int a, int b, char c) {
        return a + b + c;
    }

    //    当输入为 String 时， Java 会按顺序计算并在其他类型与字符串类型相加时将其他类型转为字符串然后拼接起来；
    //    输出 33
    public static String str_int_str_plus(int a, int b, String c) {
        return a + b + c;
    }
}
