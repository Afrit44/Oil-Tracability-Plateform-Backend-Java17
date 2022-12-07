package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.Tank;
import com.Oil4Med.Oil4Med.Repository.TankRepository;
import com.Oil4Med.Oil4Med.Service.TankService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TankImpl implements TankService {
    @Autowired
    TankRepository tankRepository;

    public TankImpl(TankRepository tankRepository){
        this.tankRepository=tankRepository;
    }
    @Override
    public List<Tank> getTank() {
        List<Tank> tanks = new ArrayList<>();
        tankRepository.findAll().forEach(tanks::add);
        return tanks;
    }

    @Override
    public Tank getTankById(Long id) {
        return tankRepository.findById(id).get();
    }

    @Override
    public Tank addTank(Tank tank) {
        return tankRepository.save(tank);
    }

    @Override
    public void deleteTank(Tank tank) {
        tankRepository.delete(tank);
    }

    @Override
    public void updateTank(Long id, Tank tank) {
        Tank tankFromBD = tankRepository.findById(id).get();
        tankFromBD.setMachineId(tank.getMachineId());
        tankRepository.save(tankFromBD);
    }
}
