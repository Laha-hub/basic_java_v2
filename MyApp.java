public class MyApp {

    public static void main(String[] args) {
        // for

        // 0 - 9 の数値を表示するプログラム
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }


        // break : ループを抜ける
        // for (int i = 0; i < 10; i++) {
        //     if (i == 5) {
        //         break;
        //     }
        //     System.out.println(i); // 0 - 4
        // }

        // continue : 次のループに移る
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i); // 0, 1, 2, 4
        }


    }

}
