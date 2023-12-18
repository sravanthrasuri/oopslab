package week2;
public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookCount;
    public Book(String bookName, String bookAuthor, int bookCount) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCount = bookCount;
    }
    public String getBookName() {
        return bookName;
    }
    public int getBookCount() {
        return bookCount;
    }
    public void sellBook() {
        if (bookCount > 0) {
            bookCount--;
            System.out.println("Book sold successfully. Remaining count of " + bookName + ": " + bookCount);
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }
}
class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;

    public Customer(int customerId, String customerName, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void buyBook(Book book) {
        System.out.println(customerName + " with ID " + customerId + " is buying a book:");
        System.out.println("Book Name: " + book.getBookName());
        book.sellBook();
        System.out.println("-----------------------------------------------------");
    }
}