public class Ticket {
    private String code;
    private Concert concert;

    //Constructor
    public Ticket(String code, Concert concert) {
        this.code = code;
        this.concert = concert;
    }

    //Getter

    public String getCode() {
        return code;
    }

    public Concert getConcert() {
        return concert;
    }

    //Methods


    //toString
    @Override
    public String toString() {
        return "Artist name - " + concert.getArtist().getName() + " Venue - "
                + concert.getVenue() + " Concert Date - " + concert.getDate();
    }

}
