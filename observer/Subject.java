/**
 * an interface for a subject that will be updated and alert the observers
 * @author anna michelitch
 */

package observer;

public interface Subject {

    /**
     * adds a new observer
     * @param observer the new observer
     */
     public void registerObserver(Observer observer);

     /**
      * removes an observer
      * @param observer the observer to be removed
      */
     public void removeObserver(Observer observer);

     /**
      * notifies the observers when a new book is added to the best seller list
      * @param book the new book added to the best seller list
      */
     public void notifyObservers(Book book);
}
