/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


/**
 * Card class represent a card in the game. 
 */
class Card {
    private final cardColors theColor;
    private final cardValues theValue;

    /**
     * Constructor with parameters
     * @param cColor Card color
     * @param cValue Card value
     */
     public Card(cardColors cColor,
                 cardValues cValue) {
          theColor = cColor;
          theValue = cValue;
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
}
public class Bataille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    
}
