package finalwork;

public class ToiletPaper extends Hygiene{
    private Integer layers;

    public ToiletPaper(String name, Double price, Integer count, String unit, Integer countIn, Integer layers) {
        super(name, price, count, unit, countIn);
        this.layers = layers;
    }

    public String getName() {
        return String.format("Туалетная бумага", super.getName());
    }

    @Override
    public String toString() {
        return String.format("%s ", 
                             super.toString(), layers);
    }
}
