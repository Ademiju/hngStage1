package com.hnginternship.apiEndpoint.datas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Arithmetic {
    private OperationType operation_type;
    private int x;
    private int y;
}
