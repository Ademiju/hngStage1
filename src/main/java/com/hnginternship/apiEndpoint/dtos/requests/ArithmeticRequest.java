package com.hnginternship.apiEndpoint.dtos.requests;

import com.hnginternship.apiEndpoint.datas.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArithmeticRequest {
    private String operation_type;
    private int x;
    private int y;

}
