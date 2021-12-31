// スレッド処理 : Thread

// スレッド : コンピュータの処理単位のこと
// スレッドを複数立ち上げれば、複数の処理を同時に実行可能となる
// 任意で作成したスレッドの処理内容はRunnableというインターフェースを実装したクラスを記述し、new Thread()に対して渡せばOK


class MyRunnable implements Runnable {
    // Runnableの抽象メソッドは「run()」
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print('*');
        }
    }
}




public class MyApp {
    public static void main(String[] args) {
        // 別のスレッド作成
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start(); // * 500個

        for (int i = 0; i < 500; i++) {
            System.out.print('.');
        }
         // . 500個

         // .と*はそれぞれ混ざり合って表示される。各スレッドが同時に実行されているため。
    }
}
