import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class TourManager {
    private String name;
    private int maxAmountOfArtist;
    private ArrayList<Artist> artists;
    private ArrayList<Venue> venues;
    private ArrayList<Concert> concerts;

    //Constructor

    public TourManager(String name, int maxAmountOfArtist) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null");
        }
        if (maxAmountOfArtist < 0) {
            throw new IllegalArgumentException("Number of artist must be 0 or greater");
        }
        this.name = name;
        this.maxAmountOfArtist = maxAmountOfArtist;
        this.artists = new ArrayList<>();
        this.venues = new ArrayList<>();
        this.concerts = new ArrayList<>();
    }

    //Getter

    public String getName() {
        return name;
    }

    public int getMaxAmountOfArtist() {
        return maxAmountOfArtist;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public ArrayList<Venue> getVenues() {
        return venues;
    }

    public ArrayList<Concert> getConcerts() {
        return concerts;
    }

    //Methods

    //filter artist by concert
    public ArrayList<Concert> getConcertsByArtist(String artist) {
        ArrayList<Concert> result = new ArrayList<>();
        for (Concert concert : concerts) {
            if (concert.getArtist().getName().equalsIgnoreCase(artist)) {
                result.add(concert);
            }
        }
        return result;
    }


    //get concert by venue
    public ArrayList<Concert> getConcertsByVenue(String venue) {
        ArrayList<Concert> result = new ArrayList<>();
        for (Concert concert : concerts) {
            if (concert.getVenue().getName().equalsIgnoreCase(venue)) {
                result.add(concert);
            }
        }
        return result;
    }

    //get concert by date
    public ArrayList<Concert> getConcertsByDate(LocalDate date) {
        ArrayList<Concert> result = new ArrayList<>();
        for (Concert concert : concerts) {
            if (concert.getDate().equals(date)) {
                result.add(concert);
            }
        }
        return result;
    }

    //get concert from the 3 helper method
    //public Concert getConcert(){


   // }

    public void addArtist(Artist artist){
        if (artist == null){
            throw new IllegalArgumentException("artist cannot be null");
        }
        artists.add(artist);
    }

    public void addVenie(Venue venue){
        if (venue == null){
            throw new IllegalArgumentException("venue cannot be null");
        }
        venues.add(venue);
    }

    public void scheduleConcert(){
        Artist artist1 = new Artist("Jame", "HipHop");
        artists.add(artist1);
        Venue venue1 = new Venue("ZiggoDome", "Amsterdam", 5000);
        venues.add(venue1);

        Concert concert1 = new Concert(artist1, venue1, LocalDate.of(2026,04,1), 50,true);
        concerts.add(concert1);

        TourManager tourManagerList = new TourManager("Tourman", 20);

    }




}




















