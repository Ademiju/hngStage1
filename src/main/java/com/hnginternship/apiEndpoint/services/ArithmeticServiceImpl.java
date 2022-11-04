package com.hnginternship.apiEndpoint.services;

import com.hnginternship.apiEndpoint.dtos.requests.ArithmeticRequest;
import com.hnginternship.apiEndpoint.dtos.responses.ArithmeticResponse;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticServiceImpl implements ArithmeticService{

    @Override
    public ArithmeticResponse performMathOperation(ArithmeticRequest arithmeticRequest) {
        return null;
    }

    @Override
    public ArithmeticResponse performMathOperation(String operationInWords) {
        return null;
    }
}
