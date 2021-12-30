// interface

// interface : クラスの機能を拡張する仕組み
// interfaceは継承と異なり、１つのクラスにいくつでも適用させることができるので、柔軟にクラスの機能拡張が可能となる。


// 印刷機能を各クラスに提供するインターフェース Printableを作る
interface Printable {
    // 定数（public, static, finalを省略可能）
    double VERSION = 1.2;

    // 抽象メソッド（public, abstractを省略可能）
    void print();

    // defaultメソッド : 抽象メソッドと異なりここに直接メソッドの内容を実装する
    public default void getInfo() {
        System.out.println("I/F ver. " + Printable.VERSION);
    }

    // staticメソッド : このinterfaceに属するメソッド（defaultメソッドが複雑になったとき、ヘルパー的に使用したりする）
}

// interfaceを使用するには「implements」キーワードをつける
class User implements Printable {
    @Override
    public void print() {
        System.out.println("Now printing user profile...");
    }
}


public class MyApp {
    public static void main(String[] args) {
        User tom = new User();
        tom.print(); // Now printing user profile...
        tom.getInfo(); // I/F ver. 1.2
    }
}
