package heranca.exercicio1;

public class Main
{
    public static void main (String[] args)
    {
        Ticket i = new Ticket(10);
        TicketVIP iVip = new TicketVIP(10, 5);

        System.out.println(i);
        System.out.println(iVip);
    }
}