package com.hr_api.Hr_Management_System.repository.user;

import com.hr_api.Hr_Management_System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
