package com.hnginternship.apiEndpoint.controller;

import com.hnginternship.apiEndpoint.dtos.requests.ArithmeticRequest;
import com.hnginternship.apiEndpoint.services.ArithmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class ArithmeticController {
    @Autowired
    private ArithmeticService arithmeticService;
    @PostMapping("/math")
    public ResponseEntity<?> performArithmetic(@RequestBody ArithmeticRequest arithmeticRequest){
        try {
            return new ResponseEntity<>(arithmeticService.performMathOperation(arithmeticRequest), HttpStatus.OK);
        } catch (ArithmeticException error) {
            return new ResponseEntity<>(error.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
