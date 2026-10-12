package com.example.taskmanagement.repositories;

import com.example.taskmanagement.models.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1, "admin", "admin@test.com", "ADMIN"));
        users.add(new User(2, "manager", "manager@test.com", "MANAGER"));
        users.add(new User(3, "staff", "staff@test.com", "STAFF"));
    }

    public List<User> findAll() { return users; }
}