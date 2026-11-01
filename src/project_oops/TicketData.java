package project_oops;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TicketData {
    public static class Ticket implements Serializable {
        private static final long serialVersionUID = 1L;
        private String ticketId;
        private String passengerName;
        private String source;
        private String destination;
        private String flightNo;

        public Ticket(String ticketId, String passengerName, String source, String destination, String flightNo) {
            this.ticketId = ticketId;
            this.passengerName = passengerName;
            this.source = source;
            this.destination = destination;
            this.flightNo = flightNo;
        }

        public String getTicketId() { return ticketId; }
        public String getPassengerName() { return passengerName; }
        public String getSource() { return source; }
        public String getDestination() { return destination; }
        public String getFlightNo() { return flightNo; }
    }

    private static final String FILE_NAME = "tickets.dat";

    public static void saveTicket(Ticket ticket) {
        List<Ticket> tickets = loadTickets();
        tickets.add(ticket);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tickets);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Ticket> loadTickets() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Ticket>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
