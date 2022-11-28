package objects;

import java.util.Random;

public class Game //This will set the cost of the game
{

    private int gameCost;

    public Game(int gameCost) {
        this.gameCost = gameCost;
        System.out.println("the cost of the game is " + gameCost);

    }

    public void play(Card cNum) // Charge the card for playing a particular game
    {
        int cardCredit = cNum.getCardBalance();
        if (cardCredit > gameCost) {
            int remBalance = cardCredit - gameCost;
            cNum.setCardBalance(remBalance);
            System.out.println("Balance of Card no " + cNum.getCardNumber() + " after playing the game " + cNum.getCardBalance());

            cNum.setTicketCredits((cNum.getTicketCredits() + ticketCredit()));
        } else {
            System.out.println("Card Balance is not enough to play the game");
        }

    }

    public int ticketCredit() // Generate the ticket credits earned after playing game (Random ticket generator)
    {
        Random rand = new Random();
        int tCredit = rand.nextInt(0, 30);
        return tCredit;

    }

}
