package com.hr_api.Hr_Management_System.services.bank;

import com.hr_api.Hr_Management_System.dto.BankDto;
import com.hr_api.Hr_Management_System.models.bank.BankDetails;
import com.hr_api.Hr_Management_System.repository.bank.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BankService {
//    @Autowired
//    BankRepository bankRepository;
//    public BankDetails insertBank(BankDto request){
//        BankDetails bank =new BankDetails();
//        UUID uuid= UUID.randomUUID();
//        String str= uuid.toString();
////        user.setId(str);
////        user.setUserId(request.getUserId());
////        user.setFirstName(request.getFirstName());
////        user.setLastName(request.getLastName());
////        user.setPassword(encodedPassword);
//        BankDetails bank_repo=bankRepository.save(bank);
//        return bank_repo;
//    }
//    public List<BankDetails> getAllBank(){
//        return bankRepository.findAll();
//    }
//    public BankDetails getByID(String id){
//        return bankRepository.findById(id).get();
//    }
//    public BankDetails updateById(String id, BankDto bankDto){
//        BankDetails bank= bankRepository.findById(id).get();
////        user.setFirstName(userDto.getFirstName());
////        user.setLastName(userDto.getLastName());
//        return bankRepository.save(bank);
//    }
//    public void  deleteBankById(String id){
//        bankRepository.deleteById(id);
//    }
}
