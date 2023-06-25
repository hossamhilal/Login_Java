package com.example.loginProject.payload;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class ApiResponse {

    private Boolean success;
    private String message;

}
