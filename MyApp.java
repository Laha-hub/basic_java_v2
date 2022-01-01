// Math, Random クラス


// Math.ceil(d) : 小数点以下を切り上げ
// Math.floor(d) : 小数点以下を切り捨て
// Math.round(d) : 小数点以下を四捨五入
// Math.PI : （定数）円周率

import java.util.Random;
public class MyApp {
    public static void main(String[] args) {
        double d = 53.234;
        System.out.println(Math.ceil(d)); // 54.0
        System.out.println(Math.floor(d)); // 53.0
        System.out.println(Math.round(d)); // 53
        System.out.println(Math.PI); // 3.14...
        // Math.random()でも乱数生成できるが、Randomクラスを使った方が高速・高精度
        // Randomクラスを使うにはimportが必要

        Random r = new Random();
        System.out.println(r.nextDouble()); // 0以上1未満の浮動小数点
        System.out.println(r.nextInt(100)); // 0以上100未満の整数
        System.out.println(r.nextBoolean()); // ランダムなtrue/false
    }
}
