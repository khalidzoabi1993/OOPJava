import java.util.ArrayList;

public class Store {
    private int storeId;
    private String name;
    private ArrayList<Instrument> inventory;

    public Store(int storeId, String name) {
        this.storeId = storeId;
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public boolean addInstrument(Instrument i) {
        for (Instrument inst : inventory) {
            if (inst.equals(i)) return false;
        }
        inventory.add(i);
        return true;
    }

    public boolean removeInstrument(Instrument i) {
        return inventory.removeIf(inst -> inst.equals(i));
    }

    public boolean addInstrumentAmount(Instrument i, int amount) throws InstrumentExistsException {
        if (amount < 0) throw new InstrumentExistsException("Cannot add negative quantity");
        for (Instrument inst : inventory) {
            if (inst.equals(i)) {
                inst.setQuantity(inst.getQuantity() + amount);
                return true;
            }
        }
        i.setQuantity(amount);
        inventory.add(i);
        return true;
    }

    public ArrayList<Guitar> allElectricGuitars() {
        ArrayList<Guitar> result = new ArrayList<>();
        for (Instrument i : inventory) {
            if (i instanceof Guitar g && g.isElectric()) {
                result.add(g);
            }
        }
        return result;
    }

    public double ratingFor(Instrument i) {
        if (!inventory.contains(i) || i.getQuantity() == 0) return 0;
        double base = i.price / i.getQuantity();
        if (i instanceof Guitar) return base * 10;
        if (i instanceof Piano) return base * 20;
        if (i instanceof Flute) return base * 30;
        return base;
    }

    public String toString() {
        return "Store: " + name + ", ID: " + storeId + ", Instruments: " + inventory.size();
    }
}