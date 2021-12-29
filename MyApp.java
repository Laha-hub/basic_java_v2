// static修飾子

// static修飾子を用いれば、クラスをインスタンス化せずにクラスから直接使えるフィールドやメソッドを定義可能となる
// static修飾子を用いた宣言は、個々のインスタンスで値を保持するのではなく、クラスに紐付いた形で値を保持することになる
// staticをつけたフィールドやメソッドをクラスに属しているという意味で「クラス変数」や「クラスメソッド」と呼ぶ。
// main()メソッドもstaticだが、Javaの仮想マシンがメインクラス（今回だとMyApp）のインスタンスを生成せずに、いきなり実行できるよう、staticメソッドになっている。


class User {
    private String name;
    private static int count = 0;

    public User(String name) {
        this.name = name;
        User.count++;
    }

    public static void getInfo() {
        System.out.println("# of instances: " + User.count);
    }
}


public class MyApp {
    public static void main(String[] args) {
        User.getInfo(); // # of instances: 0
        User tom = new User("Tom");
        User.getInfo(); // # of instances: 1
        User bob = new User("Bob");
        User.getInfo(); // # of instances: 2

    }
}
