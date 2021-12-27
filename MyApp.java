public class MyApp {

    public static void main(String[] args) {
        // 基本データ型と参照型

        // 基本データ型
        // int x = 10;
        // int y = x;
        // y = 5;
        // System.out.println(x); // 10
        // System.out.println(y); // 5

        // 参照型（String）: Stringは参照型だが、基本データ型と挙動が似ている
        String s = "Hello";
        String t = s;
        t = "World";
        System.out.println(s); // Hello
        System.out.println(t); // World
    }

}
