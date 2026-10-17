public class Main {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager();

        db.initDatabase();
        System.out.println("=== БАЗУ ДАНИХ СТВОРЕНО ===");

        db.addCategory(new Category("Кава"));
        db.addCategory(new Category("Десерти"));

        System.out.println("\n--- Список категорій після додавання ---");
        db.getAllCategories().forEach(System.out::println);

        db.addDish(new Dish("Еспресо", 45.0, 1));
        db.addDish(new Dish("Капучино", 60.0, 1));
        db.addDish(new Dish("Чізкейк", 110.0, 2));

        System.out.println("\n--- Список страв (READ) ---");
        db.getAllDishes().forEach(System.out::println);

        db.updateDishPrice(1, 50.0);
        db.updateCategory(2, "Солодкі десерти");

        System.out.println("\n--- Список страв після оновлення ціни ---");
        db.getAllDishes().forEach(System.out::println);

        db.deleteDish(2);

        System.out.println("\n--- Список страв після видалення Капучино ---");
        db.getAllDishes().forEach(System.out::println);
    }
}