package ticket.booking.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String hashedPassword;
    private List<String> bookings;
    private String userId;

    // Constructor to initialize the user with essential details
    public User(String username, String password, String hashedPassword, List<String> bookings, String userId) {
        this.username = username;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.bookings = bookings != null ? bookings : new ArrayList<>();
        this.userId = userId;
    }

    // Getter and setter methods for each field

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public List<String> getBookings() {
        return bookings;
    }

    public void setBookings(List<String> bookings) {
        this.bookings = bookings;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    // Adds a booking ID to the user's bookings list
    public void addBooking(String bookingId) {
        if (this.bookings == null) {
            this.bookings = new ArrayList<>();
        }
        this.bookings.add(bookingId);
    }

    // Removes a booking ID from the user's bookings list
    public void removeBooking(String bookingId) {
        if (this.bookings != null) {
            this.bookings.remove(bookingId);
        }
    }

    // Returns a string representation of the User object
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", bookings=" + bookings +
                '}';
    }
}
