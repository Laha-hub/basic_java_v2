// 例外処理

// 例外処理 : プログラムの実行中に予期しない結果が発生した際、適切に処理を行えうことができる
// Java固有の例外だけでなく、ユーザーが任意の例外を作成することもできる（クラスにて指定する）


// ユーザー独自の例外
class MyException extends Exception {
    // constructorでエラーメッセージを取得
    public MyException(String s) {
        super(s);
    }
}


public class MyApp {
    public static void div(int a, int b) {
        try {
            if (b < 0) {
                throw new MyException("not minus!");
            }
            System.out.print(a / b);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (MyException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println(" -- end -- ");
        }
    }

    public static void main(String[] args) {
        div(3, 0); // ArithmeticException => / by zero
        // -- end --
        div(5, -2); // MyException => not minus!
        // -- end --
    }
}
