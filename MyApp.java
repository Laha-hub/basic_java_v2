public class MyApp {

    public static void main(String[] args) {
        // 配列の操作

        int[] sales = {700, 400, 500};

        // for (int i = 0; i < 3; i++) {
        //     System.out.println(sales[i]); // 700, 400, 500
        // }

        // 配列の要素数 : sales.length
        // for (int i = 0; i < sales.length; i++) {
        //     System.out.println(sales[i]); // 700, 400, 500
        // }

        // forのスッキリした記述
        for (int sale : sales) {
            System.out.println(sale); // 700, 400, 500
        }


    }

}
