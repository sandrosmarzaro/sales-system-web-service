package com.ssws.resources;

import com.ssws.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class userResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(
            1L,
            "Test",
            "test@test.com",
            "123456789",
            "123456"
        );
        return ResponseEntity.ok().body(user);
    }
}
