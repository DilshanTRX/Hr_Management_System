package com.hr_api.Hr_Management_System.models.user;


import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class User {
    @Id
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "user_id", unique = true)
    private String userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    private String email;

//    @OneToOne
//    @JoinColumn(name ="user_user_id")
//    private Employee userUserId;

//    private Collection<UserType> roles;
//    @Enumerated(EnumType.STRING)
//    private String role;


//    @Column(name = "user_type")
//    @Enumerated(EnumType.STRING)
//    private UserType userType;

//    @Column(name = "employee_name")
//    private String employeeName;
//
//    @Column(name = "office_email", unique = true)
//    private String office_Email;
//
//    @Lob
//    @Column(columnDefinition = "MEDIUMBLOB",nullable = false)
//    private byte[] profilePic;
//
//    @Column(name = "profile_pic_path",unique = true)
//    private String profilePicPath;
//
//    @Column(name = "designation")
//    private String designation;

//    @Column(name = "epf_number", unique = true)
//    private int epfNumber;
//
//    @Column(name = "etf_number", unique = true)
//    private int etfNumber;

//    @Column(name = "full_name")
//    private int fullName;

//    @Column(name = "name_with_initials")
//    private int nameWithInitials;
//
//    @Column(name = "nic", unique = true)
//    private char nic;
//
//    @Column(name = "personal_email", unique = true)
//    private char personalEmail;
//
//    @Column(name = "birthday")
//    private Date birthday;
//
//    @Column(name = "linked_profile", unique = true)
//    private String linkedProfile;
//
//    @Column(name = "status")
//    private boolean status;
//
//    @Column(name = "create_date")
//    private Date createDate;
//
//    @Column(name = "update_date")
//    private Date updateDate;

//    @OneToOne
//    @JoinColumn(name = "added_by")
//    private User addedBy;

//    @OneToOne(mappedBy = "addedBy")
//    private User userUserId;

}
