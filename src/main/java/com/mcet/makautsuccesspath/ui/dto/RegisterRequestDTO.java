package com.mcet.makautsuccesspath.ui.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegisterRequestDTO {

    @NotEmpty
    public String firstName;

    @NotEmpty
    public String lastName;

    @Email
    public String email;

    @NotEmpty
    @Pattern(
            regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$",
            message = "Password must be at least 6 characters long and contain at least one letter, one digit, and one special character"
    )
    public String password;

    @NotEmpty
    public String password2;
}
