package finalwork;



public class Pacifier extends ChildenG{
    
    public Pacifier(String name, Double price, Integer count, String unit, Integer minimumAge, Boolean hypoallergenic) {
        super(name, price, count, unit, minimumAge, hypoallergenic);
    }

    public String getName() {
        return String.format("Соска", super.getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
