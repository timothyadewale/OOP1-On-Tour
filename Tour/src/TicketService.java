import java.util.ArrayList;

public class TicketService {
    private TourManager tourManager;

    //Constructor

    public TicketService(TourManager tourManager) {
        if (tourManager == null){
            throw new IllegalArgumentException("Tour manager must not be null");
        }
        this.tourManager = tourManager;
    }

    //Getter

    public TourManager getTourManager() {
        return tourManager;
    }

    //Method
    public void sellTicket(){

    }

    //

    public int getTotalRevenue(){
        int total = 0;
        int totalConcertByArtist = getConcertsByArtist().size();


    }

    public ArrayList<Concert> getConcertsByArtist(String artist) {
        ArrayList<Concert> result = new ArrayList<>();
        for (Concert concert : concerts) {
            if (concert.getArtist().getName().equalsIgnoreCase(artist)) {
                result.add(concert);
            }
        }
        return result;
    }
}


