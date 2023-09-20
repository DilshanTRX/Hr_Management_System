package com.hr_api.Hr_Management_System.entity;

import com.hr_api.Hr_Management_System.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id", unique = true)
    private String Id;

    @Column(name = "user_id", unique = true)
    private String userId;

    @Column(name = "password")
    private String Password;

    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "office_email", unique = true)
    private String office_Email;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB",nullable = false)
    private byte[] profilePic;

    @Column(name = "profile_pic_path",unique = true)
    private String profilePicPath;

    @Column(name = "designation")
    private String Designation;

    @Column(name = "epf_number", unique = true)
    private int epfNumber;

    @Column(name = "etf_number", unique = true)
    private int etfNumber;

    @Column(name = "first_name")
    private int firstName;

    @Column(name = "last_name")
    private int lastName;

    @Column(name = "full_name")
    private int fullName;

    @Column(name = "name_with_initials")
    private int nameWithInitials;

    @Column(name = "nic", unique = true)
    private char nic;

    @Column(name = "personal_email", unique = true)
    private char personalEmail;

    @Column(name = "birthday")
    private Date Birthday;

    @Column(name = "linked_profile", unique = true)
    private String linkedProfile;

    @Column(name = "status")
    private boolean Status;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @OneToOne
    @JoinColumn(name = "added_by")
    private User addedBy;

    @OneToOne(mappedBy = "addedBy")
    private User userUserId;

}
