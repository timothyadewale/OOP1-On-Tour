import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TicketServiceTest {
    @Test
    void calculateTheTotalRevenueOfTicketServiceOfArtist{
        Artist adam = new Artist("Adam Levine", "RnB");
        Venue venue1 = new Venue("ZiggoDome", "Amsterdam", 5000);
        Concert concert2 = new Concert(adam, venue1, LocalDate.of(2026,04,1),
                50,true);

        assertEquals(1650);


    }

}


