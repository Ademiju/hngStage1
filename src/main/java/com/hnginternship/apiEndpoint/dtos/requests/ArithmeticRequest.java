package com.hnginternship.apiEndpoint.dtos.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hnginternship.apiEndpoint.datas.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArithmeticRequest {
    @JsonDeserialize
    private OperationType operation_type;
    private int x;
    private int y;


    public ArithmeticRequest(OperationType operation_type) {
        this.operation_type = operation_type;
    }
}
