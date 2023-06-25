package com.example.loginProject.payload;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
public class LoginRequest {
    @NotBlank
    private String usernameOrEmail;

    @NotBlank
    private String password;
}
