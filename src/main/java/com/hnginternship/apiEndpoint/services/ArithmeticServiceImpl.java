package com.hnginternship.apiEndpoint.services;

import com.hnginternship.apiEndpoint.datas.OperationType;
import com.hnginternship.apiEndpoint.dtos.requests.ArithmeticRequest;
import com.hnginternship.apiEndpoint.dtos.responses.ArithmeticResponse;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ArithmeticServiceImpl implements ArithmeticService{

    @Override
    public ArithmeticResponse performMathOperation(ArithmeticRequest arithmeticRequest) {
        String operatorType = arithmeticRequest.getOperation_type().toString().toLowerCase(Locale.ROOT);
        int result = 0;
        switch (operatorType){
            case "addition":
               result = arithmeticRequest.getX() + arithmeticRequest.getY();
               break;
            case "subtraction":
                result = arithmeticRequest.getX() - arithmeticRequest.getY();
                break;
            case "multiplication":
                result = arithmeticRequest.getX() * arithmeticRequest.getY();
                break;
            default:
                throw new ArithmeticException("OperatorType not Valid");
        }
        ArithmeticResponse arithmeticResponse = new ArithmeticResponse();
        arithmeticResponse.setOperationType(OperationType.valueOf(operatorType));
        arithmeticResponse.setResult(result);
        arithmeticResponse.setSlackUsername("Ademiju");
        return arithmeticResponse;
    }

    @Override
    public ArithmeticResponse performMathOperation(String operationInWords) {
        return null;
    }
}
