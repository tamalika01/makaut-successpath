package com.mcet.makautsuccesspath.user;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;
import org.springframework.security.core.GrantedAuthority;

@Entity
public class AuthGrantedAuthority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String authority;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public AuthGrantedAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
