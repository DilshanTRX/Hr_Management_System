package com.hr_api.Hr_Management_System.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactDto {
    private String id;
    private String mobileNumber;
    private String homeNumber;
    private String personalAddress;
    private String contactOwner;
    private String relation;
    private String contactNumber;
    private boolean status;
}
