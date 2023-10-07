package com.hr_api.Hr_Management_System.models.contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "contact")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetails {
    @Id
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "mobile_number", unique = true)
    private String mobileNumber;
    @Column(name = "home_number")
    private String homeNumber;

    @Column(name = "personal_address")
    private String personalAddress;

    @Column(name = "contact_owner")
    private String contactOwner;

    @Column(name = "relation")
    private String relation;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "status")
    private boolean status;
}
