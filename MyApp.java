public class MyApp {

    public static void main(String[] args) {
        // データ型の変換（キャスト）

        // double d = 52343.231;
        // double型をint型へ変換する場合
        // int i = d;   // <= Errorとなる
        // int i = (int)d;     // <= OK!
        // System.out.println(i); // 52343


        // ミスしやすい例
        // int i = 10;
        // double d = i / 4;
        // System.out.println(d); // 2.0になってしまう！！
        // 「i / 4」の時点でもint型のため、2.5ではなく、2となってdに代入される。

        // 修正版
        int i = 10;
        double d = (double)i / 4;
        System.out.println(d); // 2.5

    }

}
