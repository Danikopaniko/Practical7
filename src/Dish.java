public class Dish {
    private int id;
    private String name;
    private double price;
    private int categoryId;

    public Dish(int id, String name, double price, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public Dish(String name, double price, int categoryId) {
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getCategoryId() { return categoryId; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Страва [ID: " + id + ", Назва: " + name + ", Ціна: " + price + " грн, ID Категорії: " + categoryId + "]";
    }
}