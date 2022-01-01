// ArrayList

// ArrayList : 配列のようなもの。配列と異なり、あとから要素の追加/削除が可能
// ArrayListを使うにはimportが必要

// ArrayListと同じくListインターフェースを実装したLinkedListクラスもある。
// LinkedListとArrayListはまったく同じように使用できるが、データ構造が異なっており、特徴が異なる。
// ArrayList : 要素の検索が速い、要素の追加と削除が遅い
// LinkedList : 要素の検索が遅い、要素の追加と削除が速い


import java.util.*;
public class MyApp {
    public static void main(String[] args) {
        // ArrayList<Integer> sales = new ArrayList<>();
        List<Integer> sales = new ArrayList<>();
        // ArrayListだけで使えるメソッドはあまり使うことはなく、ArrayListが実装しているList型のインターフェースで宣言することもよくある。

        // 要素の追加
        sales.add(10);
        sales.add(20);
        sales.add(30);

        // 追加した要素の確認
        // sales.size() : 要素の個数
        for (int i = 0; i < sales.size(); i++) {
            // sales.get() : 要素の取得
            System.out.println(sales.get(i)); // 10, 20, 30
        }

        // for文の別の書き方
        // for (Integer sale : sales) {
        //     System.out.println(sale);
        // }


        // 要素の変更
        sales.set(0, 100); // 0番目の要素を100に変更

        // 要素の削除
        sales.remove(2); // 2番目の要素を削除


        for (Integer sale : sales) {
            System.out.println(sale); // 100, 20
        }
    }
}
