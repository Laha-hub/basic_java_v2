// constructor : クラスがインスタンス化されるときに、必ず実行される特殊なメソッド


class User {
    String name;

    // constructorの宣言はクラスと同じ名前のメソッドを作ればよい
    User(String name) {
        // メソッド内からクラスのフィールドにアクセスするには「this」という特殊なキーワードを使う
        this.name = name;
    }

    // constructorはメソッドなので、overloadも有効
    User() {
        // this.name = "Me";

        // this() : このクラスのconstructorという意味
        this("Me!"); // 引数なしでUserクラスをインスタンス化した場合に、結果として、this.nameに"Me!"が設定される
    }

    void sayHi() {
        System.out.println("Hi! " + this.name);
    }
}

public class MyApp {
    public static void main(String[] args) {
        User tom;
        tom = new User("Tom");
        System.out.println(tom.name); // Tom
        tom.sayHi(); // Hi! Tom

        User me;
        me = new User();
        System.out.println(me.name); // Me
        me.sayHi(); // Hi! Me

    }
}
