package com.Oil4Med.Oil4Med.Controller;

import com.Oil4Med.Oil4Med.DTO.AdminDTO;
import com.Oil4Med.Oil4Med.DTO.ConsumerDTO;
import com.Oil4Med.Oil4Med.DTO.FarmerDTO;
import com.Oil4Med.Oil4Med.DTO.MillFactoryDTO;
import com.Oil4Med.Oil4Med.Model.*;
import com.Oil4Med.Oil4Med.Model.Types.OilTraceability;
import com.Oil4Med.Oil4Med.Service.AdminService;
import com.Oil4Med.Oil4Med.Service.ConsumerService;
import com.Oil4Med.Oil4Med.Service.FarmerService;
import com.Oil4Med.Oil4Med.Service.MillFactoryService;
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

    //Mistake
    /*@Autowired
    private MillFactoryController millFactoryController;*/

    @Autowired
    private MillFactoryService millFactoryService;

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
    @PutMapping("/updateConsumer")
    public void updateConsumer(@RequestParam  Long consumerId,Consumer newConsumer){
        consumerService.updateConsumer(consumerId,newConsumer);
    }
    @DeleteMapping("/deleteConsumer")
    public void deleteConsumer(long consumerId) {
        consumerService.deleteConsumer(consumerService.getConsumersById(consumerId));
    }

    //CRUD Farmer
    @PostMapping("/createFarmer")
    public Farmer createFarmer(@RequestBody Farmer farmer) throws Exception {
        //listRole will add the three roles in role table if it is empty
        return farmerService.addFarmer(farmer);
    }
    @GetMapping("/getFarmer")
    public FarmerDTO findFarmerById(@RequestParam Long farmerId) {
        return FarmerDTO.fromEntity(farmerService.getFarmerById(farmerId));
    }
    @GetMapping("/getAllFarmers")
    public List<FarmerDTO> getAllFarmers(){
        List<Farmer> farmers = farmerService.getFarmers();
        List<FarmerDTO> farmerDTOS = new ArrayList<>();
        for (Farmer farmer : farmers){
            farmerDTOS.add(FarmerDTO.fromEntity(farmer));
        }
        return farmerDTOS;
    }
    @PutMapping("/updateFarmer")
    public void updateFarmer(@RequestParam  Long farmerId,Farmer newFarmer){
        farmerService.updateFarmer(farmerId,newFarmer);
    }
    @DeleteMapping("/deleteFarmer")
    public void deleteFarmer(long farmerId) {
        farmerService.deleteFarmer(farmerService.getFarmerById(farmerId));
    }

    //CRUD MillFactory
    @PostMapping("/createMillFactory")
    public MillFactory createMillFactory(@RequestBody MillFactory millFactory) throws Exception {
        //listRole will add the three roles in role table if it is empty
        return millFactoryService.addMillFactory(millFactory);
    }
    @GetMapping("/getMillFactory")
    public MillFactoryDTO findMillFactoryById(@RequestParam Long millFactoryId) {
        return MillFactoryDTO.fromEntity(millFactoryService.getMillFactoryById(millFactoryId));
    }
    @GetMapping("/getAllMillFactories")
    public List<MillFactoryDTO> getAllMillFactories(){
        List<MillFactory> millFactories = millFactoryService.getMillFactories();
        List<MillFactoryDTO> millFactoryDTOS = new ArrayList<>();
        for (MillFactory millFactory : millFactories){
            millFactoryDTOS.add(MillFactoryDTO.fromEntity(millFactory));
        }
        return millFactoryDTOS;
    }
    @DeleteMapping("/deleteMillFacotry")
    public void deleteMillFactory(long millFactoryId) {
        millFactoryService.deleteMillFactory(millFactoryService.getMillFactoryById(millFactoryId));
    }

    //Rest of Admin functions
    @GetMapping("/purchaseOilFromFarmer")
    public PurchaseOil purchaseOilFromFarmer(Consumer consumer, Farmer farmer, OilProduct oilProduct, double quantity, double price) {
        return consumerService.purchaseOilFromFarmer(consumer,farmer,oilProduct,quantity,price);
    }

    @GetMapping("/purchaseOilFromMill")
    public PurchaseOil purchaseOilFromMill(MillFactory millFactory, OilProduct oilProduct, double quantity, double price, Consumer consumer) {
        return consumerService.purchaseOilFromMill(millFactory,oilProduct,quantity,price,consumer);
    }

    @GetMapping("/checkTraceability")
    public OilTraceability checkTraceability(OilProduct oilProduct) {
        return consumerService.checkTraceability(oilProduct);
    }
    @PostMapping("/addOliveRegion")
    public void addOliveRegion() {
        adminService.addOliveRegion();
    }

    @DeleteMapping("/deleteOliveRegion")
    public void deleteOliveRegion() {
        adminService.deleteOliveRegion();
    }

    @PostMapping("/addZone")
    public void addZone() {
        adminService.addZone();
    }

    @PutMapping("/updateZone")
    public void updateZone() {
        adminService.updateZone();
    }

    @DeleteMapping("/deleteZone")
    public void deleteZone() {
        adminService.deleteZone();
    }



}
