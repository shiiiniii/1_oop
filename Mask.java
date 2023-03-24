package finalwork;

public class Mask extends Hygiene{
    
    public Mask(String name, Double price, Integer count, String unit, Integer countIn) {
        super(name, price, count, unit, countIn);
    }

    public String getName() {
        return String.format("Маски", super.getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
