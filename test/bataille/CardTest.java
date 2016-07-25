/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author selim
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compare method, of class Card.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        // Test 1 : Card is null and theOtherCard too
        Card theOtherCard = null;
        Card instance = null;
        int expResult = 0;
        //int result = instance.compare(theOtherCard);
        //assertEquals(expResult, result);
        // Test 2 : Card is null, not theOtherCard
        theOtherCard = new Card(cardColors.SPADE, cardValues.KING);
        //instance = null ;
        //expResult = 0;
        //result = instance.compare(theOtherCard);
        //assertEquals(expResult, result);
        // Test 3 : Card is not null, the otherCard is
        theOtherCard = null;
        instance = new Card(cardColors.SPADE, cardValues.KING);
        expResult = 0;
        int result = instance.compare(theOtherCard);
        assertEquals(expResult, result);
        // Test 4 : Card > theOtherCard
        theOtherCard = new Card(cardColors.SPADE, cardValues.TWO);
        instance = new Card(cardColors.DIAMOND, cardValues.KING);
        expResult = 1;
        result = instance.compare(theOtherCard);
        assertEquals(expResult, result);
        // Test 5 : Card == theOtherCard
        theOtherCard = new Card(cardColors.SPADE, cardValues.QUEEN);
        instance = new Card(cardColors.DIAMOND, cardValues.QUEEN);
        expResult = 0;
        result = instance.compare(theOtherCard);
        assertEquals(expResult, result);
        // Test 6 : Card < theOtherCard
        theOtherCard = new Card(cardColors.SPADE, cardValues.JACK);
        instance = new Card(cardColors.CLUB, cardValues.TEN);
        expResult = -1;
        result = instance.compare(theOtherCard);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of visible member, of class Card.
     */
    @Test
    public void testVisible() {
        System.out.println("visible");
        // Test 1 : at creation time, the card is hidden
        Card testedCard = new Card(cardColors.HEART, cardValues.ACE);
        boolean expResult = false;
        assertEquals (expResult, testedCard.isVisible());
        // Test 2 : after showing a visible card, it's visible
        expResult = true;
        testedCard.show();
        testedCard.show();
        assertEquals (expResult, testedCard.isVisible());        
        // Test 3 : after showing a hidden card, it's visible
        expResult = true;
        testedCard.hide();
        testedCard.show();
        assertEquals (expResult, testedCard.isVisible());        
        // Test 4 : after hiding a visible card, it's hidden
        expResult = false;
        testedCard.show();
        testedCard.hide();
        assertEquals (expResult, testedCard.isVisible());        
        // Test 5 : after hiding a hidden card, it's hidden
        expResult = false;
        testedCard.hide();
        testedCard.hide();
        assertEquals (expResult, testedCard.isVisible());        
    }
}
