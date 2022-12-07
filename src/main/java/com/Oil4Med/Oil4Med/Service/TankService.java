package com.Oil4Med.Oil4Med.Service;

import com.Oil4Med.Oil4Med.Model.StorageArea;
import com.Oil4Med.Oil4Med.Model.Tank;

import java.util.List;

public interface TankService {
    List<Tank> getTank();
    Tank getTankById(Long id);
    Tank addTank(Tank tank);
    void deleteTank(Tank tank);
    void updateTank(Long id, Tank tank);
}
