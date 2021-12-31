// 無名クラス、ラムダ式


// 関数型インターフェース : 抽象メソッドを１つだけ持つインターフェースのことを入力に対して、出力が１つだけに定まる
// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i < 500; i++) {
//             System.out.print('*');
//         }
//     }
// }


// Javaのバージョン8から関数型インターフェースは「ラムダ式」という特殊な記法で置き換えることが可能となった

// ラムダ式の構文
// (引数) -> {処理}



public class MyApp {
    public static void main(String[] args) {
        // MyRunnable r = new MyRunnable();
        // Thread t = new Thread(r);
        // t.start();

        // new Thread(new MyRunnable()).start(); // new MyRunnable()部分を無名クラスにする（以下）

        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 500; i++) {
        //             System.out.print('*');
        //         }
        //     }
        // }).start();

        // ラムダ式にて書き換え
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.print('*');
            }
        }).start();

        for (int i = 0; i < 500; i++) {
            System.out.print('.');
        }
    }
}
