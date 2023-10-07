package com.hr_api.Hr_Management_System.models.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "bank")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankDetails {
    @Id
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "bank_name", unique = true)
    private String bankName;
    @Column(name = "account_name")
    private String accountName;

    @Column(name = "branch")
    private String branch;

    @Column(name = "branch_code")
    private String branchCode;

    @Column(name = "bank_book_image_name")
    private String bankBookImageName;

    @Column(name = "bank_book_image_path")
    private String bankBookImagePath;

    @Column(name = "status")
    private boolean status;
}
