import java.util.Arrays;
import java.util.InputMismatchException;

public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(Season.getMonthsArray()));
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
