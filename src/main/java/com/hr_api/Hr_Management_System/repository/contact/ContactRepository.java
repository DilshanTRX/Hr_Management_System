package com.hr_api.Hr_Management_System.repository.contact;

import com.hr_api.Hr_Management_System.models.contact.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactDetails,String> {
}
