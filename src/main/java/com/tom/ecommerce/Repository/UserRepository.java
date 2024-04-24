package com.tom.ecommerce.Repository;

import com.tom.ecommerce.models.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<user,Long> {
    List<user>findByUsername(String username);
}
