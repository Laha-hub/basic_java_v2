// constructor : クラスがインスタンス化されるときに、必ず実行される特殊なメソッド


class User {
    String name;
    int age;

    // constructorの宣言はクラスと同じ名前のメソッドを作ればよい
    User(String name, int age) {
        // メソッド内からクラスのフィールドにアクセスするには「this」という特殊なキーワードを使う
        this.name = name;
        this.age = age;
    }

    // constructorはメソッドなので、overloadも有効
    User() {
        // this.name = "Me";

        // this() : このクラスのconstructorという意味
        this("Me!", 40); // 引数なしでUserクラスをインスタンス化した場合に、結果として、this.nameに"Me!"が設定される
    }

    void sayHi() {
        System.out.println("Hi! " + this.name);
    }
}

public class MyApp {
    public static void main(String[] args) {
        User tom;
        tom = new User("Tom", 20);
        System.out.println(tom.name); // Tom
        System.out.println(tom.age); // 20
        tom.sayHi(); // Hi! Tom

        User me;
        me = new User();
        System.out.println(me.name); // Me
        System.out.println(me.age); // 40
        me.sayHi(); // Hi! Me
    }
}
