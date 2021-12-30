// 抽象クラス

// 抽象クラス : 他のクラスに継承してもらうことを前提にしているクラス。それ自身をインスタンス化できない。
// 具象クラス : 抽象クラスを継承したクラス



// 抽象クラス User から JapaneseUserクラスと AmericanUserクラスを生成する
abstract class User {
    public abstract void sayHi(); // 抽象メソッド : 具象クラスにてメソッドの内容を実装する
}

// 具象クラス
class JapaneseUser extends User {
    @Override
    public void sayHi() {
        System.out.println("こんにちは！");
    }
}

// 具象クラス
class AmericanUser extends User {
    @Override
    public void sayHi() {
        System.out.println("Hi!");
    }
}


public class MyApp {
    public static void main(String[] args) {
        AmericanUser tom = new AmericanUser();
        JapaneseUser taro = new JapaneseUser();
        tom.sayHi(); // Hi!
        taro.sayHi(); // こんにちは！
    }
}
