package finalwork;

public class Eggs extends Food{
    private Integer countIn;
    
    public Eggs(String name, Double price, Integer count, String unit, String expDate, Integer countIn) {
        super(name, price, count, unit, expDate);
        this.countIn = countIn;
    }

    public String getName() {
        return String.format("Яйца", super.getName());
    }

    @Override
    public String toString() {
        return String.format("Кол-во яиц в уп.: 10 ", 
                             super.toString(), countIn);
    }
}
