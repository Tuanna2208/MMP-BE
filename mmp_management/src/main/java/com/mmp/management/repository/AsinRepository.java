package com.mmp.management.repository;

import com.mmp.management.model.Asin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsinRepository extends JpaRepository<Asin, Long> {
}
