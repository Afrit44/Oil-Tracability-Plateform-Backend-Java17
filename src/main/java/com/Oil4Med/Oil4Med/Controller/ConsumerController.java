package com.Oil4Med.Oil4Med.Controller;

import com.Oil4Med.Oil4Med.Service.ConsumerService;
import com.Oil4Med.Oil4Med.Service.PurchaseOilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin
@RequestMapping("/api/consumer/")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private PurchaseOilService purchaseOilService;


}
