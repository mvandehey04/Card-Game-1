package edu.cs2430.assignment2;
import java.util.Arrays;
import java.util.Random;
// Assignment02 Template
// Madeline Vande Hey
// estimated time worked on: 7.5 hr
public class Assignment02{
    private static final int NUMBER_OF_PLAYERS = 4;
    // Hand consists of 4 cards
    private static final int NUMBER_OF_CARDS_IN_HAND = 4;
    private static final String[] RANKS = {"Ace", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts",
            "Spades"};
    private static final int NUMBER_OF_SUITS = SUITS.length;
    private static final int NUMBER_OF_RANKS = RANKS.length;
    private static final int NUMBER_OF_CARDS_IN_DECK = NUMBER_OF_RANKS *
            NUMBER_OF_SUITS;
    // Since it makes no sense for TEN + ACE = JACK, this really should be an enumeration when enumerations are taught
    private static final int ACE = 0;
    private static final int TWO = 1;
    private static final int THREE = 2;
    private static final int FOUR = 3;
    private static final int FIVE = 4;
    private static final int SIX = 5;
    private static final int SEVEN = 6;
    private static final int EIGHT = 7;
    private static final int NINE = 8;
    private static final int TEN = 9;
    private static final int JACK = 10;
    private static final int QUEEN = 11;
    private static final int KING = 12;
    private static final int ACE_POINT_VALUE = 11;
    private static final int TWO_POINT_VALUE = 2;
    private static final int THREE_POINT_VALUE = 3;
    private static final int FOUR_POINT_VALUE = 4;
    private static final int FIVE_POINT_VALUE = 5;
    private static final int SIX_POINT_VALUE = 6;
    private static final int SEVEN_POINT_VALUE = 7;
    private static final int EIGHT_POINT_VALUE = 8;
    private static final int NINE_POINT_VALUE = 9;
    private static final int TEN_POINT_VALUE = 10;
    private static final int JACK_POINT_VALUE = 10;
    private static final int QUEEN_POINT_VALUE = 10;
    private static final int KING_POINT_VALUE = 10;
    private static final int CLUBS = 0;
    private static final int DIAMONDS = 1;
    private static final int HEARTS = 2;
    private static final int SPADES = 3;
    /**
     * Main method. Can be used for any playing/testing.
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        playGame(random);
    }
    /**
     ** Returns the Suit index for a given card number
     * 0 = Clubs
     * 1 = Diamonds
     * 2 = Hearts
     * 3 = Spades
     *
     * @param cardNumber The card number (0 - 51)
     * @return The suit index for a given card
     */
    private static int getSuit(int cardNumber){
        // TODO implement
        // set suit value to -1
        int suit = -1;

        // compare card number to find appropriate suit value
        if(cardNumber <= 12){
            suit = 0;
        }
        else if(cardNumber <= 25){
            suit = 1;
        }
        else if(cardNumber <= 38){
            suit = 2;
        }
        else if(cardNumber <= 51){
            suit = 3;
        }

        // replace return value (just used as a place holder to provide a template that compiles)
        // return the suit of the provided card number
        return suit;
    }
    /**
     * Returns the rank index for a given card number
     * 0 = Ace
     * 1 = Two
     * 2 = Three
     * 3 = Four
     * 4 = Five
     * 5 = Six
     * 6 = Seven
     * 7 = Eight
     * 8 = Nine
     * 9 = Ten
     * 10 = Jack
     * 11 = Queen
     * 12 = King
     ** @param cardNumber The card number (0 - 51)
     * @return The rank index for a given card
     */
    private static int getRank(int cardNumber){
        // TODO implement
        // initializes card rank to -1
        int rank = -1;

        // series of if statements to match the card's number to the rank of the card
        if(cardNumber == 0 || cardNumber == 13 || cardNumber == 26 || cardNumber == 39){
            rank = 0;
        }
        else if(cardNumber == 1 || cardNumber == 14 || cardNumber == 27 || cardNumber == 40){
            rank = 1;
        }
        else if(cardNumber == 2 || cardNumber == 15 || cardNumber == 28 || cardNumber == 41){
            rank = 2;
        }
        else if(cardNumber == 3 || cardNumber == 16 || cardNumber == 29 || cardNumber == 42){
            rank = 3;
        }
        else if(cardNumber == 4 || cardNumber == 17 || cardNumber == 30 || cardNumber == 43){
            rank = 4;
        }
        else if(cardNumber == 5 || cardNumber == 18 || cardNumber == 31 || cardNumber == 44){
            rank = 5;
        }
        else if(cardNumber == 6 || cardNumber == 19 || cardNumber == 32 || cardNumber == 45){
            rank = 6;
        }
        else if(cardNumber == 7 || cardNumber == 20 || cardNumber == 33 || cardNumber == 46){
            rank = 7;
        }
        else if(cardNumber == 8 || cardNumber == 21 || cardNumber == 34 || cardNumber == 47){
            rank = 8;
        }
        else if(cardNumber == 9 || cardNumber == 22 || cardNumber == 35 || cardNumber == 48){
            rank = 9;
        }
        else if(cardNumber == 10 || cardNumber == 23 || cardNumber == 36 || cardNumber == 49){
            rank = 10;
        }
        else if(cardNumber == 11 || cardNumber == 24 || cardNumber == 37 || cardNumber == 50){
            rank = 11;
        }
        else if(cardNumber == 12 || cardNumber == 25 || cardNumber == 38 || cardNumber == 51){
            rank = 12;
        }

        // replace return value (just used as a place holder to provide a template that compiles)
        // returns the appropriate card rank for given card number
        return rank;
    }
    /**
     * Returns the point value associated with the card rank
     * (0) Ace = 11
     * (1) Two = 2
     * (2) Three = 3
     * (3) Four = 4
     * (4) Five = 5
     * (5) Six = 6
     * (6) Seven = 7
     * (7) Eight = 8
     * (8) Nine = 9
     * (9) Ten = 10
     * (10) Jack = 10
     * (11) Queen = 10
     * (12) King = 10
     *
     * @param rank The rank (0-12) of the card
     * @return The point value
     */
    private static int getPointValue(int rank){
        // TODO implement
        // initialize cardRank to return -1
        int pointValue = -1;

        // series of if statements to match the provided rank to return the card's point value
        if(rank == 0){
            pointValue = 11;
        }
        else if(rank == 1){
            pointValue = 2;
        }
        else if(rank == 2){
            pointValue = 3;
        }
        else if(rank == 3){
            pointValue = 4;
        }
        else if(rank == 4){
            pointValue = 5;
        }
        else if(rank == 5){
            pointValue = 6;
        }
        else if(rank == 6){
            pointValue = 7;
        }
        else if(rank == 7){
            pointValue = 8;
        }
        else if(rank == 8){
            pointValue = 9;
        }
        else if(rank >= 9){
            pointValue = 10;
        }

        // replace return value (just used as a place holder to provide a template that compiles)
        // returns the point value of the card provided
        return pointValue;
    }
    /**
     * Returns the card name based on the rank and suit
     * Example: "Ace of Spades"
     * Example: "Five of Diamonds"
     *
     * @param cardNumber The card number (0-51)
     * @return A String for the card name
     */
    private static String getCardName(int cardNumber){
        int suit = getSuit(cardNumber);
        int rank = getRank(cardNumber);
        String suitName = SUITS[suit];
        String rankName = RANKS[rank];
        return rankName + " of " + suitName;
    }
    /**
     * Creates a deck of cards.
     * Initializes a 1-dimensional array of integers to represent the cards and assigns each index to its value.
     *
     * Example (Use a loop when programming)
     * deck[0] = 0
     * deck[1] = 1
     * ...
     *
     * @return Returns the deck (array) of cards
     */
    private static int[] createDeck(){
        // TODO implement
        // create array of length 52
        int[] deck = new int[52];

        // for each value in the deck assign the index
        for(int i= 0; i < deck.length; i++){
            deck[i] = i;
        }

        // replace return value (just used as a place holder to provide a template that compiles)
        // return the final deck
        return deck;
    }
    /**
     * Creates all hands. There will be 4 players with each hand consisting of 4 cards.
     * A hand will be represented as a two-dimensional array of integers. (Number of players x Cards in hand)
     * All hands will be initialized with -1 for all card values.
     *
     * @return Returns the hands (2-dimensional array of integers) for all players
     */
    private static int[][] createHands(){
        int[][] hands = new int[NUMBER_OF_PLAYERS][NUMBER_OF_CARDS_IN_HAND];
        for (int[] hand : hands){
            Arrays.fill(hand, -1);
        }
        return hands;
    }
    /**
     * Shuffles the cards.
     * Uses the version of the Fisher-Yates algorithm created by Richard Durstenfield <br></>
     * https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle <br></>
     * For each position in the list, the random object should be called exactly once to find
     * a random position to swap with
     *
     * @param cards The array of integers representing the cards
     * @param random An instance of a Random object used for generating random numbers
     */
    private static void randomShuffle(int[] cards, Random random){
        // TODO implement
        // replace the first index to the last with random numbers
        for(int i = 0; i < cards.length; i++){
            // next random number
            int index = random.nextInt(cards.length);
            int temp = cards[index];
            // slide index
            cards[index] = cards[i];
            cards[i] = temp;
        }

    }
    /**
     * Deals four cards to all players.
     * When a card is dealt to a hand, the integer value of the deck array is assigned into the hand array
     * The value in the deck array (where the card was just dealt from) is then set to -1.
     * After the correct number of cards is dealt each hand is sorted using the Arrays.sort() method
     *
     * @param deck The deck of cards to deal from
     * @param hands The hands for all players
     * @return Returns the index of the current card at the top of the deck.
     */
    private static int dealHands(int[] deck, int[][] hands){
        int deckPosition = deck.length - 1;
        for(int i=0; i<NUMBER_OF_CARDS_IN_HAND; i++){
            for(int j=0; j<hands.length; j++){
                hands[j][i] = deck[deckPosition];
                deck[deckPosition] = -1;
                deckPosition--;
            }
        }
        for (int[] hand : hands){
            Arrays.sort(hand);
        }
        return deckPosition;
    }
    /**
     * Logic for playing the card game
     *
     * @param random Random object used for generating random numbers
     */
    public static void playGame(Random random){
        int[] deck = createDeck();
        int[][] hands = createHands();
        randomShuffle(deck, random);
        int deckPosition = dealHands(deck, hands);
        int discardCard = deck[deckPosition];
        deckPosition--;
        int currentTurnIndex = 0;
        int totalTurns = 1;
        int knockIndex = -1;
        while(!isHandOver(deck, knockIndex, currentTurnIndex)){
            System.out.println("Player " + (currentTurnIndex+1) + "'s turn");
            System.out.println("Player " + (currentTurnIndex+1) + "'s cards");
            for(int card : hands[currentTurnIndex]){
                System.out.println(getCardName(card));
            }
            System.out.println("Deck card: " + getCardName(deck[deckPosition]));
            System.out.println("Discard card: " + getCardName(discardCard));
            boolean choseDiscard = chooseCard(discardCard, hands[currentTurnIndex]);
            int chosenCard;
            if(choseDiscard){
                chosenCard = discardCard;
            }
            else{
                chosenCard = deck[deckPosition];
                deck[deckPosition] = -1;
                deckPosition--;
            }
            System.out.println("Player " + (currentTurnIndex+1) + " chooses " + getCardName(chosenCard));
            int[] tempHand = new int[hands[currentTurnIndex].length+1];
            System.arraycopy(hands[currentTurnIndex], 0, tempHand, 0, hands[currentTurnIndex].length);
            tempHand[tempHand.length-1] = chosenCard;
            int discardIndex = chooseDiscardIndex(tempHand, discardCard);
            discardCard = tempHand[discardIndex];
            int handIndex = 0;
            for(int i=0; i<tempHand.length; i++){
                if(i != discardIndex){
                    hands[currentTurnIndex][handIndex] = tempHand[i];
                    handIndex++;
                }
            }
            Arrays.sort(hands[currentTurnIndex]);
            System.out.println("Player " + (currentTurnIndex+1) + " discards " + getCardName(discardCard));
            if(knockIndex == -1){
                boolean knock = shouldKnock(hands[currentTurnIndex], totalTurns);
                if(knock){
                    knockIndex = currentTurnIndex;
                    System.out.println("Player " + (currentTurnIndex+1) + " knocks");
                }
            }
            currentTurnIndex++;
            currentTurnIndex = currentTurnIndex % NUMBER_OF_PLAYERS;
            totalTurns++;
        }
        int highestPoints = Integer.MIN_VALUE;
        int highestPointsIndex = -1;
        for(int i=0; i<NUMBER_OF_PLAYERS; i++){
            int currentPoints = calculateHandValue(hands[i]);
            System.out.println("Player " + (i+1) + " has " + currentPoints + " points");
            if(currentPoints > highestPoints){
                highestPoints = currentPoints;
                highestPointsIndex = i;
            }
        }
        System.out.println("Player " + (highestPointsIndex+1) + " wins");
    }
    /**
     * Simple AI for choosing between the deck card or the discard card.
     * If adding the discard to the hand improved the point value, then the discard is chosen.
     * @param discardCard The card number of the card in the discard pile
     * @param hand The current player's hand
     * @return Returns true if the discard card is chosen, false otherwise.
     */
    private static boolean chooseCard(int discardCard, int[] hand){
        boolean chooseDiscard = false;
        int[] tempHand1 = new int[hand.length+1];
        System.arraycopy(hand, 0, tempHand1, 0, hand.length);
        tempHand1[tempHand1.length-1] = discardCard;
        int handValue = calculateHandValue(hand);
        int handValue1 = calculateHandValue(tempHand1);
        if(handValue1 >= handValue){
            chooseDiscard = true;
        }
        return chooseDiscard;
    }
    /**
     * Simple AI to choose which card to discard.
     * Per game rules, if the discard card is chosen it cannot be discarded
     * For all possible discards, a new hand with four cards is created.
     * The point value for each of these hands is calculated.
     * The discard card index which gives the highest point value in the remaining hand is chosen.
     * @param hand The current state of the hand with 5 cards
     * @param discardCard The discard card (whether or not the player chose it)
     * @return The index of the card to discard
     */
    private static int chooseDiscardIndex(int[] hand, int discardCard){
        int selectedCardIndex = -1;
        int bestPoints = Integer.MIN_VALUE;

        for(int i=0; i<hand.length; i++){
            if(hand[i] != discardCard){
                int[] tempHand = new int[hand.length-1];
                int tempHandIndex = 0;
                for(int j=0; j<hand.length; j++){
                    if(j != i){
                        tempHand[tempHandIndex] = hand[j];
                        tempHandIndex++;
                    }
                }
                int points = calculateHandValue(tempHand);
                if(points > bestPoints){
                    bestPoints = points;
                    selectedCardIndex = i;
                }
            }
        }
        return selectedCardIndex;
    }
    /**
     * Simple AI on whether a player should knock.
     * Based on the turn count, number of players, and the current hand point value.
     *
     * @param hand The current player's hand
     * @param turnCount The turn number
     * @return True if the player should knock, false otherwise
     */
    private static boolean shouldKnock(int[] hand, int turnCount){
        boolean shouldKnock = false;
        int points = calculateHandValue(hand);
        // just made this up for simplicity
        if(points > ((turnCount / NUMBER_OF_PLAYERS)+5)*5){
            shouldKnock = true;
        }
        return shouldKnock;
    }
    /**
     * Calculates the value for a given hand.
     * The points for each suit are calculated, which is the sum of all ranks with that suit.
     * The points from suits with lower point values are subtracted from the points of the suit with the highest value.
     * The final value is returned.
     *
     * Example:
     * AC, 9D, 5D, 2S
     *
     * Clubs = 11
     * Diamonds = 9 + 5 = 14
     * Hearts = 0
     * Spades = 2
     *
     * 0 = Clubs
     * 1 = Diamonds
     * 2 = Hearts
     * 3 = Spades
     *
     * 14 - 11 - 0 - 2 = 1
     * Final value = 1
     *
     * @param hand The integer array of cards representing a hand
     * @return The point value for the given hand
     */
    public static int calculateHandValue(int[] hand){
        // TODO implement
        // the value of the hand
        int handValue = 0;

        // count of each suit
        int clubCount = 0;
        int diamondCount = 0;
        int heartCount = 0;
        int spadeCount = 0;

        // the highest card
        int highestCard = -1;

        // for each card in the hand, check the suit and add the point value
        for(int card : hand){
            if(getSuit(card) == 0){
                clubCount += getPointValue(getRank(card));
            }
            else if(getSuit(card) == 1){
                diamondCount += getPointValue(getRank(card));
            }
            else if(getSuit(card) == 2){
                heartCount += getPointValue(getRank(card));
            }
            else if(getSuit(card) == 3){
                spadeCount += getPointValue(getRank(card));
            }
        }

        // if the highest point value is club, add to the hand value
        if(clubCount > diamondCount && clubCount > heartCount && clubCount > spadeCount){
            handValue = clubCount - diamondCount - heartCount - spadeCount;

        }

        // if the highest point value is the diamond, add to the hand value
        else if(diamondCount > clubCount && diamondCount > heartCount && diamondCount > spadeCount){
            handValue = diamondCount - clubCount - heartCount - spadeCount;
        }

        // if the highest point value is the heart, add to the hand value
        else if(heartCount > diamondCount && heartCount > clubCount && heartCount > spadeCount){
            handValue = heartCount - diamondCount - clubCount - spadeCount;

        }

        // if the highest point value is the spade, add to the hand value
        else if(spadeCount > diamondCount && spadeCount > heartCount && spadeCount > clubCount){
            handValue = spadeCount - diamondCount - heartCount - clubCount;

        }

        // if all the values are the same, then add one, and subtract the rest
        else if(clubCount == diamondCount && clubCount == heartCount && clubCount == spadeCount){
            handValue = clubCount - diamondCount - heartCount - spadeCount;
        }

        // if the club count is equal to another value, and the rest of the suits are equal to nothing, the hand value is 0
        // not necessary but ensures the hand is 0
        else if(clubCount == diamondCount && heartCount == 0 && spadeCount == 0){
            handValue = 0;
        }
        else if(clubCount == heartCount && diamondCount == 0 && spadeCount ==0){
            handValue = 0;
        }
        else if(clubCount == spadeCount && diamondCount == 0 && heartCount == 0){
            handValue = 0;
        }
        // if the diamond count is equal to another value, and the rest of the suits are equal to nothing, the hand is 0
        else if(diamondCount == heartCount && clubCount == 0 && spadeCount == 0){
            handValue = 0;
        }
        else if(diamondCount == spadeCount && clubCount == 0 && heartCount == 0){
            handValue = 0;
        }
        // if the heart count is equal to another value, and the rest of the suits are equal to nothing, the hand is 0
        else if(heartCount == spadeCount && clubCount == 0 && diamondCount == 0){
            handValue = 0;
        }


        // if the club count is equal to another value, and the other suits do not equal 0, subtract the lower values from the hand value
        else if(clubCount == diamondCount && (heartCount > 0 || spadeCount > 0)){
            if(heartCount == spadeCount && ((-clubCount - diamondCount) > (-heartCount - spadeCount))) handValue = -clubCount - diamondCount;
            else handValue = -heartCount - spadeCount;
        }
        else if(clubCount == heartCount && (diamondCount > 0 || spadeCount > 0)){
            if(diamondCount == spadeCount && ((-clubCount - heartCount) > (-diamondCount - spadeCount))) handValue = -clubCount - heartCount;
            else handValue = -diamondCount - spadeCount;
        }
        else if(clubCount == spadeCount && (diamondCount > 0 || heartCount > 0)){
            if(diamondCount == heartCount && ((-clubCount - spadeCount) > (-diamondCount - heartCount))) handValue = -clubCount - spadeCount;
            else handValue = -diamondCount - heartCount;
        }
        // if the diamond count is equal to another value, and the other suits do not equal 0, subtract the lower values from the hand value
        else if(diamondCount == heartCount && (clubCount > 0 || spadeCount > 0)){
            if(clubCount == spadeCount && ((-diamondCount - heartCount) > (-clubCount - spadeCount))) handValue = -diamondCount - heartCount;
            else handValue = -clubCount - spadeCount;
        }
        else if(diamondCount == spadeCount && (clubCount > 0 || heartCount > 0)){
            if(clubCount == heartCount && ((-diamondCount - spadeCount) > (-clubCount - heartCount))) handValue = -diamondCount - spadeCount;
            else handValue = -clubCount - heartCount;
        }
        // if the heart count is equal to another value, and the other suits do not equal 0, subtract the lower values from the hand value
        else if(heartCount == spadeCount && (clubCount > 0 || diamondCount > 0)){
            if(clubCount == diamondCount && ((-heartCount - spadeCount) > (-clubCount - diamondCount))) handValue = -heartCount -spadeCount;
            else handValue = -clubCount - diamondCount;
        }

        // otherwise the highest card minus the rest of the values
        else{
            for(int card : hand){
                if(getPointValue(getRank(card)) > highestCard){
                    highestCard = getPointValue(getRank(card));
                }
            }
            handValue = highestCard;
            for(int card : hand){
                if(getPointValue(getRank(card)) != highestCard){
                    handValue -= getPointValue(getRank(card));
                }
            }
        }

        // replace return value (just used as a place holder to provide a template that compiles)
        // return the value of the hand
        return handValue;
    }
    /**
     * Determines if the hand is over.
     * If there are no more cards in the deck then the hand is over.
     * If the current turn is for a player that had knocked the previous turn then the hand is over.
     *
     * @param deck The deck of cards. If deck[0] == -1, the hand is over
     * @param knockIndex The index of the player who knocked. -1 if no player has knocked.
     * @param currentTurnIndex The index of the current player
     * @return True if the hand is over, false otherwise
     */
    private static boolean isHandOver(int[] deck, int knockIndex, int currentTurnIndex){
        // TODO implement
        // if the deck is empty... the hand is over
        boolean handOver = false;
        if(deck[0] == -1){
            handOver = true;
        }
        // if there has been a knock AND the following turns have been completed... the hand is over
        else if(knockIndex != -1 && currentTurnIndex == knockIndex){
            handOver = true;
        }
        // replace return value (just used as a place holder to provide a template that compiles)
        // returns whether the hand is over or not
        return handOver;
    }
}