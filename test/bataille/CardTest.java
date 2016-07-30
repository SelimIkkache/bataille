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
     * Tests of compare method, of class Card.
     */
    /**
     * Test 1 : Card is null and theOtherCard too
     */
    @Test
    public void testCompare1() {
        System.out.println("compare: Card is null and theOtherCard too");
        Card theOtherCard = null;
        Card instance = null;
        int expResult = 0;
        int result=0;
        try {
            result = instance.compare(theOtherCard);
            fail("The card is null ! We can't compare it");
        }
        catch (NullPointerException e) {
            assertTrue ("Catch the NullPointer exception", true);
        }
        assertEquals(expResult, result);
    }
    /** 
     * Test 2 : Card is null, not theOtherCard
     */
    @Test
    public void testCompare2() {
        System.out.println("compare: Card is null, not theOtherCard");
        Card theOtherCard;
        Card instance;
        int expResult;
        int result=0;
    
        theOtherCard = new Card(cardColors.SPADE, cardValues.KING);
        instance = null ;
        expResult = 0;
        try {
            result = instance.compare(theOtherCard);
            fail("The card is null ! We can't compare it");
        }
        catch (NullPointerException e) {
            assertTrue ("Catch the NullPointer exception", true);
        }
    }
     /**
      * Test 3 : ©
      */
    @Test
    public void testCompare3() {
        System.out.println("compare: Card is not null, the otherCard is");
        Card theOtherCard;
        Card instance;
        int expResult;
        int result;
        theOtherCard = null;
        instance = new Card(cardColors.SPADE, cardValues.KING);
        expResult = 0;
        try {
            result = instance.compare(theOtherCard);
            fail("Try to compare a null Card with the card.");
        }
        catch (NullPointerException aExp){
            assert(aExp.getMessage().contains("Card can't be null"));
        }
    }
    /**
     * Test 4 : Card > theOtherCard
     */
    @Test
    public void testCompare4() {
        System.out.println("compare: Card > theOtherCard");
        Card theOtherCard;
        Card instance;
        int expResult;
        int result;
        theOtherCard = new Card(cardColors.SPADE, cardValues.TWO);
        instance = new Card(cardColors.DIAMOND, cardValues.KING);
        expResult = 1;
        result = instance.compare(theOtherCard);
        assertEquals(expResult, result);
    }
    /**
     * Test 5 : Card == theOtherCard
     */
    @Test
    public void testCompare5() {
        System.out.println("compare: Card == theOtherCard");
        Card theOtherCard;
        Card instance;
        int expResult;
        int result;
        theOtherCard = new Card(cardColors.SPADE, cardValues.QUEEN);
        instance = new Card(cardColors.DIAMOND, cardValues.QUEEN);
        expResult = 0;
        result = instance.compare(theOtherCard);
        assertEquals(expResult, result);
    }
    /**
     * Test 6 : Card < theOtherCard
     */
    @Test
    public void testCompare6() {
        System.out.println("compare : Test 6 : Card < theOtherCard");
        Card theOtherCard;
        Card instance;
        int expResult;
        int result;
        theOtherCard = new Card(cardColors.SPADE, cardValues.JACK);
        instance = new Card(cardColors.CLUB, cardValues.TEN);
        expResult = -1;
        result = instance.compare(theOtherCard);
        assertEquals(expResult, result);
    }
    /**
     * Test of visible member, of class Card.
     */
    /**
     * Test 1 : at creation time, the card is hidden
     */
    @Test
    public void testVisible1() {
        System.out.println("visible: at creation time, the card is hidden");
        Card testedCard = new Card(cardColors.HEART, cardValues.ACE);
        boolean expResult = false;
        assertEquals (expResult, testedCard.isVisible());
    }
    /**
     * Test 2 : after showing a visible card, it's visible
     */
    @Test
    public void testVisible2() {
        System.out.println("visible: after showing a visible card, it's visible");
        Card testedCard = new Card(cardColors.HEART, cardValues.ACE);
        boolean expResult;
        expResult = true;
        testedCard.show();
        testedCard.show();
        assertEquals (expResult, testedCard.isVisible());
    }
    /**
     * Test 3 : after showing a hidden card, it's visible
     */
    @Test
    public void testVisible3() {
        System.out.println("visible: after showing a hidden card, it's visible");
        Card testedCard = new Card(cardColors.HEART, cardValues.ACE); 
        boolean expResult;
        expResult = true;
        testedCard.hide();
        testedCard.show();
        assertEquals (expResult, testedCard.isVisible());
     }        
    /**
     * Test 4 : after hiding a visible card, it's hidden
     */
    @Test
    public void testVisible4() {
        System.out.println("visible: after hiding a visible card, it's hidden");
        Card testedCard = new Card(cardColors.HEART, cardValues.ACE);
        boolean expResult;
        expResult = false;
        testedCard.show();
        testedCard.hide();
        assertEquals (expResult, testedCard.isVisible());
    }
    /**
     * Test 5 : after hiding a hidden card, it's hidden
     */
    @Test
    public void testVisible5() {
        System.out.println("visible: after hiding a hidden card, it's hidden");
        Card testedCard = new Card(cardColors.HEART, cardValues.ACE);
        boolean expResult;
        expResult = false;
        testedCard.hide();
        testedCard.hide();
        assertEquals (expResult, testedCard.isVisible());        
    }
    /**
     * Test getCardValue
     */
    @Test
    public void TestgetCardValue (){
        System.out.println("cardValue and cardColor");
        cardColors expResultC = cardColors.HEART;
        cardValues expResult = cardValues.ACE;
        Card testedCard = new Card(expResultC, expResult);
        assertEquals (expResult, testedCard.getCardValue());
    }
    /**
     * Test getCardColor
     */
    @Test
    public void TestgetCardColor (){
        System.out.println("cardColor");
        cardColors expResultC = cardColors.HEART;
        cardValues expResult = cardValues.ACE;
        Card testedCard = new Card(expResultC, expResult);
        assertEquals (expResultC, testedCard.getCardColor());
    }

    /**
     * Test of equals method, of class Card.
     */
    /**
     * Test 1 : card and instance are null
     */
    @Test
    public void testEqualsNullNull() {
        System.out.println("equals: card and instance are null");
        Card card = null;
        Card instance = null;
        boolean result;
        try { 
            result = instance.equals(card);
            fail("Should raise a null exception error.");
        }
        catch (NullPointerException e) {
            assertTrue ("Catch the NullPointer exception", true);
        }
    }
    /**
     * Test 2 : instance is null, card is not
     */
    @Test
    public void testEqualsNullNotNull() {
        System.out.println("equals: instance is null, card is not");
        Card card;
        Card instance = null;
        boolean result;
        card = new Card(cardColors.CLUB, cardValues.EIGHT); 
        try { 
            result = instance.equals(card);
            fail("Should raise a null exception error.");
        }
        catch (NullPointerException e) {
            assertTrue ("Catch the NullPointer exception", true);
        }
    }
 
    /** 
     * Test 3 : card is null, not instance
     */     
    @Test
    public void testEqualsNotNullNull() {
        System.out.println("equals: card is null, instance is not");
        Card card = null;
        Card instance;
        boolean result;
        boolean expResult=false;
        instance = new Card(cardColors.CLUB, cardValues.EIGHT); 
        result = instance.equals(card);
        assertEquals (expResult, result);
    }
    /**
     * Test 4 : card different from instance
     */
    @Test
    public void testEqualsdifferents() {
        System.out.println("equals: card is different from instance");
        Card card;
        Card instance;
        boolean result;
        boolean expResult=false;
        instance = new Card(cardColors.CLUB, cardValues.EIGHT); 
        card = new Card(cardColors.SPADE, cardValues.TEN);
        result = instance.equals(card);
        assertEquals (expResult, result);
    }
    /**
     * Test 5 : card and instance has the same value, not the same color
     */
    @Test
    public void testEqualsdifferentsColor() {
        System.out.println("equals: card has different color from instance");
        Card card;
        Card instance;
        boolean result;
        boolean expResult=false;
        instance = new Card(cardColors.CLUB, cardValues.EIGHT); 
        card = new Card (cardColors.HEART, cardValues.EIGHT);
        result = instance.equals(card);
        assertEquals (expResult, result);
    }
    /**
     * Test 6 : card and instance are identical
     */
    @Test
    public void testEqualsequivalent() {
        System.out.println("equals: card has different color from instance");
        Card card;
        Card instance;
        boolean result;
        boolean expResult = true;
        instance = new Card(cardColors.CLUB, cardValues.EIGHT); 
        card = new Card (cardColors.CLUB, cardValues.EIGHT);
        result = instance.equals(card);
        assertEquals (expResult, result);
    }
    /**
     * Test 7 : card and instance are the same except card is hidden and
     *          instance is not.
     */
    @Test
    public void testEqualsequivalentHidden() {
        System.out.println("equals: card identical but hidden");
        Card card;
        Card instance;
        boolean result;
        boolean expResult = true;
        instance = new Card(cardColors.CLUB, cardValues.EIGHT); 
        card = new Card (cardColors.CLUB, cardValues.EIGHT);
        instance.show();
        result = instance.equals(card);
        assertEquals (expResult, result);
    }
    /** 
     * Test 8 : card and instance are strictly the same :
     */
    @Test
     public void testEqualssame() {
        System.out.println("equals: card is instance");
        Card instance;
        boolean expResult = true;
        instance = new Card(cardColors.CLUB, cardValues.EIGHT); 
        assertEquals(expResult, instance.equals(instance));
    }
        // Ideas for other tests : 
        /* instance and card are not of the same class
        */

     /**
     * Test of isVisible method, of class Card.
     * it is tested with testHide and testShow
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        Card instance = new Card(cardColors.CLUB, cardValues.QUEEN);
        boolean expResult = false;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);
    }

    /**
     * Test of hide method, of class Card.
     */
    @Test
    public void testHide() {
        System.out.println("hide");
        boolean expResult;
        boolean result;
        Card instance = new Card(cardColors.CLUB, cardValues.QUEEN);
        // TEST 1 hide the card. Check it is visible
        instance.hide();
        result = instance.isVisible();
        expResult = false;
        assertEquals(expResult, result);
    }

    /**
     * Test of show method, of class Card.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        boolean expResult;
        boolean result;
        Card instance = new Card(cardColors.CLUB, cardValues.QUEEN);;
        // TEST 1 show the card. Check it is visible
        instance.show();
        result = instance.isVisible();
        expResult = true;
        assertEquals(expResult, result);
    }
}
