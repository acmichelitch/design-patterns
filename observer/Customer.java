/**
 * represents a customer with a wish list of all of the best sellers
 * @author anna michelitch
 */

package observer;

import java.util.*;

public class Customer implements Observer {
    
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * constructor for a customer
     * @param subject the subject that the customer will observe
     * @param firstName the first name of the customer
     * @param lastName the last name of the customer
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>();
    }

    /**
     * updates the customer's wishlist when a new book is added to the best seller list
     * @param book
     */
    public void update(Book book) {
        wishList.add(book);
    }

    /**
     * prints out the contents of the customer's wishlist
     */
    public void display() {
        System.out.println("Wish List:");
        for (int i = 0; i < wishList.size(); i++) 
            System.out.println(wishList.get(i));
        System.out.println("\n");
    }

}
