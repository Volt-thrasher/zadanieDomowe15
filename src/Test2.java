import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMonths()));
    }

    private static String[] getMonths() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz nazwe pory roku");
        String line = input.nextLine();
        String[] months = null;
        for (Season s : Season.values()) {
            if (line.equals(s.getName())) {
                months = s.getMonths();
            }
        }
        input.close();
        return months;
    }
}
