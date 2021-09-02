/**
 * a type of observer that holds a queue of the top 5 best sellers
 * @author anna michelitch
 */
 package observer;

 import java.util.*;

public class Store implements Observer {
    
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * constructor for a Store
     * @param subject the subject to be observed
     * @param title the name of the store
     */
    public Store(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
        bestSellers = new LinkedList<Book>();
    }

    /**
     * adds a book to the queue when the best seller list is updated
     * @param book the book that's being added to the queue
     */
    public void update(Book book) {
        bestSellers.add(book);
        if (this.bestSellers.size() > 5)
            bestSellers.remove();
    }

    /**
     * displays the books in the queue
     */
    public void display() {
        System.out.println("Top 5 Bestsellers:");
        for (Book b : bestSellers)
            System.out.println(b);
        System.out.println("\n");
    }

}
