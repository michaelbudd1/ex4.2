
/**
 * Write a description of class library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Library
{
   
    private ArrayList<String> books;

    /**
     * Constructor for objects of class library
     */
    public Library()
    {
       books = new ArrayList<String>();
    }
    
    public void addBook(String book)
    {
        books.add(book);
    }
  
    public int numberOfBooks()
    {
        return books.size();    
    }
}
