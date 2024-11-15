package ticket.booking.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private String source;
    private String destination;
    private Map<String, String> stationTimes = new HashMap<>();
    private List<String> stations = new ArrayList<>(); // List to hold station order
    private List<List<Integer>> seats;

    public Train(String trainId, String source, String destination) {
        this.trainId = trainId;
        this.source = source;
        this.destination = destination;
        initializeSeats(); // Method to initialize seat layout
    }

    // Method to initialize seats
    private void initializeSeats() {
        seats = new ArrayList<>();
        for (int i = 0; i < 5; i++) { // 5 rows
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 5; j++) { // 5 seats per row
                row.add(0); // 0 indicates an available seat
            }
            seats.add(row);
        }
    }

    public String getTrainId() {
        return trainId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Map<String, String> getStationTimes() {
        return stationTimes;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    // Add a station to the station order
    public void addStation(String station) {
        stations.add(station);
    }

    // Getter for the station order
    public List<String> getStations() {
        return stations;
    }
}
