package com.mcet.makautsuccesspath.ui.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegisterRequestDTO {

    public String firstName;

    public String lastName;

    public String email;

    public String password;
}
