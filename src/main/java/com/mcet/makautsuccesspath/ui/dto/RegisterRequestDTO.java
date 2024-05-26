package com.mcet.makautsuccesspath.ui.dto;

import com.mcet.makautsuccesspath.user.AuthGrantedAuthority;
import com.mcet.makautsuccesspath.user.User;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

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
