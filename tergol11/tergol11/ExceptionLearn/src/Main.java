public class Main {
    public static void main(String[] args) {
        try {
            Store s = new Store(1, "JavaMusic");

            Guitar g1 = new Guitar(1001, 500, "black", 3.2, 2022, "USA", 5, true, 6);
            Piano p1 = new Piano(1002, 1200, "white", 50, 2021, "Germany", 2, true);
            Flute f1 = new Flute(1003, 300, "silver", 0.5, 2020, "Italy", 3);

            s.addInstrument(g1);
            s.addInstrument(p1);
            s.addInstrument(f1);

            s.addInstrumentAmount(g1, 2);
            // ניסיון להוספת כמות שלילית
            s.addInstrumentAmount(f1, -1);

            System.out.println(s);
            System.out.println("Electric Guitars: " + s.allElectricGuitars());
            System.out.println("Rating G1: " + s.ratingFor(g1));
            System.out.println("Rating P1: " + s.ratingFor(p1));
            System.out.println("Rating F1: " + s.ratingFor(f1));

        } catch (InstrumentExistsException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}
