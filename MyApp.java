// Stream API

// Stream API : Java 8から導入。複数の値を順番に処理していくための仕組み。ArrayListなどの集合データと併せて使用される。
// Stream APIを用いると複雑な処理をスッキリ記述することが可能となる。


import java.util.*;
public class MyApp {
    public static void main(String[] args) {
        // 配列において、宣言と同時に値を格納するには、Arrays.asList()を用いれば良い（java.util.*のimport必要）
        List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));

        // salesの値に対して、何らかの処理をする
        // (1) Stream APIを使わない場合
        // for (Integer sale : sales) {
        //     System.out.println(sale);
        // }
        // 処理内容がシンプルな場合はこれでも良いが、処理内容が複雑になった場合、Stream APIが便利


        // (2) Stream APIを使った場合
        // まずはデータ集合をStreamにする
        sales
            .stream()
            // 中間処理（0個以上）
            .filter(e -> e % 3 == 0) // ラムダ式 : 引数 -> 処理（salesの各データがeに入り、e%3==0がtrueのもののみ抽出）
            .map(e -> "( " + e + " )") // 抽出された全データに「( )」を付与
            // 終端処理
            .forEach(System.out::println); // メソッド参照 : メソッド自体（この場合だとSystem.out.println()）をforEach()に渡せる
    }
}
