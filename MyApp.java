public class MyApp {

    // method
    // methodを使うと、複数の処理をまとめることができ、それに名前をつけることができる

    // 引数なし
    // public static void sayHi() {
    //     System.out.println("Hi!");
    // }

    // 引数あり
    // public static void sayHi(String name) {
    //     System.out.println("Hi! " + name);
    // }

    // 戻り値あり : 戻り値のデータ型を指定する必要あり（voidは戻り値なしの意味）
    public static String sayHi(String name) {
        return "Hi! " + name;
    }

    public static void main(String[] args) {
        // 引数なし
        // sayHi(); // Hi!

        // 引数あり
        // sayHi("Tom"); // Hi! Tom
        // sayHi("Bob"); // Hi! Bob

        // 戻り値あり
        String msg = sayHi("Steve");
        System.out.println(msg); // Hi! Steve
    }

}
