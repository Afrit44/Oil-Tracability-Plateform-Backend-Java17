package com.Oil4Med.Oil4Med.Repository;

import com.Oil4Med.Oil4Med.Model.PackagingOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PackagingOperationRepository extends JpaRepository<PackagingOperation, Long> {
}
