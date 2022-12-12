package Quiz3ExtraWork.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class AirportQueue {
    // Instance Variables
    Queue<String> incomingFlights;
    Queue<String> outgoingFlights;

    // Constructors
    public AirportQueue() {
        incomingFlights = new LinkedList<>();
        outgoingFlights = new LinkedList<>();
    }

    // Methods
    public void addFlight(String flightDestination, String flightType) {
        if (flightType.equals("Incoming")) {
            incomingFlights.offer(flightDestination);
        } else if (flightType.equals("Outgoing")) {
            outgoingFlights.offer(flightDestination);
        } else {
            throw new IllegalArgumentException("Method Add Flight");
        }
    }


    // Accounts for a flight either arriving or departing from the
    //    appropriate queue.
    //    Flight Type can be "Incoming" or "Outgoing".
    //    If appropriate throw an Illegal Argument Exception with the
    //    message "Method Update Flight"
    public String updateFlight(String flightType) {
        if (flightType.equals("Incoming")) {
            return incomingFlights.poll();
        } else if (flightType.equals("Outgoing")) {
            return outgoingFlights.poll();
        } else {
            throw new IllegalArgumentException("Method Update Flight");
        }
    }
}
