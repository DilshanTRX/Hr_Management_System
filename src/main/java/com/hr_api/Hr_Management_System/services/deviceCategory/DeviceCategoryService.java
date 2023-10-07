package com.hr_api.Hr_Management_System.services.deviceCategory;

import com.hr_api.Hr_Management_System.dto.DeviceCategoryDto;
import com.hr_api.Hr_Management_System.models.deviceCategory.DeviceCategory;
import com.hr_api.Hr_Management_System.repository.deviceCategory.DeviceCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DeviceCategoryService {
//    @Autowired
//    DeviceCategoryRepository deviceCategoryRepository;
//    public DeviceCategory insertDeviceCategory(DeviceCategoryDto request){
//        DeviceCategory deviceCategory =new DeviceCategory();
//        UUID uuid= UUID.randomUUID();
//        String str= uuid.toString();
////        user.setId(str);
////        user.setUserId(request.getUserId());
////        user.setFirstName(request.getFirstName());
////        user.setLastName(request.getLastName());
////        user.setPassword(encodedPassword);
//        DeviceCategory device_category_repo=deviceCategoryRepository.save(deviceCategory);
//        return device_category_repo;
//    }
//    public List<DeviceCategory> getAllDeviceCategory(){
//        return deviceCategoryRepository.findAll();
//    }
//    public DeviceCategory getByID(String id){
//        return deviceCategoryRepository.findById(id).get();
//    }
//    public DeviceCategory updateById(String id, DeviceCategoryDto deviceCategoryDto){
//        DeviceCategory deviceCategory= deviceCategoryRepository.findById(id).get();
////        user.setFirstName(userDto.getFirstName());
////        user.setLastName(userDto.getLastName());
//        return deviceCategoryRepository.save(deviceCategory);
//    }
//    public void  deleteDeviceCategoryById(String id){
//        deviceCategoryRepository.deleteById(id);
//    }
}
