public class Library {
    // attributes
    // methods
    // String bookName = "Zero to One";
    // String authorName = "Peter Thiel";
    // int quantity = 2;
    String bookName;
    String authorName;
    int quantity;

    Library(String name, String author, int count) {
        bookName = name;
        authorName = author;
        quantity = count;
    }

    public void bookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
    }

    public int updateQuantity(int newQuantity) {
        quantity = newQuantity;
        return quantity;
    }

    public static void main(String[] args) {
        Library library = new Library("Zero To Hero", "Peter Theil", 4);
        // System.out.println("The name of the book is " + library.bookName);
        library.bookDetails();
        // library.updateQuantity(4);
        // System.out.println("Book count for " + library.bookName + " is " + library.quantity);

        Library library2 = new Library("The Lean Startup", "Eric Ries", 3);
        library2.bookDetails();
    }

}