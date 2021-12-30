// 列挙型

// 列挙型 : クラスのように自分で作ることができるデータ型。定数をまとめたもの。
// 列挙型を宣言するには「enum」というキーワードを使用する。
// 列挙型を定義すると、「ordinal()」という特殊なメソッドも同時に定義され、0から始まる連番がセットされる。
// 列挙型の中には、定数以外にフィールドやメソッドを指定することも可能。


// 例 : 処理結果の成否を列挙型で保持する
enum Result {
    SUCCESS, // ordinal() = 0
    ERROR, // ordinal() = 1
}


public class MyApp {
    public static void main(String[] args) {
        Result res;
        res = Result.ERROR;

        switch (res) {
            case SUCCESS:
                System.out.println("OK!");
                System.out.println(res.ordinal()); // 0
                break;
            case ERROR:
                System.out.println("NG!");
                System.out.println(res.ordinal()); // 1
                break;
        }
    }
}
