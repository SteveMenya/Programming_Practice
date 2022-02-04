package com.example.user;

import com.example.location.Location;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    User user1 = new User(
            "u1",
            "Jany",
            "Lawrence",
            new Location("l1", "Lagos"),
            "Jany@gmail.com");

    User user2 = new User(
            "u2",
            "Jadon",
            "Mills",
            new Location("l2", "Asaba"),
            "Jadon@gmail.com");


    //private List<User> users = Arrays.asList(user1, user2);
    private List<User> users = new ArrayList<>(Arrays.asList(user1, user2));

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }


}
