// ジェネリクス : generics

// ジェネリクス : 汎用化されたデータ型で、クラスやインターフェースを作成することができる


// ジェネリクス不使用の場合
// class MyInteger {
//     public void getThree(int x) {
//         System.out.println(x);
//         System.out.println(x);
//         System.out.println(x);
//     }
// }


// getThree()をintだけでなく、doubleやStringでも行いたい場合、修正が面倒。
// ジェネリクスを用いれば、引数のデータ型を汎用化することができる

// ジェネリクス使用の場合
// <T>を記述することで、どのデータ型にも対応可能となる
class MyData<T> {
    public void getThree(T x) {
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
    }
}

public class MyApp {
    public static void main(String[] args) {
        // ジェネリクス不使用の場合
        // MyInteger mi = new MyInteger();
        // mi.getThree(55); // 55, 55, 55

        // ジェネリクス使用の場合
        MyData<Integer> i = new MyData<>(); // <>に指定する型は参照型しか指定できない
        i.getThree(32); // 32, 32, 32
        MyData<String> s = new MyData<>();
        s.getThree("Hello"); // Hello, Hello, Hello

    }
}
