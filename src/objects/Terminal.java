package objects;

import java.util.Scanner;

public class Terminal {

    public void addCredits(Card cNum, int amount)// Will add credit to the card requested by user
    {

        if (amount > 0) {

            cNum.setCardBalance(cNum.getCardBalance() + (amount * 2));
            System.out.println("Balance of the card no " + cNum.getCardNumber() + " is " + cNum.getCardBalance());

        } else {
            System.out.println("entered amount is not an acceptable amount ");
        }

    }

    public void transferCredits(Card cNum1, Card cNum2)// Transfer credit that will be requested by user 
    {
        System.out.println("Card No " + cNum1.getCardNumber() + " has " + cNum1.getCardBalance() + " Credit Balance in it");
        System.out.println("Card No " + cNum2.getCardNumber() + " has " + cNum2.getCardBalance() + " Credit Balance in it");
        System.out.println("Enter how many credits you want to transfer ");

        Scanner sc = new Scanner(System.in);
        int requestCredit = sc.nextInt();
        if (requestCredit <= cNum2.getCardBalance() && requestCredit > 0) {
            int cardCredits = cNum1.getCardBalance() + requestCredit;
            cNum1.setCardBalance(cardCredits);
            cNum2.setCardBalance(cNum2.getCardBalance() - requestCredit);
            System.out.println("Credit Balance of Card No " + cNum1.getCardNumber() + " after transfer is " + cNum1.getCardBalance());
            System.out.println("Credit Balance of  Card No " + cNum2.getCardNumber() + " after transfer is " + cNum2.getCardBalance());
        } else if (requestCredit > cNum2.getCardBalance()) {
            System.out.println("Requested Credit Amount is more than the Card Credit Balance");
        } else {
            System.out.println("Entered Amount Must be Greater than zero ");
        }

    }

    public void transferTickets(Card cNum1, Card cNum2)// Transfer Ticket according to the user request
    {

        System.out.println("Card No " + cNum1.getCardNumber() + " has " + cNum1.getTicketCredits() + " Ticket Credit in it");
        System.out.println("Card No " + cNum2.getCardNumber() + " has " + cNum2.getTicketCredits() + " Ticket Credit Balance in it");
        System.out.println("Enter how many tickets credits you want to transfer ");

        Scanner sc = new Scanner(System.in);
        int requestTicketCredit = sc.nextInt();
        if (requestTicketCredit > 0 && requestTicketCredit <= cNum2.getTicketCredits()) {

            int cardTickets = cNum1.getTicketCredits() + requestTicketCredit;
            cNum1.setTicketCredits(cardTickets);
            cNum2.setTicketCredits(cNum2.getTicketCredits() - requestTicketCredit);
            System.out.println("Ticket Credit Balance of Card No " + cNum1.getCardNumber() + " after transfer is " + cNum1.getTicketCredits());
            System.out.println("Ticket Credit Balance of  Card No " + cNum2.getCardNumber() + " after transfer is " + cNum2.getTicketCredits());
        } else if (requestTicketCredit > 0 && requestTicketCredit > cNum2.getTicketCredits()) {
            System.out.println("Ticket credit requested is more than ticket credit balance");
        } else {
            System.out.println("Entered ticket credit must be greater than zero");
        }
    }

    public void requestPrize(String pName, Card cNum)// get the prize as per the request
    {
        
        PrizeCategory prize = new PrizeCategory();
        prize.prizeFinder(cNum, pName);
    }
}
