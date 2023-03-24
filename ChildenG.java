package finalwork;

public abstract class ChildenG extends Product{
    private Integer minAge;
    private boolean hypoallergenic;

    public ChildenG(String name, Double price, Integer count, String unit, Integer minAge, Boolean hypoallergenic) {
        super(name, price, count, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public String getName() {
        return "Товары для детей";
    }
    
    @Override
    public String toString() {
        return String.format(" %s \tГипоаллергенность: %s ", 
                             super.toString(), minAge, (hypoallergenic) ? "да" : "нет");
    }    
}
