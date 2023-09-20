package com.hr_api.Hr_Management_System.service.impl;

import com.hr_api.Hr_Management_System.dto.UserDTO;
import com.hr_api.Hr_Management_System.entity.User;
import com.hr_api.Hr_Management_System.repository.user.UserRepo;
import com.hr_api.Hr_Management_System.exception.InUseException;
import com.hr_api.Hr_Management_System.util.IdGenerator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserServiceImpl {
//    @Autowired
//    private UserRepo userRepo;
//
//    @Autowired
//    private ModelMapper mapper;
//
//    @Autowired
//    private IdGenerator idGenerator;
//
//    @Override
//    @Transactional
//    public String create(UserDTO userDTO)  {
//        String id = idGenerator.generateRandomID(10);
//        while (userRepo.findById(id).isPresent()) {
//            id = idGenerator.generateRandomID(10);
//        }
//        User user = mapper.map(userDTO, User.class);
//        user.setId(id);
//        return userRepo.save(user).getId();
//    }
//
//    @Override
//    public UserDTO get(String id) throws ClassNotFoundException {
//        Optional<User> byId = userRepo.findById(id);
//        if (byId.isEmpty()) {
//            throw new ClassNotFoundException(id + " not found");
//        }
//        return mapper.map(byId.get(), UserDTO.class);
//    }
//
//    @Override
//    @Transactional
//    public void update(UserDTO userDTO, String id) throws ClassNotFoundException {
//        Optional<User> byId = userRepo.findById(id);
//        if (byId.isEmpty()) {
//            throw new ClassNotFoundException(id + " not found");
//        }
//        User user = byId.get();
//        user.setUserType(userDTO.getUserType());
//        // ==============================
//        userRepo.save(user);
//    }
//
//    @Override
//    public void delete(String id) throws InUseException, ClassNotFoundException {
//        Optional<User> byId = userRepo.findById(id);
//        if (byId.isEmpty()) {
//            throw new ClassNotFoundException(id + " not found");
//        }
//        try {
//            userRepo.delete(byId.get());
//        } catch (Exception e) {
//            throw new InUseException();
//        }
//    }
//    @Override
//    public Page<UserDTO> findAll(int page, int noOfUsers){
//        Page<User> UserPage = userRepo.findAll(PageRequest.of(page, noOfUsers));
//        return UserPage.map(user -> mapper.map(user, UserDTO.class));
//    }
}
