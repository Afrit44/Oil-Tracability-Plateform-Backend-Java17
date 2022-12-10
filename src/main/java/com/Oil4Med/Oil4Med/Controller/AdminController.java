package com.Oil4Med.Oil4Med.Controller;

import com.Oil4Med.Oil4Med.DTO.AdminDTO;
import com.Oil4Med.Oil4Med.DTO.ConsumerDTO;
import com.Oil4Med.Oil4Med.Model.Admin;
import com.Oil4Med.Oil4Med.Model.Consumer;
import com.Oil4Med.Oil4Med.Service.AdminService;
import com.Oil4Med.Oil4Med.Service.ConsumerService;
import com.Oil4Med.Oil4Med.Service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/oil4med/admin/")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private ConsumerService consumerService;
    @Autowired
    private FarmerService farmerService;
    @Autowired
    private MillFactoryController millFactoryController;

    //CRUD Admin
    @PostMapping("/createAdmin")
    public Admin createAdmin(@RequestBody Admin admin) throws Exception {
        //listRole will add the three roles in role table if it is empty
        return adminService.addAdmin(admin);
    }
    @GetMapping("/getAdminById")
    public AdminDTO getAdminById(@RequestParam Long adminId) {
        return AdminDTO.fromEntity(adminService.getAdminById(adminId));
    }
    @GetMapping("/getAllAdmins")
    public List<AdminDTO> getAllAdmins() {
        List<Admin> admins = adminService.getAdmins();
        List<AdminDTO> adminDTOS = new ArrayList<>();
        for (Admin admin : admins){
            adminDTOS.add(AdminDTO.fromEntity(admin));
        }
        return adminDTOS;
    }
    @PutMapping("/updateAdmin")
    public void updateAdmin(@RequestParam  Long adminId,Admin newAdmin){
        adminService.updateAdmin(adminId,newAdmin);
    }
    @DeleteMapping("/deleteAdmin")
    public void deleteAdmin(long adminId){
        adminService.deleteAdmin(adminService.getAdminById(adminId));
    }

    //ConsumerCRUD
    @PostMapping("/createConsumer")
    public Consumer createConsumer(@RequestBody Consumer consumer) throws Exception {
        //listRole will add the three roles in role table if it is empty
        return consumerService.addConsumer(consumer);
    }
    @GetMapping("/getConsumer")
    public ConsumerDTO findConsumerById(@RequestParam Long consumerId) {
        return ConsumerDTO.fromEntity(consumerService.getConsumersById(consumerId));
    }
    @GetMapping("/getAllConsumers")
    public List<ConsumerDTO> getAllConsumers(){
        List<Consumer> consumers = consumerService.getConsumers();
        List<ConsumerDTO> consumerDTOS = new ArrayList<>();
        for (Consumer consumer : consumers){
            consumerDTOS.add(ConsumerDTO.fromEntity(consumer));
        }
        return consumerDTOS;
    }
    @DeleteMapping("/deleteConsumer")
    public void deleteConsumer(long consumerId) {
        consumerService.deleteConsumer(consumerService.getConsumersById(consumerId));
    }

    //CRUD Farmer


}
