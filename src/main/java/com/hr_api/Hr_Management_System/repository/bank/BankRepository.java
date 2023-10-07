package com.hr_api.Hr_Management_System.repository.bank;

import com.hr_api.Hr_Management_System.models.bank.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankDetails,String> {
}
