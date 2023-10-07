package com.hr_api.Hr_Management_System.services.contact;

import com.hr_api.Hr_Management_System.dto.ContactDto;
import com.hr_api.Hr_Management_System.models.contact.ContactDetails;
import com.hr_api.Hr_Management_System.repository.contact.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContactService {
//    @Autowired
//    ContactRepository contactRepository;
//    public ContactDetails insertContact(ContactDto request){
//        ContactDetails contact =new ContactDetails();
//        UUID uuid= UUID.randomUUID();
//        String str= uuid.toString();
////        user.setId(str);
////        user.setUserId(request.getUserId());
////        user.setFirstName(request.getFirstName());
////        user.setLastName(request.getLastName());
////        user.setPassword(encodedPassword);
//        ContactDetails contact_repo=contactRepository.save(contact);
//        return contact_repo;
//    }
//    public List<ContactDetails> getAllContact(){
//        return contactRepository.findAll();
//    }
//    public ContactDetails getByID(String id){
//        return contactRepository.findById(id).get();
//    }
//    public ContactDetails updateById(String id, ContactDto contactDto){
//        ContactDetails contact= contactRepository.findById(id).get();
////        user.setFirstName(userDto.getFirstName());
////        user.setLastName(userDto.getLastName());
//        return contactRepository.save(contact);
//    }
//    public void  deleteContactById(String id){
//        contactRepository.deleteById(id);
//    }
}
