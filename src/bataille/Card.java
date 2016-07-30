package bataille;
import java.lang.NullPointerException;

/**
 * Card class represent a card in the game. 
 * You can compare a card with another one
 * You can hide or show a card.
 * @author selim
 */
public class Card {
    /**
     * theColor gives the color of the card (spade, club, heart or diamond)
     */
    private final cardColors theColor;
    /**
     * theValue gives the color of the card (one from two to ace)
     */
    private final cardValues theValue;
    /**
     * Visible is a boolean that indicates if the card can be seen or is hidden
     */
    private boolean visible;
    

    /**
     * Constructor with parameters
     * @param cColor Card color
     * @param cValue Card value
     */
     public Card(cardColors cColor,
                 cardValues cValue) {
          theColor = cColor;
          theValue = cValue;
          hide(); 
     }

    /**
     * Compare two cards.
     * @param theOtherCard the card to compare with this object.
     * @return -1 (this card is lesser than the other), 0 (equal) or 1 (bigger)
     */
     public int compare(Card theOtherCard) throws NullPointerException {
         if ( null == theOtherCard ) 
             throw new NullPointerException ("Card can't be null") ;
         if (theValue.ordinal() > theOtherCard.theValue.ordinal()) return 1;
         if (theValue == theOtherCard.theValue) return 0;
         return -1;
     }
     
     /**
      * Compares if two cards are equal.
      * @param obj
      * @return True if the two cards are equal, false in other cases
      */
     public boolean equals(Card obj) {
         if (this == obj) {
             return true;
         }
         if (obj == null) {
             return false;
         }
         if (getClass() != obj.getClass()) {
             return false;
         }
         Card other = (Card) obj;
         return theColor == other.theColor && theValue == other.theValue;
     }
     /**
      * isVisible lets know if the card is visible or not
      * @see visible
      * @return boolean, True if the card is visible, false if hidden
      */
     public boolean isVisible() {
         return visible;
     }
     /**
      * Hide a card
      * @see visible
      */
     public void hide() {
         visible = false;
     }
     /**
      * Show a card
      * @see visible
      */
     public void show() {
         visible = true;
     }
     /**
      * getCardValue gives the value of the card
      */
     public cardValues getCardValue() {
         return theValue;
     }
/**
      * getCardColor gives the color of the card
      */
     public cardColors getCardColor() {
         return theColor;
     }    
}
