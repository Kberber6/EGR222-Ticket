//Created by Tristan Nguyen and Kevin Berber
public class TicketClient{
    public static void main(String[] args){
        Ticket t1 = new Ticket(1234);
        System.out.println(t1);
        System.out.println(t1.getPrice());
        Ticket t2 = new Ticket(1235, 20);
        System.out.println(t2);
        System.out.println(t2.getPrice());
        WalkupTicket wt1 = new WalkupTicket(1236);
        System.out.println(wt1);
        WalkupTicket wt2 = new WalkupTicket(1237,15);
        System.out.println(wt2);
        AdvanceTicket ta1 = new AdvanceTicket(123,11);
        System.out.println(ta1);
        AdvanceTicket ta2 = new AdvanceTicket(6969,9);
        System.out.println(ta2);
        StudentAdvanceTicket sa1 = new StudentAdvanceTicket(123,11);
        System.out.println(sa1);
        StudentAdvanceTicket sa2 = new StudentAdvanceTicket(6969,9);
        System.out.println(sa2);
    }
}
