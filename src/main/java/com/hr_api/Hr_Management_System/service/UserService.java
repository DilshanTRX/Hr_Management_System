package com.hr_api.Hr_Management_System.service;

import com.hr_api.Hr_Management_System.dto.UserDTO;
import com.hr_api.Hr_Management_System.exception.InUseException;
import org.springframework.data.domain.Page;

public interface UserService {
    String create(UserDTO userDTO);

    UserDTO get(String id) throws ClassNotFoundException;

    void update(UserDTO userDTO, String id) throws ClassNotFoundException;

    void delete(String id) throws InUseException, ClassNotFoundException;
    Page<UserDTO> findAll(int page, int noOfUsers);
}
