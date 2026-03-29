package com.example.Backend2.repository;

import com.example.Backend2.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BusRepository extends JpaRepository<Bus, Long> {

    List<Bus> findBySourceIgnoreCaseAndDestinationIgnoreCaseAndDate(
            String source, String destination, String date);
}