package datenightatthearcade;

import objects.*;

public class DateNightAtTheArcade {

    public static void main(String[] args) {

        Card card1 = new Card();
        Card card2 = new Card();

        Terminal terminal1 = new Terminal();
        Terminal terminal2 = new Terminal();
        terminal1.addCredits(card1, 20);//Adding Balance to Card
        terminal1.addCredits(card2, 40);
        terminal2.addCredits(card1, 10);// Adding Balance to Card 1 Again using different Terminal 

        card1.getCardBalance();
        card2.getCardBalance();
        Game game1 = new Game(10);
        Game game2 = new Game(7);
        System.out.println("Card Number " + card1.getCardNumber() + " is used to play Game ");
        for (int i = 0; i < 9; i++) {
            game1.play(card1);
        }
        System.out.println("Remaining Balance of Card Number " + card1.getCardNumber() + " is " + card1.getCardBalance());
        System.out.println("Card Number " + card2.getCardNumber() + " is used to play the game ");
        for (int i = 0; i < 5; i++) {
            game2.play(card2);
        }
        System.out.println("Remaining Balance of the Card Number " + card2.getCardNumber() + " is " + card2.getCardBalance());
        System.out.println("Tickets earned after playing game " + card1.getTicketCredits());

        terminal1.transferCredits(card1, card2);
        terminal2.transferTickets(card1, card2);

        System.out.println("Prizes can be won after earning 15 ticket credits ");

        terminal1.requestPrize("Candy", card1);// Getting Prizes using card 1 tickets from terminal 1
        terminal2.requestPrize("Glasses", card1);// Using Card 1 but from terminal 2
        terminal1.requestPrize("Hat", card1);
        terminal1.requestPrize("Candy", card1);
        terminal1.requestPrize("Candy", card1);
        terminal1.requestPrize("Cycle", card1);
        terminal1.requestPrize("Candy", card2);

    }

}
