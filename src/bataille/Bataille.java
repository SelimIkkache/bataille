package bataille;

/**
 *
 * @author selim
 * @version 1.0
 */

/**
 * Colors a card can have
 * <li>{@link #SPADE}</li>
 * <li>{@link #HEART}</li>
 * <li>{@link #DIAMOND}</li>
 * <li>{@link #CLUB}</li>
 */
enum cardColors { 
     /**
      * Trefle in French
      */
     CLUB,
     /**
      * Carreaux in French
      */ 
     DIAMOND, 
     /**
      * Coeur in French
      */
     HEART, 
    /**
     * Pique in French
     */ SPADE }

/** 
 * Card values from ACE to TWO with decreasing values. 
 * The order is important, it goes from the most valuable card to the lowest 
 * one.
 */
enum cardValues { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
                  QUEEN, KING, ACE }
        
public class Bataille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    
}
