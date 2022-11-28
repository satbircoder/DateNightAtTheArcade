package objects;

public class PrizeCategory {

    private static int candyCount = 3;
    private static int hatCount = 2;
    private static int glassCount = 2;
    private String[] prizeNames = {"Candy", "Hat", "Glasses"};
    boolean isFound = false;
    //private Object Candy;

    public void prizeFinder(Card tCredit, String prizeRequest) {//this will Find requested prize is in the prize list or not and function accordingly 
        for (String i : prizeNames) {
            if (i.equals(prizeRequest)) {
                isFound = true;
                if ("Candy".equals(prizeRequest) && tCredit.getTicketCredits() > 14 && candyCount != 0) {
                    System.out.println("You have Won Candy");
                    setCandyCount(candyCount - 1);
                    System.out.println("Remaining Candy Prize " + getCandyCount());
                    tCredit.setTicketCredits(tCredit.getTicketCredits() - 15);
                    System.out.println("Remaining ticket Credits are " + tCredit.getTicketCredits());

                } else if (candyCount == 0 && "Candy".equals(prizeRequest) && tCredit.getTicketCredits() > 14) {
                    System.out.println("Candy is not available");
                }
                if ("Hat".equals(prizeRequest) && tCredit.getTicketCredits() > 24 && hatCount != 0) {
                    System.out.println("You have Won Hat");
                    setHatCount(hatCount - 1);
                    System.out.println("Remaining Hat Prize " + getHatCount());
                    tCredit.setTicketCredits(tCredit.getTicketCredits() - 25);
                    System.out.println("Remaining ticket Credits are " + tCredit.getTicketCredits());

                } else if (hatCount == 0 && "Hat".equals(prizeRequest) && tCredit.getTicketCredits() > 24) {
                    System.out.println("Hat is not available");
                }
                if ("Glasses".equals(prizeRequest) && tCredit.getTicketCredits() > 39 && glassCount != 0) {
                    System.out.println("You have Won Glasses");
                    setGlassCount(glassCount - 1);
                    System.out.println("Remaining Glasses Prize " + getGlassCount());
                    tCredit.setTicketCredits(tCredit.getTicketCredits() - 40);
                    System.out.println("Remaining ticket Credits are " + tCredit.getTicketCredits());

                } else if (glassCount == 0 && "Glasses".equals(prizeRequest) && tCredit.getTicketCredits() > 39) {
                    System.out.println("Glasses are not available");

                }

            }

        }
        if (!isFound) {
            System.out.println(prizeRequest + " is not in the prize list");
        } else if (tCredit.getTicketCredits() < 15) {
            System.out.println("Not Enough Tickets Credit to win " + prizeRequest);
        }
    }

    private int getCandyCount() {
        return candyCount;
    }

    private void setCandyCount(int acandyCount) {
        candyCount = acandyCount;
    }

    private static int getHatCount() {
        return hatCount;
    }

    private static void setHatCount(int aHatCount) {
        hatCount = aHatCount;
    }

    private static int getGlassCount() {
        return glassCount;
    }

    private static void setGlassCount(int aGlassCount) {
        glassCount = aGlassCount;
    }

}
