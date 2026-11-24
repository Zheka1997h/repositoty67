public class Main {

    public static void main(String[] args) {
        System.out.println("=== Тестирование Product ===");
        Product p1 = new Product(1, "Ноутбук", 100000, "Электроника");
        Product p2 = new Product(1, "Ноутбук Dell", 100000, "Электроника");
        Product p3 = new Product(2, "Смартфон", 50000, "Электроника");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println();

        System.out.println("=== Тестирование Order ===");
        Order o1 = new Order("Иван", new Product[]{p1, p3});
        Order o2 = new Order("Иван", new Product[]{p1, p3});
        Order o3 = new Order("Петр", new Product[]{p1, p3});
        Order o4 = new Order("Иван", new Product[]{p3, p1});

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("o1.equals(o2): " + o1.equals(o2));
        System.out.println("o1.equals(o3): " + o1.equals(o3));
        System.out.println("o1.equals(o4): " + o1.equals(o4));
    }
}