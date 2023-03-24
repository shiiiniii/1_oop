package finalwork;

public class Milk extends Drinks{
    private Double fat;
    
    public Milk(String name, Double price, Integer count, String unit, String volume, String date, Double fat) {
        super(name, price, count, unit, volume, date);
        this.fat = fat;
    }

    public String getName() {
        return String.format("Молоко", super.getName());
    }

    @Override
    public String toString() {
        return String.format("Процент жирности: %.1f ", 
                             super.toString(), fat);
    }
}
