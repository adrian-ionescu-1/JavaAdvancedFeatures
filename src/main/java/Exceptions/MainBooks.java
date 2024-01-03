package Exceptions;

public class Main2 {

    public static void main(String[] args) {

        Book book1 = new Book("1", "A", "Mihai", 1898);
        Book book2 = new Book("2", "B", "Andrei", 1998);
        Book book3 = new Book("3", "C", "Costel", 2000);
        Book book4 = new Book("4", "D", "Alina", 2014);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        bookRepository.addBook(book4);

        System.out.println("Initial book list: ");
        bookRepository.printBooks();

        searchByTitle("E", bookRepository);
        searchByTitle("B", bookRepository);
    }

    private static void searchByTitle(String title, BookRepository bookRepository) {
        System.out.println("Searching book by title " + title);
        try {
            System.out.println(bookRepository.searchByTitle(title));
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
