package finalwork;


public abstract class Hygiene extends Product{
    private Integer countIn;

    public Hygiene(String name, Double price, Integer count, String unit, Integer countIn) {
        super(name, price, count, unit);
        this.countIn = countIn;
    }
    
    public String getName() {
        return "Предметы гигиены";
    }

    @Override
    public String toString() {
        return String.format(" %s ", 
                             super.toString(), countIn);
    }    
}
