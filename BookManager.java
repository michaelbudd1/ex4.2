
/**
 * Write a description of class library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class BookManager
{
   
    private ArrayList<Book> library;
    private Book newBook;

    
    /**
     * Constructor for objects of class library
     */
    public BookManager()
    {
        library = new ArrayList<Book>();
    }
    
    public void addBook(String author, String title)
    {
     author = author;
     title = title;
     newBook = new Book(author, title);
     library.add(newBook);
    }
    
    /**
     * @return The number of books currently in the library.
     */
    public int numberOfBooks()
    {
        return library.size();
    }
    
   /**
     * Show a book.
     * @param bookNumber The number of the book to be shown.
     */
    public void showBook(int bookNumber)
    {
        if(bookNumber < 0) {
            System.out.println("Sorry, not a valid number");
        }
        else if(bookNumber < numberOfBooks()) {
            // This is a valid note number, so we can print it.
            System.out.println(library.get(bookNumber));
        }
        else {
            System.out.println("No book found");
        }
    }
    
}
