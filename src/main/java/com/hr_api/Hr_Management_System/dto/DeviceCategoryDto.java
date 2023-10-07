package com.hr_api.Hr_Management_System.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeviceCategoryDto {
    private String  categoryId;
    private String categoryName;
    private String deviceCategory;
    private Date createdAt;
    private Date updatedAt;
    private String bankBookImageName;
    private boolean status;
    private String userId;
}
