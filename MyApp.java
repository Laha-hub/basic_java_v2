public class MyApp {

    public static void main(String[] args) {
        // 文字 : char
        char a = 'a'; // シングルクォーテーション！

        // 整数 : byte, short, int, long
        int x = 10;
        long y = 55555555555L; // 数値の末尾にL(or l)が必要

        // 浮動小数点数 : float, double
        double d = 23423.344;
        float f = 32.33F; // 数値の末尾にF(or f)が必要

        // 論理値 : boolean
        boolean flag = true; // or false

        // 文字列 : String
        // String msg = "Hello World Again!"; // ダブルクォーテーション！
        String msg = "Hello Wo\nrld Again\t!";
        System.out.println(msg);

        // 特殊文字（Stringにて使用可能）
        // \n : 改行
        // \t : タブ
    }

}
