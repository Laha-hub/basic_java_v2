// final修飾子

// final : クラス、メソッド、フィールドに指定できる修飾子で、これを付けると変更不可となる
// 修飾子の順番 : アクセス修飾子 => static => final が多い


// final class User {} とすると、Userクラスの継承が不可となる
final class User {
    // private String name;
    protected String name; // AdminUser でも使用するためprotected

    // フィールドにfinalをつける場合は、staticと併用して、定数とすることができる（すべて大文字が慣習。あと初期化必須）
    private static final double VERSION = 1.1;

    public User(String name) {
        this.name = name;
        User.VERSION = 1.2;
    }

    // public final void sayHi() {} とすると、そのメソッドをoverrideできなくなる
    public final void sayHi() {
        System.out.println("Hi! " + this.name);
    }
}

class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        System.out.println("[admin] Hi! " + this.name);
    }
}


public class MyApp {
    public static void main(String[] args) {
        User tom = new User("Tom"); // finalによるエラー x 3
    }
}
