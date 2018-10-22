public class Ticket {
    public static int number;
    public static double price =50.0;

    public Ticket(int number){
        this.number = number;
    }

    public Ticket(int number, int price){
        this.number = number;
        this.price = price;
    }

    public int getNumber(){
        return number;
    }

    public static double getPrice(){
        return price;
    }

    public String toString(){
        return "Number: " +number + ", Price: " +this.getPrice();
    }
}
