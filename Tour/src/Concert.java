import java.time.LocalDate;
import java.util.ArrayList;

public class Concert {
    private Artist artist;
    private Venue venue;
    private LocalDate date;
    private int priceInEuro;
    private ArrayList<Ticket> soldTickets;
    public static final int DEFAULT_TICKET_PRICE_IN_EUROS = 50;
    public static final int MINIMUM_PRICE = 1;
    private boolean isTakenPlace;

    //Constructor


    public Concert(Artist artist, Venue venue, LocalDate date, int priceInEuro, boolean isTakenPlace) {
        if (priceInEuro < 0){
            throw new IllegalArgumentException("Ticket price must be greater than 0");
        }
        this.artist = artist;
        this.venue = venue;
        this.date = date;
        this.priceInEuro = priceInEuro;
        this.soldTickets = new ArrayList<>();
        this.isTakenPlace = false;
    }

    //Getters

    public Artist getArtist() {
        return artist;
    }

    public Venue getVenue() {
        return venue;
    }

    public int getPriceInEuro() {
        return priceInEuro;
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<Ticket> getSoldTickets() {
        return soldTickets;
    }

    //Method
    public boolean hasConcertTakenPlace(){
        if (LocalDate.now().isAfter(date)){
            return isTakenPlace = true;
        }
        return isTakenPlace;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

   public int getRevenue(){
        int total = 0;
        total = soldTickets * priceInEuro *;
        return total;
   }


}
