// HashSet

// HashSet : ArrayList同様、複数のデータを扱うもの。重複を許さない点とデータを保持する順番が定まらない点が異なる。
// このほか、HashSetと似たようなクラスで、「TreeSet」クラス, 「LinkedHashSet」クラスがある。
// これらもHashSetと操作は同じだが、データをお保持する順番が異なる。
// HashSet : 要素の順番不定
// TreeSet : 要素の値順にソートされる
// LinkedHashSet : 要素の追加された順



import java.util.*;
public class MyApp {
    public static void main(String[] args) {
        // HashSet<Integer> sales = new HashSet<>();
        Set<Integer> sales = new HashSet<>();

        // 要素の追加 : add()
        sales.add(10);
        sales.add(20);
        sales.add(30);
        sales.add(10); // HashSetとSetクラスは重複を許さないので、追加されない
        // また、HashSetとSetクラスは要素の順番が定まらないので、何番目の要素を取り出すということもできない

        // 要素の個数 : size()
        System.out.println(sales.size()); // 3 (重複を許さないため)

        // すべての要素を取り出す（for文）
        for (Integer sale : sales) {
            System.out.println(sale); // すべての要素を取り出せるが、順番が固定されない
        }

        // 要素の削除 : remove()
        sales.remove(30);

        // すべての要素を取り出す（for文）
        for (Integer sale : sales) {
            System.out.println(sale); // すべての要素を取り出せるが、順番が固定されない
        }
    }
}


