import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulTest {

    @Test
    public void compareTicketByPriceFirstTicketLowSecondTicketTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 8);
        Ticket ticket2 = new Ticket("ABA", "BKA", 24000, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 12, 16);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 10);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("MRV", "AER", 6500, 7, 10);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        int expected = ticket1.compareTo(ticket2);
        int actual = -1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareTicketByPriceSecondTicketLowFirstTicketTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 8);
        Ticket ticket2 = new Ticket("ABA", "BKA", 24000, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 12, 16);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 10);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("MRV", "AER", 6500, 7, 10);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        int expected = ticket2.compareTo(ticket1);
        int actual = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareTicketByPriceSecondTicketSameFirstTicketTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 8);
        Ticket ticket2 = new Ticket("ABA", "BKA", 3500, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 12, 16);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 10);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("MRV", "AER", 6500, 7, 10);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        int expected = ticket2.compareTo(ticket1);
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchFromToUpperOneResultTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 8);
        Ticket ticket2 = new Ticket("ABA", "BKA", 24000, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 12, 16);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 10);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("MRV", "AER", 6500, 7, 10);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        Ticket[] expected = ticketsList.search("GSV", "VKO");
        Ticket[] actual = {ticket1, ticket3, ticket5};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchFromToUpperZeroResultTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 8);
        Ticket ticket2 = new Ticket("ABA", "BKA", 24000, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 12, 16);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 10);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("MRV", "AER", 6500, 7, 10);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        Ticket[] expected = ticketsList.search("UFA", "VKO");
        Ticket[] actual = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchFromToOneResultTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 8);
        Ticket ticket2 = new Ticket("ABA", "BKA", 24000, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 12, 16);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 10);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("MRV", "AER", 6500, 7, 10);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        Ticket[] expected = ticketsList.search("ABA", "BKA");
        Ticket[] actual = {ticket2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void compareToTimeUpperOneResultTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 8);
        Ticket ticket2 = new Ticket("ABA", "BKA", 24000, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 12, 16);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 10);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("GSV", "VKO", 8500, 7, 10);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = ticketsList.searchAndSortBy("GSV", "VKO",comparator);
        Ticket[] actual = {ticket5,ticket1,ticket7,ticket3};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void compareToTimeSameZeroResultTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 7);
        Ticket ticket2 = new Ticket("ABA", "BKA", 24000, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 13, 13);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 13);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("GSV", "VKO", 8500, 7, 11);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = ticketsList.searchAndSortBy("GSV", "VKO",comparator);
        Ticket[] actual = {ticket1,ticket3,ticket5,ticket7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void compareToTimeZeroResultTest() {
        AviaSouls ticketsList = new AviaSouls();
        Ticket ticket1 = new Ticket("GSV", "VKO", 3500, 7, 8);
        Ticket ticket2 = new Ticket("ABA", "BKA", 24000, 2, 12);
        Ticket ticket3 = new Ticket("GSV", "VKO", 7500, 12, 13);
        Ticket ticket4 = new Ticket("SGC", "SVO", 13500, 11, 19);
        Ticket ticket5 = new Ticket("GSV", "VKO", 10500, 10, 13);
        Ticket ticket6 = new Ticket("UFA", "GOJ", 4500, 5, 7);
        Ticket ticket7 = new Ticket("GSV", "VKO", 8500, 7, 11);

        ticketsList.add(ticket1);
        ticketsList.add(ticket2);
        ticketsList.add(ticket3);
        ticketsList.add(ticket4);
        ticketsList.add(ticket5);
        ticketsList.add(ticket6);
        ticketsList.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = ticketsList.searchAndSortBy("GSV", "GOJ",comparator);
        Ticket[] actual = {};

        Assertions.assertArrayEquals(expected, actual);
    }
}

