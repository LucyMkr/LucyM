class Football {
    private String name;
    private String surname;
    private String nationality;
    private int position;

    Football(String n, String s, String nat, int p) {
        name = n;
        surname = s;
        nationality = nat;
        position = p;
    }

    static Football first = new Football("Rico", "Sergio", "spaniards", 16);
    static Football second = new Football("Alexandre", "Letellier", "french", 90);
    static Football third = new Football("Achraf", "Hakimi", "moroccoan", 2);
    static Football fourth = new Football("Presnel", "Kimpembe", "french", 3);
    static Football fifth = new Football("Juan", "Bernat", "spanish", 14);
    static Football sixth = new Football("Timothee", "Pembele", "french", 29);
    static Football seventh = new Football("Marco", "Verratti", "italian", 6);
    static Football eighth = new Football("Hugo", "Ektike", "french", 44);

    public static void setEighth(Football eighth) {
        System.exit(1);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }

    public int getPosition() {
        return position;
    }
}