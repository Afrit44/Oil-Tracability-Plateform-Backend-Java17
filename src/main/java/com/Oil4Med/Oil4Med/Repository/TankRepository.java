package com.Oil4Med.Oil4Med.Repository;

import com.Oil4Med.Oil4Med.Model.Tank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TankRepository extends JpaRepository<Tank, Long> {
}
