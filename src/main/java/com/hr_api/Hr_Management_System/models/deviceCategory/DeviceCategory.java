package com.hr_api.Hr_Management_System.models.deviceCategory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "device_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeviceCategory {
    @Id
    @Column(name = "category_id", unique = true)
    private String  categoryId;

    @Column(name = "category_name", unique = true)
    private String categoryName;

    @Column(name = "device_category")
    private String deviceCategory;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "bank_book_image_name")
    private String bankBookImageName;

    @Column(name = "status")
    private boolean status;

    @Column(name = "user_id")
    private String userId;
}
