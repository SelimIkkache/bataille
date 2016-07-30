/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.lang.NullPointerException;


/**
 * A Deck is a collection of cards. 
 * You can add a card to a deck, 
 * You can draw a card from a deck
 * You can distribute several card from one deck to other ones
 * You can shuffle a deck
 * You can check if a card is in a Deck.
 * @author selim
 */
public class Deck {
    /**
     * Cards composing a Deck
     */
    private ArrayList<Card> cards;
    /**
     * Seed for random, used for shuffling.
     */
    private final long seed;
    /** 
     * Default constructor. 
     * By default create a 52 standard deck.
     * All cards are hidden and the deck is sorted.
     */
    public Deck (){
        seed = System.nanoTime();
        cards = new ArrayList<Card>();
        for (cardColors color : cardColors.values()) {
            for (cardValues value : cardValues.values()) {
                Card card = new Card(color, value);
                card.hide();
                cards.add(card);
            }
        }   
    }
    /**
     * Constructor with a card collection
     * In this case all the cards composing the Deck are known. 
     * We just add all the cards from this collection
     */
    // public Deck (ArrayList<Card> theCards)  
    // TODO not really relevant for a first version
    /**
     * Add one card to the top of the deck.
     * Hide the card if needed
     * @param addedCard is the card to be added to the deck
     */
    public void addOneCard (Card addedCard) throws NullPointerException {
        if (null == addedCard) 
            throw new NullPointerException("A null card can't be added");
        addedCard.hide();
        cards.add(addedCard);
    }
    /**
     * draw one card from the top of the deck and return it.
     * It removes this card from the Deck
     * @return the card drawn from the deck.
     */
    public Card drawOneCard() throws NullPointerException {
        if (null == cards || cards.isEmpty()) 
            throw new NullPointerException ("Empty deck");
        Card card;
        card = cards.get(0);
        cards.remove(card);
        return (card);
    }
    /**
     * Shuffle the deck
     */
    public void shuffle () {
        Collections.shuffle(cards, new Random(seed));
    }
    
    /** 
     * Check that a card is in the deck
     * @param card the card searched
     * @return true if the card is in the deck
     */
    public boolean into (Card card) {
        return cards.contains(card);
    }
}
