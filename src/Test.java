import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        printMonths();
    }

    private static void printMonths() {
        Scanner input = new Scanner(System.in);
        Season season = null;
        switch (input.nextLine()){
            case "Zima":
                season = Season.WINTER;
                break;
            case "Wiosna":
                season = Season.SPRING;
                break;
            case "Lato":
                season = Season.SUMMER;
                break;
            case "Jesien":
                season = Season.AUTUMN;
                break;
            default: input.close();
        }
        System.out.println(Arrays.toString(season.getMonths()));
    }
}
