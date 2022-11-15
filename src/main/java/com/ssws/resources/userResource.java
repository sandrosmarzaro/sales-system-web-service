package com.ssws.resources;

import com.ssws.entities.User;
import com.ssws.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userResource {

    private final UserService userService;

    public userResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {        return userService.findById(id)
                .map(ResponseEntity.status(HttpStatus.ACCEPTED)::body)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
