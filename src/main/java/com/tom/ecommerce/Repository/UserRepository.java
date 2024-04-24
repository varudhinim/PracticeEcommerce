package com.tom.ecommerce.Repository;

import com.tom.ecommerce.models.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<user,Long> {

    @Override
    Optional<user> findById(Long id);

    Optional<user> findByEmail(String email);

    Optional<user> findByUsername(String username);

    List<user> findByUsernameContaining(String username);

    user save(user user);

}
