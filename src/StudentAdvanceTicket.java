public class StudentAdvanceTicket extends AdvanceTicket{

    public StudentAdvanceTicket(int number, int daysInAdvance){
        super(number,daysInAdvance);
        price = price/2;
    }
    public String toString(){
        return"Ticket type: Student Advanced, Number: " + number+", Price: "+ price+ "(ID required)";
    }
}
