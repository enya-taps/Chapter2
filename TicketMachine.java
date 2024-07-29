/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private double save;

    private double rabatt;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(String art)
    {
        price = 100;
        balance = 0;
        total = 0;
        rabatt = 0.05;
        save = price *rabatt;
        if(art.equals("normal")){
            price = 100;
        } else if(art.equals("schueler")){
            price -= save;
        } else{
            price = 1000;
        }

    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
            balance -= price;
            total += price;
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("Sie haben: "+ save +" Cent erspart.");
            System.out.println("Sie erhalten ein Rückgeld von: "+ refundBalance() + " Cent.");
            System.out.println("##################");
            System.out.println();
        }
        else {
            int stillpay = price - balance;
            System.out.println("You must insert at least: " +
                stillpay + " more cents.");

        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    private int refundBalance()
    {
        int amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }

    public int entleeren(){
        int whole = total;
        total = 0;
        return whole;

    }
}
