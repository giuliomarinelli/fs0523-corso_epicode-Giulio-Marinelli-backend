package it.epicode.week2.day3;


import java.util.List;

public class UsaClassi {

    public static long generateRandomId(long min, long max) {
        return (long) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        // Esercizio 1
        Customer c1 = new Customer("Mario", 1);
        Order o1 = new Order(c1);
        Order o2 = new Order(c1);
        o1.addProduct(new Product("Il nome della rosa", "Books", 120.0));
        o1.addProduct(new Product("Asus Vivobook", "Laptop", 1500.0));
        o1.addProduct(new Product("Il Profumo", "Books", 10.0));
        o1.addProduct(new Product("Anfitrione", "Books", 800.0));
        o1.addProduct(new Product("Il trono di spade", "Serie TV", 200.0));
        o1.addProduct(new Product("La locandiera", "Books", 200.0));
        o1.addProduct(new Product("Latte", "Baby", 10.0));
        o1.removeProduct(o1.getProductIdsByName("Il trono di spade").get(0));
        System.out.println(o1.getProducts());
        List<Product> listaProdotti = o1.getProducts().stream().filter(p -> p.getCategory().equals("Books") && p.getPrice() > 100.0).toList();
        System.out.println(listaProdotti);
        o2.addProduct(new Product("Ciuccio", "Baby", 8.0));
        o2.addProduct(new Product("Giochino", "Baby", 1500.0));
        o2.addProduct(new Product("Il Profumo", "Books", 10.0));
        o2.addProduct(new Product("Anfitrione", "Books", 800.0));
        o2.addProduct(new Product("Il trono di spade", "Serie TV", 200.0));
        o2.addProduct(new Product("La locandiera", "Books", 200.0));

    }

}
