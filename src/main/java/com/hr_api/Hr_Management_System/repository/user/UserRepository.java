package com.hr_api.Hr_Management_System.repository.user;

import com.hr_api.Hr_Management_System.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}
