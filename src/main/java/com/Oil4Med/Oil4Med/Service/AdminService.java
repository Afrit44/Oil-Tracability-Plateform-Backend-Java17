package com.Oil4Med.Oil4Med.Service;

import com.Oil4Med.Oil4Med.Model.Admin;
import com.Oil4Med.Oil4Med.Model.Machine;

import java.util.ArrayList;
import java.util.List;

public interface AdminService {

    List<Admin> getAdmins();

    Admin getAdminById(Long id);

    Admin addAdmin(Admin admin);

    void deleteAdmin(Admin admin);

    void updateAdmin(Admin admin, Admin newAdmin);

    void addOliveRegion();

    void deleteOliveRegion();

    void addZone();

    void updateZone();

    void deleteZone();

}
