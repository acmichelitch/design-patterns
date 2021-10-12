/**
 * represents a factory that produces different types of house plans
 * @author: anna michelitch
 */

package factory;

public class HousePlanFactory {

    /**
     * static method to be used in the driver that returns a new HousePlan based on the desired type
     * @param type the name of the specific house plan
     * @return a new houseplan object
     */
    public static HousePlan createHousePlan(String type) {
        if (type.equalsIgnoreCase("log cabin"))
            return new LogCabinPlan();
        else if (type.equalsIgnoreCase("tiny home"))
            return new TinyHomePlan();
        else if (type.equalsIgnoreCase("contemporary home"))
            return new ContemporaryPlan();
        else
            return null;
    }
    
}
