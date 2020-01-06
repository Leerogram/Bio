package com.silee.Bio.user.repository;

import com.silee.Bio.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {

}
