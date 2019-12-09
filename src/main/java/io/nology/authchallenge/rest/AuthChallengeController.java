package io.nology.authchallenge.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AuthChallengeController {

    @GetMapping("/public")
    public ResponseEntity<String> publicAccess() {
        return ResponseEntity.status(HttpStatus.OK).body("Congratulations. You, along with all your species, can see this.");
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateAccess() {
        return ResponseEntity.status(HttpStatus.OK).body("Ah, you are one of the special ones. But still not that special.");
    }

    @GetMapping("/members")
    public ResponseEntity<String> membersAccess() {
        return ResponseEntity.status(HttpStatus.OK).body("Now you're one of us...");
    }

    @GetMapping("/cult")
    public ResponseEntity<String> cultAccess() {
        return ResponseEntity.status(HttpStatus.OK).body("Welcome master.");
    }

}
