// HashMap

// HashMap : 複数のデータを管理するためのもの。keyとvalueでデータを管理する。
// このほか、HashMapと似たようなクラスに「TreeMap」クラス、「LinkedHashMap」クラスがある。
// これらはデータの操作については同じだが、データが保持される順番が異なる。
// HashMap : データの順番不定
// TreeMap : keyの順番
// LinkedHashMap : データが追加された順番


import java.util.*;
public class MyApp {
    public static void main(String[] args) {
        // HashMap<String, Integer> sales = new HashMap<>(); // keyがString, valueがInteger
        Map<String, Integer> sales = new HashMap<>();

        // 要素の追加 : put()
        sales.put("tom", 10);
        sales.put("bob", 20);
        sales.put("steve", 30);

        // 要素の取得 : get("key")
        // 要素の個数 : size()
        System.out.println(sales.get("tom")); // 10
        System.out.println(sales.size()); // 3


        // すべての要素取り出し
        for (Map.Entry<String, Integer> sale : sales.entrySet()) {
            System.out.println(sale.getKey() + ": " + sale.getValue()); // tom: 10, bob: 20, steve: 30
        }


        // 値の更新
        sales.put("tom", 100);

        // 要素の削除 : remove("key")
        sales.remove("steve");

        for (Map.Entry<String, Integer> sale : sales.entrySet()) {
            System.out.println(sale.getKey() + ": " + sale.getValue()); // tom: 100, bob: 20
        }

    }
}







