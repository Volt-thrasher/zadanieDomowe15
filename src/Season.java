public enum Season {
    WINTER("Zima", new String[]{"Grudzien","Styczen","Luty"}),
    SPRING("Wiosna", new String[]{"Marzec","Kwiecien","Maj"}),
    SUMMER("Lato", new String[]{"Czerwiec", "Lipiec", "Sierpien"}),
    AUTUMN("Jesien", new String[]{"Wrzesien", "Pazdziernik","Listopad"});

    private final String name;
    private  final String[] months;


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
}
