package bataille;

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
     public int compare(Card theOtherCard) {
         if ( null == theOtherCard ) return 0;
         if (theValue.ordinal() > theOtherCard.theValue.ordinal()) return 1;
         if (theValue == theOtherCard.theValue) return 0;
         return -1;
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
