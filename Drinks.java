package finalwork;



public abstract class Drinks extends Product{
    private String volume;
    private String date;

    public Drinks(String name, Double price, Integer count, String unit, String volume, String date) {
        super(name, price, count, unit);
        this.volume = volume;
        this.date = date;
    }
    
    public String getName() {
        return "Напитки";
    }

    @Override
    public String toString() {
        return String.format("Объём: 2л %s Срок годности:  24.03.2023 ", 
                             super.toString(), volume, date);
    }
}
