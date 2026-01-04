package ass1;

public class parttwo10 {
    private String model;
    private int year;

    public parttwo10(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return model.hashCode() + year;
    }
}
