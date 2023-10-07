package com.hr_api.Hr_Management_System.models.devices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "devices")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Devices {
    @Id
    @Column(name = "id", unique = true)
    private String  Id;

    @Column(name = "device_name", unique = true)
    private String deviceName;

    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "model")
    private String model;

    @Column(name = "invoice_image_name")
    private String invoiceImageName;

    @Column(name = "invoice_image_path")
    private boolean invoice_image_Path;

    @Column(name = "device_image_name")
    private String deviceImageName;

    @Column(name = "device_image_Path")
    private boolean device_image_Path;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    @Column(name = "assign_id")
    private String assignId;

}
