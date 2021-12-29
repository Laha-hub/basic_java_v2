// getter, setter

// Javaでは1つのソースファイルにつき、publicなクラスは1つしか持てないので、Userクラスはpackage privateにする

class User {
    private String name;
    private int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // scoreを参照するためのメソッド（getter）
    public int getScore() {
        return this.score;
    }

    // scoreの値を更新するためのメソッド（setter）
    public void setScore(int score) {
        if (score > 0) {
            this.score = score;
        }
    }
}


public class MyApp {
    public static void main(String[] args) {
        User tom = new User("Tom", 65); // (score = 65)
        tom.setScore(85); // (score = 85)
        tom.setScore(-22); // (score = 85) (-22は無視)
        System.out.println("score = " + tom.getScore()); // score = 85
    }
}
