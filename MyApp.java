// イニシャライザ

// イニシャライザ : クラスが初期化される際に行う処理を設定できる
// インスタンスイニシャライザ : インスタンスを初期化する際に行う処理を設定できる

// コンストラクタとインスタンスイニシャライザの違い
// インスタンスイニシャライザ => インスタンス化される前の設定
// コンストラクタ => インスタンスされた後に実行される


class User {
    private String name;
    private static int count;

    // イニシャライザ
    static {
        User.count = 0;
        System.out.println("Static Initializer");
    }

    // インスタンスイニシャライザ
    {
        System.out.println("Instance Initializer");
    }

    public User(String name) {
        this.name = name;
        User.count++;
        System.out.println("Constructor");
    }

    public static void getInfo() {
        System.out.println("# of instances: " + User.count);
    }
}


public class MyApp {
    public static void main(String[] args) {
        // Static Initializer
        User.getInfo(); // # of instances: 0

        // Instance Initializer
        User tom = new User("Tom");
        // Constructor
        User.getInfo(); // # of instances: 1

        // Instance Initializer
        User bob = new User("Bob");
        // Constructor
        User.getInfo(); // # of instances: 2
    }
}
