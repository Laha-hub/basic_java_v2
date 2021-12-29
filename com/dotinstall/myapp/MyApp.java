// パッケージ
// クラスをパッケージに含めるには、パッケージ名のようなフォルダ作成の必要がある
// 例 : myapp.dotinstall.comの場合 => com/dotinstall/myapp

// ファイルを作成し、それぞれのクラスをパッケージに含めるには、packageキーワードでの宣言が必要

package com.dotinstall.myapp;

public class MyApp {
    public static void main(String[] args) {
        User tom = new User("Tom");
        System.out.println(tom.name);
        tom.sayHi();

        AdminUser bob = new AdminUser("Bob");
        System.out.println(bob.name);
        bob.sayHi();
        bob.sayHello();
    }
}
