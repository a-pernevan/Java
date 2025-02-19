public class Library {
    // attributes
    // methods
    String bookName = "Zero to One";
    String authorName = "Peter Thiel";
    int quantity = 2;

    public void bookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
    }

    public int updateQuantity(int newQuantity) {
        quantity = newQuantity;
        return quantity;
    }

    public static void main(String[] args) {
        Library library = new Library();
        // System.out.println("The name of the book is " + library.bookName);
        library.bookDetails();
        library.updateQuantity(4);
        System.out.println("Book count for " + library.bookName + " is " + library.quantity);

        Library library2 = new Library();
        library2.bookDetails();
    }

}