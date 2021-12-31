// ラッパークラス : Wrapper Class

// 基本データ型には、それに対応する参照型のクラスが用意されている
// int => Integerクラス
// double => Doubleクラス
// これらのIntegerクラスやDoubleクラスのことを「ラッパークラス」と呼ぶ




public class MyApp {
    public static void main(String[] args) {
        // 基本データ型を対応するラッパークラスに変換する方法
        // Integer i = new Integer(32); // 基本データ型の'32'が参照型のラッパークラスIntegerとして設定

        // ラッパークラスの値を基本データ型として取り出す方法
        // int n = i.intValue();

        // 省略記法
        Integer i = 32; // auto boxing : 自動変換（基本 => 参照）
        i = null; // iがnullになるので、次の行で自動変換できずにエラーになる
        int n = i; // auto unboxing : 自動変換（参照 => 基本）

        // 参照型データにおいて、どのメモリ領域も参照していない状態にしたい場合
        // i = null;

        System.out.println();
    }
}
