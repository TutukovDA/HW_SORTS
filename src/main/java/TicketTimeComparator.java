import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int result = (t1.getTimeTo() - t1.getTimeFrom()) - (t2.getTimeTo() - t2.getTimeFrom());
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else return 0;
    }
}