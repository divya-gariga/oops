package com.zemoso.oopsconcepts;
import java.util.ArrayList;
import java.util.List;
class Library
{
    private List<Book> books;
    String name;
    public Library(String name,List<Book> books)
    {
        this.name=name;
        this.books=books;
    }
    public void getBooks()
    {
        System.out.println("Library name :"+name);
        for(Book eachBook:books)
        {
            System.out.println("[Book title :"+eachBook.title+", Book author : "+eachBook.author+"]");
        }
    }
}
class Book
{
    String title,author;
    public Book(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
}
public class Association {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book("DS","Reema thareja"));
        books.add(new Book("Wings of fire","Abdul kalam"));
        Library library=new Library("mylibrary",books);
        library.getBooks();
    }
}
