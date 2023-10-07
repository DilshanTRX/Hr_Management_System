package com.hr_api.Hr_Management_System.repository.deviceCategory;

import com.hr_api.Hr_Management_System.models.deviceCategory.DeviceCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceCategoryRepository extends JpaRepository<DeviceCategory,String> {
}
