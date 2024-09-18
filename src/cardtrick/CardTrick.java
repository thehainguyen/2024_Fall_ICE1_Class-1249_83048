/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;
import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nagma
 * @modified by The Hai Nguyen - 991745555
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            Random rand = new Random();
            int v = rand.nextInt(13) + 1;
            c.setValue(v);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int s = rand.nextInt(4);
            c.setSuit(Card.SUITS[s]);
            
            //Add card into card array
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int inputValue = scanner.nextInt();
        
        System.out.print("Pick a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String inputSuit = scanner.next();
        
        Card inputCard = new Card();
        inputCard.setValue(inputValue);
        inputCard.setSuit(inputSuit);
               
        boolean isMagicCard = false;
        for (Card c : magicHand) {
            if (c.getValue() == inputValue && c.getSuit().equals(inputSuit)){
                System.out.println("Your card is in the magic hand");
                isMagicCard = true;
                break;
            }
        }
        
        if (!isMagicCard) {
            System.out.println("Your card is not in the magic hand");
        }
    }
    
}