package com.Oil4Med.Oil4Med.Repository;

import com.Oil4Med.Oil4Med.Model.PackagingOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OilPackageRepository extends JpaRepository<PackagingOperation, Long> {
}
