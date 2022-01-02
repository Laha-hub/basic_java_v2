// LocalDateTime クラス

// jabva.timeパッケージ : Java 8から導入の日時関連のクラス。
// LocalDateTime : タイムゾーンを考慮しないクラス
// 日時クラスは変更不可（= イミュータブル）


import java.time.*;

// 任意のフォーマット指定
import java.time.format.DateTimeFormatter;

public class MyApp {
    public static void main(String[] args) {
        // 現在時刻のインスタンス取得 : now()
        LocalDateTime d = LocalDateTime.now(); // 2022/1/2/22:36

        //  任意時刻のインスタンス取得 : of()
        // LocalDateTime d = LocalDateTime.of(2022, 1, 1, 10, 10, 10); // 2022年1月1日10時10分10秒

        // 任意時刻のインスタンス取得（ISO書式） : parse()
        // LocalDateTime d = LocalDateTime.parse("2022-01-01T10:10:10"); // 2022年1月1日10時10分10秒


        System.out.println(d.getYear()); // 2022
        System.out.println(d.getMonth()); // JANUARY
        System.out.println(d.getMonth().getValue()); // 1

        // 現在日時に2ヶ月プラスと1日マイナス
        System.out.println(d.plusMonths(2).minusDays(1)); // 2022-03-01T13:39:26.450

        // 任意のフォーマット指定
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!");
        System.out.println(d.format(dtf)); // 2022!01!02! （日時クラスはイミュータブルなので03/01ではなく、今日の日付になる）
    }
}
