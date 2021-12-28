// class : 複雑なデータ型を自分で作りたいときに便利

// 例：何らかのアプリ作成をしており、ユーザーに関するデータ型が欲しい場合
// String s;のようにUser tom;として、様々なデータを持った変数を宣言できると便利 => classでできる


class User {
    // フィールド : classに属する変数
    String name = "Me!";

    void sayHi() {
        System.out.println("Hi!");
    }
}

public class MyApp {
    public static void main(String[] args) {
        // Classは参照型なので使用するには、インスタンス化が必要
        User tom; // データ型の指定
        tom = new User(); // インスタンス化

        System.out.println(tom.name); //Me!
        tom.sayHi(); // Hi!
    }
}
