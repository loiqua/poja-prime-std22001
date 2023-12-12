package com.poja.base.endpoint.rest.controller.health;

import com.poja.base.PojaGenerated;
import com.poja.base.repository.DummyRepository;
import com.poja.base.repository.DummyUuidRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;

@PojaGenerated
@RestController
@AllArgsConstructor
public class PingController {

  DummyRepository dummyRepository;
  DummyUuidRepository dummyUuidRepository;

  public static final ResponseEntity<String> OK = new ResponseEntity<>("OK", HttpStatus.OK);
  public static final ResponseEntity<String> KO =
      new ResponseEntity<>("KO", HttpStatus.INTERNAL_SERVER_ERROR);

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }
  @GetMapping("/new-prime")

  public String getNewPrime() {
    BigInteger Prime = BigInteger.probablePrime(10_000, new Random());
    return Prime.toString();
  }
}

