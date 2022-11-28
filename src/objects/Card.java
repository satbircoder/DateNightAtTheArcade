package objects;

public class Card {

    private int cardBalance;
    private int ticketcredit;
    private int cardNumber;
    private static int numberOfCardsCreated = 0;

    public Card() {//Generate the Card Number when an object has been created
        numberOfCardsCreated += 1;
        cardNumber = cardNumber + numberOfCardsCreated;
    }

    public int getCardNumber() {// will provide the card number
        return cardNumber;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) // Set the balance of the card eneterd by user through terminal
    {
        this.cardBalance = cardBalance;
    }

    public void setTicketCredits(int ticketcredit) {// Set Ticket credits earned by playing game
        this.ticketcredit = ticketcredit;
    }

    public int getTicketCredits() {
        return this.ticketcredit;
    }
}
