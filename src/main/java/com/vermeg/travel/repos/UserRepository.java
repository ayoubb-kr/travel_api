package com.vermeg.travel.repos;

import com.vermeg.travel.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.user_id = ?1")
    Optional<User> findUserByUserId(Long user_id);

}
