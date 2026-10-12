package com.example.taskmanagement.controllers;

import com.example.taskmanagement.models.User;
import com.example.taskmanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String search) {
        // Lấy toàn bộ danh sách từ service
        List<User> users = userService.findAllUsers();

        // Nếu có truyền tham số search thì thực hiện lọc gần đúng theo username
        if (search != null && !search.trim().isEmpty()) {
            users = users.stream()
                    .filter(user -> user.getUsername().toLowerCase().contains(search.toLowerCase()))
                    .collect(Collectors.toList());
        }

        // Trả về kết quả với HTTP status 200 OK
        return ResponseEntity.ok(users);
    }
}