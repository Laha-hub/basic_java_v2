// classの継承 : 既存のclassを拡張して、新しいclassを作成できるようになる

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
