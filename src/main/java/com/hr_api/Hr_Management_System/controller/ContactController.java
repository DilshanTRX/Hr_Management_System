package com.hr_api.Hr_Management_System.controller;

import com.hr_api.Hr_Management_System.dto.ContactDto;
import com.hr_api.Hr_Management_System.models.contact.ContactDetails;
import com.hr_api.Hr_Management_System.services.contact.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/hr/")
public class ContactController {
//    @Autowired
//    ContactService contactService;
//    @PostMapping("")
//    public @ResponseBody ContactDto insertUser(@RequestBody ContactDto contactInput) {
//        ContactDetails contact = contactService.insertContact(contactInput);
//        ContactDto contactDto = new ContactDto();
////        userDto.setId(user.getId());
////        userDto.setUserId(user.getUserId());
////        userDto.setFirstName(user.getFirstName());
////        userDto.setLastName(user.getLastName());
////        userDto.setPassword(user.getPassword());
//        return contactDto;
//    }
//
//    @GetMapping("")
//    public @ResponseBody List<ContactDto> getAllContact() {
//        List<ContactDetails> contactList = contactService.getAllContact();
//        List<ContactDto> contactDtoList=new ArrayList<>();
//        for (ContactDetails contact : contactList) {
//            ContactDto contactDto = new ContactDto();
////            userDto.setId(user.getId());
////            userDto.setUserId(user.getUserId());
////            userDto.setFirstName(user.getFirstName());
////            userDto.setLastName(user.getLastName());
//            contactDtoList.add(contactDto);
//        }
//        return contactDtoList;
//    }
//    @GetMapping("/getById/{id}")
//    public @ResponseBody ContactDto getContact(@PathVariable("id") String id){
//        ContactDetails contact = contactService.getByID(id);
//        ContactDto contactDto= new ContactDto();
////        userDto.setId(user.getId());
////        userDto.setUserId(user.getUserId());
////        userDto.setFirstName(user.getFirstName());
////        userDto.setLastName(user.getLastName());
//        return contactDto;
//    }
//    @PutMapping("update/{id}")
//    public @ResponseBody ContactDto updateContactById(@PathVariable("id") String id,@RequestBody ContactDto contactDto){
//        ContactDetails contact =contactService.updateById(id,contactDto);
////        userDto.setId(user.getId());
////        userDto.setUserId(user.getUserId());
////        userDto.setFirstName(user.getFirstName());
////        userDto.setLastName(user.getLastName());
//        return contactDto;
//    }
//    @DeleteMapping("/delete/{id}")
//    public void deleteById(@PathVariable ("id") String id ){
//        contactService.deleteContactById(id);
//    }
}
