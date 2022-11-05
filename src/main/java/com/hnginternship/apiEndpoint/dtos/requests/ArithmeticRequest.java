package com.hnginternship.apiEndpoint.dtos.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hnginternship.apiEndpoint.datas.OperationType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArithmeticRequest {

        private String operation_type;
        private int x;
        private int y;

    }
