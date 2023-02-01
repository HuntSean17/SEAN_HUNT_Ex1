package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Sean Hunt Feb 1, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
       Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();

            card.setValue((int)(Math.random()*13) +1);
            //card.setValue(insert call to random number generator here)
            card.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            hand[i] = card;
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
            Scanner input = new Scanner(System.in);
            Card userCard = new Card();
            System.out.println("please guess Card Value 1-10, 11 for Jack, 12 for Queen, 13 for King, 14 for Ace");
            userCard.setValue(input.nextInt());
            System.out.println("Please guess the the Card Suit 1 for Hearts, 2 for Spades, 3 for Diamonds, 4 for Clubs");
            userCard.setSuit(Card.SUITS[input.nextInt() -1]); 

            // insert code to ask the user for Card value and suit, create their card
            // and search the hand here. 
            // Hint: You can ask for values 1 to 10, and then
            //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
            //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
            // 
            // Then loop through the cards in the array to see if there's a match.
            for (int x = 0; x < hand.length; x++) {
                if (userCard.getSuit() == hand[x].getSuit()){
                    if(userCard.getValue() == hand[x].getValue()){
                        System.out.println("Your guess was Correct");
                        printInfo();
                        return;
                    }
                }
                else{
                    System.out.println("Your guess was wrong");
                }
            }
            // If the guess is successful, invoke the printInfo() method below.
        
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sean, but you can call me Sean");
        System.out.println();
        
        System.out.println("My semester goals");
        System.out.println("Raise my average to 75");


        System.out.println("My hobbies:");
        System.out.println("Video games");
        System.out.println("-- Cooking");
        System.out.println("-- Reading");
        
        System.out.println();
        
    
    }

}
