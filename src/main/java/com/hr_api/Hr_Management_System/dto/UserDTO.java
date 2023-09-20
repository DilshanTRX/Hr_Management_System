package com.hr_api.Hr_Management_System.dto;

import com.hr_api.Hr_Management_System.entity.User;
import com.hr_api.Hr_Management_System.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private String Id;
    private String userId;
    private String Password;
    private UserType userType;
    private String employeeName;
    private String office_Email;
    private byte[] profilePic;
    private String profilePicPath;
    private String Designation;
    private int epfNumber;
    private int etfNumber;
    private int firstName;
    private int lastName;
    private int fullName;
    private int nameWithInitials;
    private char nic;
    private char personalEmail;
    private Date Birthday;
    private String linkedProfile;
    private boolean Status;
    private Date createDate;
    private Date updateDate;
    private User addedBy;
    private User userUserId;
}
