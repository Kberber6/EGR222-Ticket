public class WalkupTicket extends Ticket{

    public WalkupTicket(int number){
        super(number);
    }

    public WalkupTicket(int number, int price){
        super(number,price);
    }
    public String toString(){
        return "Ticket Type: Walk-up, Number: " + getNumber() + ", Price: "+ getPrice();
    }
}
