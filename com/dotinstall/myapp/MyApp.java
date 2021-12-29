// パッケージのコンパイル
// 別のパッケージのクラスを読み込むには、パッケージ名を指定する必要がある
// import文を使うと他のパッケージ読み込みを指定でき、記述を簡略化できる

// コンパイルは、基点となるmain()メソッドがあるクラスをコンパイルすると、関連・使用しているクラスも連動してコンパイルされる
// javac com/dotinstall/myapp/MyApp.java => エラーなければOK
// java com.dotinstall.myapp.MyApp で実行


package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User; // Userクラスのimport
import com.dotinstall.myapp.model.AdminUser; // AdminUserクラスのimport
// import com.dotinstall.myapp.model.*; // * : ワイルドカード指定も可能

public class MyApp {
    public static void main(String[] args) {
        User tom = new User("Tom");
        // System.out.println(tom.name);
        tom.sayHi();

        AdminUser bob = new AdminUser("Bob");
        // System.out.println(bob.name);
        bob.sayHi();
        bob.sayHello();
    }
}
