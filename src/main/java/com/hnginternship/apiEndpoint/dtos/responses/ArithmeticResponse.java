package com.hnginternship.apiEndpoint.dtos.responses;

import com.hnginternship.apiEndpoint.datas.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticResponse {
    private String slackUsername;
    private OperationType operationType;
    private int result;

}
