package week2;
public class EBookStall {
    public static void main(String[] args) {
        Book textbook = new Book("Java Programming", "John Doe", 5);
        Customer customer1 = new Customer(1, "Alice", "123 Main St");
        customer1.buyBook(textbook);
        Customer customer2 = new Customer(2, "Bob", "456 Oak St");
        customer2.buyBook(textbook);
    }
}