package cinema;

public class Refund {
    private Seat returned_ticket;

    public Refund(){

    }

    public Refund(Seat returned_ticket){
        this.returned_ticket = returned_ticket;
    }

    public void setReturned_ticket(Seat returned_ticket) {
        this.returned_ticket = returned_ticket;
    }

    public Seat getReturned_ticket(){
        return this.returned_ticket;
    }
}
