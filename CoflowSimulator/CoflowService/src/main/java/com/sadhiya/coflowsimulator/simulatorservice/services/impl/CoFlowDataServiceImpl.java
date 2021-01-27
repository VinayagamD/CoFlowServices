package com.sadhiya.coflowsimulator.simulatorservice.services.impl;

import com.sadhiya.coflowsimulator.simulatorservice.repositories.CoFlowDataRepository;
import com.sadhiya.coflowsimulator.simulatorservice.services.CoFlowDataService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CoFlowDataServiceImpl implements CoFlowDataService {

    private final CoFlowDataRepository repository;


}
