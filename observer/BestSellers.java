/**
 * implements the subject interface to represent a list of best selling books
 */

package observer;

import java.util.ArrayList;

public class BestSellers implements Subject {
    
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * constructor for the list of best sellers
     */
    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }

    /**
     * adds a new observer to the arraylist of observers
     * @param observer the observer to be added
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * removes an observer from the list of observers
     * @param observer the observer to be removed
     */
    public void removeObserver(Observer observer) {
       this.observers.remove(observer);
    }

    /**
     * updates the observers that the subject has been updated
     * @param book the book that has been added to the best seller list
     */
    public void notifyObservers(Book book) {
        for (Observer o : observers) {
            o.update(book);
        }
    }

    /**
     * adds a book to the best sellers list and notifies the observers
     * @param book the book to be added to the list
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }

}
