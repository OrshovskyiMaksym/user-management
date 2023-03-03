package com.serg.usermanagement.repository;

import com.serg.usermanagement.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByFullName(String fullName);

    Optional<UserEntity> findByEmail(String email);

}
