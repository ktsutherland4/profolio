package models;

import java.util.Date;

/**
 * Interaction Abstract Base Class.
 */
public abstract class Interaction<T> {
    /**
     * Unique Identifier.
     */
    Integer Id;
    
    /**
     * Boxed Target Object.
     */
    Object Target;
    
    /**
     * User who is interacting.
     */
    User User;
    
    /**
     * Date of Interaction.
     */
    Date Date;
    
    /**
     * Abstract method to be defined by implementing class, as this will be
     * specific the the implementing class, but is still required.
     * @return 
     */
    public abstract String getName();
    
    /**
     * Unboxes the Target.
     * @return 
     */
    public T getTarget() {
        return (T) Target;
    }
}