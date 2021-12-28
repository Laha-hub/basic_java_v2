public class MyApp {

    // methodのoverload

    public static void sayHi(String name) {
        // method内で使う変数の有効範囲（スコープ）: xやnameはsayHi()のブロック内{}でのみ有効
        int x = 10;
        System.out.println("Hi! " + name);
    }



    // overload : Javaでは同じ名前のmethodを複数記述可能
    public static void sayHi() {
        System.out.println("Hi! Nobody!");
    }



    public static void main(String[] args) {
        // xとnameはmain()のスコープ範囲外
        // System.out.println(name); // Error!
        // System.out.println(x); // Error!

        // overload
        sayHi("Steve"); // Hi! Steve
        sayHi(); // Hi! Nobody!
    }

}
