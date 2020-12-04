package com.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    @GetMapping(path="/login", produces = "application/json")
    public ResponseEntity authentication(@RequestParam("username") String username) {
        if (null != username)
            return ResponseEntity.ok(true);
        return ResponseEntity.badRequest().build();
    }
}
