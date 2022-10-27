package com.hnginternship.apiEndpoint.datas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String slackUsername;
    private Boolean backend;
    private int age;
    private String bio;

}
