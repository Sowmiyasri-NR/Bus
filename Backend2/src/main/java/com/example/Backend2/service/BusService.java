package com.example.Backend2.service;
import com.example.Backend2.model.Bus;
import com.example.Backend2.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public List<Bus> searchBuses(String source, String destination, String date) {
        return busRepository
                .findBySourceIgnoreCaseAndDestinationIgnoreCaseAndDate(source, destination, date);
    }

    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }
}