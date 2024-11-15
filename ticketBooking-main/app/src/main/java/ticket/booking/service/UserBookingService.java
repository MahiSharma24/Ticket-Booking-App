package ticket.booking.service;

import ticket.booking.entities.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserBookingService {
    private List<User> users = new ArrayList<>();

    public UserBookingService() throws IOException {
        // Initialize any resources if needed, for example loading users from file
    }

    public void signUp(User user) {
        users.add(user);
        System.out.println("User signed up successfully: " + user.getUsername());
    }
}
