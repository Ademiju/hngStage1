package com.hnginternship.apiEndpoint.services;

import com.hnginternship.apiEndpoint.dtos.requests.ArithmeticRequest;
import com.hnginternship.apiEndpoint.dtos.responses.ArithmeticResponse;

public interface ArithmeticService {
    ArithmeticResponse performMathOperation(ArithmeticRequest arithmeticRequest);
    ArithmeticResponse performMathOperation(String operationInWords);
}
