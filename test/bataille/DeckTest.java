/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author selim
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addOneCard method, of class Deck.
     */
    @Test
    public void testAddOneCard() {
        System.out.println("addOneCard");
        Card addedCard = null;
       // TEST 1 : add a null card
        System.out.println("   TEST 1 add a null card");
        Deck instance = new Deck();
        try {
            instance.addOneCard(addedCard);
        }
        catch (NullPointerException aExp){
            assert(aExp.getMessage().contains("Null Card can't be added"));
        }
        assertTrue("Adding a null card fail", true);
       
        // TEST 2 : add a card, draw it and check it's the good one.
        System.out.println("   TEST 2 add a card. Check it's on top");
        instance = new Deck();
        Card card = new Card(cardColors.HEART, cardValues.THREE);
        int expResulti = 0;
        instance.addOneCard(card);
        Card drawnCard = instance.drawOneCard();
        assertEquals(expResulti, card.compare(drawnCard));
        
        // TEST 3 : add an existing card.
    }

    /**
     * Test of drawOneCard method, of class Deck.
     */
    @Test
    public void testDrawOneCard() {
        System.out.println("drawOneCard");
        Deck instance = new Deck();
        Card expResult = new Card(cardColors.CLUB, cardValues.ACE);
        Card result = instance.drawOneCard();
        assertEquals(expResult, result);
        // TEST 1 : draw a card from an empty deck
        // TEST 2 : add a card, draw it and check it's the good one.
        instance = new Deck();
        Card card = new Card(cardColors.HEART, cardValues.THREE);
        int expResulti = 0;
        instance.addOneCard(card);
        Card drawnCard = instance.drawOneCard();
        assertEquals(expResulti, card.compare(drawnCard));
        /* TEST 3 : add an existing card. Draw this card, be sure that the 
        second one is still there */
        boolean expResultb = true;
        assertEquals(expResultb, instance.into(card));

    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();        
    }

    /**
     * Test of into method, of class Deck.
     */
    public void testInto() {
        System.out.println("into");
        Card card = null;
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.into(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
