package finalwork;

public class Soda extends Drinks{
    
    public Soda(String name, Double price, Integer count, String unit, String volume, String expDate) {
        super(name, price, count, unit, volume, expDate);
    }

    public String getName() {
        return String.format("Лимонад", super.getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
