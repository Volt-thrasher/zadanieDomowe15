import java.util.Scanner;

public enum Season {
    WINTER("Zima", new String[]{"Grudzien", "Styczen", "Luty"}),
    SPRING("Wiosna", new String[]{"Marzec", "Kwiecien", "Maj"}),
    SUMMER("Lato", new String[]{"Czerwiec", "Lipiec", "Sierpien"}),
    AUTUMN("Jesien", new String[]{"Wrzesien", "Pazdziernik", "Listopad"});

    private final String name;
    private final String[] months;


    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public String[] getMonths() {
        return months;
    }

    public static String[] getMonthsArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz nazwe pory roku");
        String line = input.nextLine();
        String[] months = null;
        for (Season s : Season.values()) {
            if (line.equals(s.getName())) {
                months = s.getMonths();
            } else {
                throw new IllegalArgumentException("Wprowadzono bledna nazwe pory roku");
            }
        }
        input.close();
        return months;
    }
}
