// パッケージとアクセス権

// パッケージ : 関連するクラスをまとめたり、名前の衝突を回避できる
    // パッケージ名 : 組織のドメイン名を逆さにしたものをつける（推奨）

// アクセス修飾子 : クラス、フィールド、メソッドの呼び出しを管理するもの（publicなど）
    // public : どこからでもアクセス可能
    // 無記名（package private） : 同じパッケージからのみ呼び出し可能

// アプリの基点となるクラスは、「main()メソッド」を持つクラスで、必ずこのクラスはpublicにすること
// main()も必ずpublicにすること

// アクセス修飾子（フィールド、メソッド）
    // public : 同上
    // (package private) : 同上
    // private : 同じクラスからのみ呼び出し可能
    // protected : 現在のクラスとサブクラス（継承したクラス。別パッケージでも可）からアクセス可能



class User {
    String name;
    User(String name) {
        this.name = name;
    }
    User() {
        this("Me!");
    }
    void sayHi() {
        System.out.println("Hi! " + this.name);
    }
}


// Userクラスの継承(extends)
// 親クラス（superクラス） => Userクラス
// 子クラス（サブクラス） => AdminUserクラス
class AdminUser extends User {
    // 子クラスのconstructor
    AdminUser(String name) {
        // super()で、親クラスのconstructor（= Userr()）を呼び出す
        super(name);
    }
    void sayHello() {
        System.out.println("Hello! " + this.name);
    }

    // override : 親クラスのメソッド内容を子クラスにて上書き
    // overrideを行うときはアノテーション（@〜）という仕組みを使った方が、明示的かつエラー検知できるので良い
    @Override // アノテーション : 親クラスのメソッド名を間違えて記述した場合などに、エラーを出力してくれる
    void sayHi() {
        System.out.println("[admin] Hi! " + this.name);
    }
}

public class MyApp {
    public static void main(String[] args) {
        User tom = new User("Tom");
        System.out.println(tom.name); // Tom
        tom.sayHi(); // Hi! Tom

        AdminUser bob = new AdminUser("Bob");
        System.out.println(bob.name); // Bob
        bob.sayHi(); // [admin] Hi! Bob （overrideが効いている）
        bob.sayHello(); // Hello! Bob

    }
}
