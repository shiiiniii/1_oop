package finalwork;



public class Diapers extends ChildenG{
    private String size;
    private Integer MinWeight;
    private Integer MaxWeight;
    

    public Diapers(String name, Double price, Integer count, String unit, Integer minimumAge, Boolean hypoallergenic,
                   String size, Integer MinWeight, Integer MaxWeight) {
        super(name, price, count, unit, minimumAge, hypoallergenic);
        this.size = size;
        this.MinWeight = MinWeight;
        this.MaxWeight = MaxWeight;
       
    }

    public String getName() {
        return String.format("Подгузники ", super.getName());
    }

    @Override
    public String toString() {
        return String.format("Размер: %s \tмин/макс. вес: %d/%d \tтип: %s \t", 
                             super.toString(), size, MinWeight, MaxWeight);
    }
}
