package com.hr_api.Hr_Management_System.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssignDto {
    private String id;
    private String currentUser;
    private Date assignDate;
    private String issuedBy;
    private boolean status;
    private String createdAt;
    private String updatedAt;
}
