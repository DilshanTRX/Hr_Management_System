package com.hr_api.Hr_Management_System.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankDto {
    private String id;
    private String bankName;
    private String accountName;
    private String branch;
    private String branchCode;
    private String bankBookImageName;
    private String bankBookImagePath;
    private boolean status;
}
