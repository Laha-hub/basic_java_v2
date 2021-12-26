public class MyApp {

    public static void main(String[] args) {
        // switch

        String signal = "green";
        switch (signal) {
            case "red":
                System.out.println("stop!");
                break;
            case "blue":
            case "green":
                System.out.println("go!");
                break;
            case "yellow":
                System.out.println("caution!");
                break;
            default:
                System.out.println("wrong signal!");
                break;
        }


    }

}
