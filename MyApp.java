public class MyApp {

    public static void main(String[] args) {
        // if

        // 比較演算子 : >, >=, <, <=, ==, !=
        // 論理演算子 : &&, ||, !

        int score = 90;
        // if (score > 80) {
        //     System.out.println("Great!");
        // } else if (score > 60) {
        //     System.out.println("Good!");
        // } else {
        //     System.out.println("so so ... !");
        // }

        // 条件演算子を用いて if/else 記述をスッキリ
        String msg = score > 80 ? "Great!" : "so so ... !";
        System.out.println(msg);

    }

}
