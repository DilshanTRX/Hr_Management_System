package com.hr_api.Hr_Management_System.services.user;

import com.hr_api.Hr_Management_System.dto.UserDto;
import com.hr_api.Hr_Management_System.models.user.User;
import com.hr_api.Hr_Management_System.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public User insertUser(UserDto request){
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        User user =new User();
        UUID uuid= UUID.randomUUID();
        String str= uuid.toString();
        user.setId(str);
        user.setUserId(request.getUserId());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(encodedPassword);
        User user_repo=userRepository.save(user);
        return user_repo;
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getByID(String id){
        return userRepository.findById(id).get();
    }
    public User updateById(String id,UserDto userDto){
        User user= userRepository.findById(id).get();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        return userRepository.save(user);
    }
    public void  deleteUserById(String id){
        userRepository.deleteById(id);
    }

    public User loginUser(String email,String password) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);

        if (user == null || !passwordEncoder.matches(password,user.getPassword())){
            throw new UsernameNotFoundException("Invalid username or Password");
        }
       return user;
    }
}
