// String クラス

// Stringクラスのよく使うメソッド
// s.length() : 文字数カウント
// s.substring(x, y) : 部分文字列の切り出し（x番目からy番目の前まで切り出し）
// s.replaceAll("xy", "XY") : 文字列の置換
// s1.equals(s2) : 文字列の等価性比較


public class MyApp {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(s.length()); // 6
        System.out.println(s.substring(2, 5)); // cde
        System.out.println(s.replaceAll("ab", "AB")); // ABcdef

        String s1 = "ab";
        String s2 = "ab";
        if (s1.equals(s2)) {
            System.out.println("same!"); // same!
        }

        // 本来、参照型データであれば、「==」の比較はメモリ格納場所を比較して判定を行う。
        // Stringクラスは参照型だが、基本データ型と同じように振る舞うことになっており、
        // すでに宣言されている文字列と同じものを宣言した場合は同じメモリ領域を使い回すようになっているため、「s1 == s2」はtrueとなる。
        if (s1 == s2) {
            System.out.println("same!same!"); // same!same!
        }


        // 文字列ごとに異なるメモリ領域を使用する場合は、明示的にStringクラスのインスタん化を行う
        String ss1 = new String("ab");
        String ss2 = new String("ab");
        if (ss1 == ss2) {
            System.out.println("same!same!same!");
        } else {
            System.out.println("different!"); // different!
        }

    }
}
