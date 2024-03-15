package com.example.serviceuser.responsitory;

import com.example.serviceuser.modules.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserResponsitory extends JpaRepository<User,Long> {
}
