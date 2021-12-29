// パッケージ
// クラスをパッケージに含めるには、パッケージ名のようなフォルダ作成の必要がある
// 例 : myapp.dotinstall.comの場合 => com/dotinstall/myapp

// class User {
//     String name;
//     User(String name) {
//         this.name = name;
//     }
//     User() {
//         this("Me!");
//     }
//     void sayHi() {
//         System.out.println("Hi! " + this.name);
//     }
// }


// class AdminUser extends User {
//     AdminUser(String name) {
//         super(name);
//     }
//     void sayHello() {
//         System.out.println("Hello! " + this.name);
//     }
//     @Override
//     void sayHi() {
//         System.out.println("[admin] Hi! " + this.name);
//     }
// }


// public class MyApp {
//     public static void main(String[] args) {
//         User tom = new User("Tom");
//         System.out.println(tom.name);
//         tom.sayHi();

//         AdminUser bob = new AdminUser("Bob");
//         System.out.println(bob.name);
//         bob.sayHi();
//         bob.sayHello();
//     }
// }
