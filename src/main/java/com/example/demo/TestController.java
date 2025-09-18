package com.example.demo30;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("테스트16");
    }

    @GetMapping("/health")
    public ResponseEntity health() {
        return ResponseEntity.ok("ok");
    }
}
