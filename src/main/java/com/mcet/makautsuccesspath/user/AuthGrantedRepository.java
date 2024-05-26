package com.mcet.makautsuccesspath.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthGrantedRepository extends JpaRepository<AuthGrantedAuthority, Long> {
}
