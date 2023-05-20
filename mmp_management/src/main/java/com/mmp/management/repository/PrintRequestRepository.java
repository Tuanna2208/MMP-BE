package com.mmp.management.repository;

import com.mmp.management.model.PrintRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrintRequestRepository extends JpaRepository<PrintRequest, Long> {
}
