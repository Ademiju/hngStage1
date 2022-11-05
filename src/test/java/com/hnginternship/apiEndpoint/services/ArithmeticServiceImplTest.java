package com.hnginternship.apiEndpoint.services;

import com.hnginternship.apiEndpoint.datas.OperationType;
import com.hnginternship.apiEndpoint.dtos.requests.ArithmeticRequest;
import com.hnginternship.apiEndpoint.dtos.responses.ArithmeticResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ArithmeticServiceImplTest {
    @Autowired
    ArithmeticService arithmeticService;

    @Test
    void arithmeticMathOperationCanPerformAdditionTest() {
        ArithmeticRequest arithmeticRequest = new ArithmeticRequest("addition",3,2);
        ArithmeticResponse arithmeticResponse = arithmeticService.performMathOperation(arithmeticRequest);
        assertEquals(arithmeticResponse.getResult(),5);
    }
    @Test
    void arithmeticMathOperationCanPerformSubtractionTest() {
        ArithmeticRequest arithmeticRequest = new ArithmeticRequest("subtraction",3,2);
        ArithmeticResponse arithmeticResponse = arithmeticService.performMathOperation(arithmeticRequest);
        assertEquals(arithmeticResponse.getResult(),1);
    }
    @Test
    void arithmeticMathOperationCanPerformMultiplicationTest() {
        ArithmeticRequest arithmeticRequest = new ArithmeticRequest("multiplication",3,2);
        ArithmeticResponse arithmeticResponse = arithmeticService.performMathOperation(arithmeticRequest);
        assertEquals(arithmeticResponse.getResult(),6);
    }
    @Test
    void arithmeticMathOperationReturnCorrectOperatorTypeTest() {
        ArithmeticRequest arithmeticRequest1 = new ArithmeticRequest("addition",3,2);
        ArithmeticResponse arithmeticResponse1 = arithmeticService.performMathOperation(arithmeticRequest1);
        ArithmeticRequest arithmeticRequest2 = new ArithmeticRequest("subtraction",3,2);
        ArithmeticResponse arithmeticResponse2 = arithmeticService.performMathOperation(arithmeticRequest2);
        ArithmeticRequest arithmeticRequest3 = new ArithmeticRequest("multiplication",3,2);
        ArithmeticResponse arithmeticResponse3 = arithmeticService.performMathOperation(arithmeticRequest3);
        assertEquals(arithmeticResponse1.getResult(),5);
        assertEquals(arithmeticResponse1.getOperationType(), OperationType.ADDITION);
        assertEquals(arithmeticResponse2.getResult(),1);
        assertEquals(arithmeticResponse2.getOperationType(), OperationType.SUBTRACTION);
        assertEquals(arithmeticResponse3.getResult(),6);
        assertEquals(arithmeticResponse3.getOperationType(), OperationType.MULTIPLICATION);
    }
    @Test
    void arithmeticMathOperationReturnSlackUsernameTest() {
        ArithmeticRequest arithmeticRequest1 = new ArithmeticRequest("addition",3,2);
        ArithmeticResponse arithmeticResponse1 = arithmeticService.performMathOperation(arithmeticRequest1);
        ArithmeticRequest arithmeticRequest2 = new ArithmeticRequest("subtraction",3,2);
        ArithmeticResponse arithmeticResponse2 = arithmeticService.performMathOperation(arithmeticRequest2);
        ArithmeticRequest arithmeticRequest3 = new ArithmeticRequest("multiplication",3,2);
        ArithmeticResponse arithmeticResponse3 = arithmeticService.performMathOperation(arithmeticRequest3);
        assertEquals(arithmeticResponse1.getSlackUsername(),"Ademiju");
        assertEquals(arithmeticResponse2.getSlackUsername(),"Ademiju");
        assertEquals(arithmeticResponse3.getSlackUsername(),"Ademiju");
    }

    @Test
    void performMathOperationWithIncorrectOperator_ThrowsException(){
        ArithmeticRequest arithmeticRequest = new ArithmeticRequest("division",3,2);
        ;
        assertThatThrownBy(()-> arithmeticService.performMathOperation(arithmeticRequest)).isInstanceOf(ArithmeticException.class).hasMessage("OperatorType not Valid");
    }
}