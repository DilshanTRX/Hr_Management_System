package com.hr_api.Hr_Management_System.controller;

import com.hr_api.Hr_Management_System.dto.UserDto;
import com.hr_api.Hr_Management_System.models.user.User;
import com.hr_api.Hr_Management_System.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/hr/")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("")
    public @ResponseBody UserDto insertUser(@RequestBody UserDto userInput) {
        User user = userService.insertUser(userInput);
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserId(user.getUserId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
//        userDto.setPassword(user.getPassword());
        return userDto;
    }
    @GetMapping("")
    public @ResponseBody List<UserDto> getAllUsers() {
        List<User> userList = userService.getAllUsers();
        List<UserDto> userDtoList=new ArrayList<>();
        for (User user : userList) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setUserId(user.getUserId());
            userDto.setFirstName(user.getFirstName());
            userDto.setLastName(user.getLastName());
            userDtoList.add(userDto);
        }
        return userDtoList;
    }
    @GetMapping("/getById/{id}")
    public @ResponseBody UserDto getUser(@PathVariable("id") String id){
        User user = userService.getByID(id);
        UserDto userDto= new UserDto();
        userDto.setId(user.getId());
        userDto.setUserId(user.getUserId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }
    @PutMapping("update/{id}")
    public @ResponseBody UserDto updateUserById(@PathVariable("id") String id,@RequestBody UserDto userDto){
        User user =userService.updateById(id,userDto);
        userDto.setId(user.getId());
        userDto.setUserId(user.getUserId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable ("id") String id ){
        userService.deleteUserById(id);
    }
}
