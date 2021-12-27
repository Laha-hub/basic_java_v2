public class MyApp {

    public static void main(String[] args) {
        // 配列

        // 配列の中に格納するデータの型で宣言する
        int[] sales;

        // 配列を宣言したら、データ領域の確保が必要（new でインスタンス化）
        sales = new int[3];

        // 上記宣言にて、sales[0]-sales[2]が用意される
        sales[0] = 100;
        sales[1] = 200;
        sales[2] = 300;
        System.out.println(sales[1]); // 200

        // 値の代入
        sales[1] = 1000;
        System.out.println(sales[1]); // 1000


        // 配列をまとめて初期化する方法（1）
        int[] sales2;
        sales2 = new int[] {100, 200, 300};

        // 配列をまとめて初期化する方法（2）
        int[] sales3 = {100, 200, 300};
        System.out.println(sales3[2]); // 300
    }

}
