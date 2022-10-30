
public class Item {
    private final int id;
    private final String name;
    private final double price;
    public Item(int id, String title, double price) {
        this.id = id;
        this.name = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}