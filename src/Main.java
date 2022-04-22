public class Main {
    public static void main(String[] args) {

        int ticketPrice = 190;
        int bonusPerMile = 20;
        int bonusMiles = ticketPrice / bonusPerMile;

        System.out.println("Вам было начислено " + bonusMiles + " бонусных миль.");
    }
}
