package ass1;

public class parttwo9 {
    private String model;
    private String color;
    private int price;

    public parttwo9(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        parttwo9 iphone = (parttwo9) obj;
        return price == iphone.price &&
                model.equals(iphone.model) &&
                color.equals(iphone.color);
    }
}
