// printf メソッド

// printf : 書式を指定して文字列の表示が可能となる
// %s : 文字列
// %d : 整数
// %f : 浮動小数点
// \n : 改行


public class MyApp {
    public static void main(String[] args) {
        int score = 50;
        double height = 165.8;
        String name = "taguchi";

        System.out.printf("name: %s, score: %d, height: %f\n", name, score, height); // name: taguchi, score: 50, height: 165.800000
        System.out.printf("name: %-10s, score: %10d, height: %5.4f\n", name, score, height); // name: taguchi    , score:         50, height: 165.8000

        
        // 画面出力だけでなく、文字列として受け取りたい場合
        String s = String.format("name: %10s, score: %-10d, height: %5.2f\n", name, score, height);
        System.out.print(s); // name:    taguchi, score: 50        , height: 165.80
    }
}
