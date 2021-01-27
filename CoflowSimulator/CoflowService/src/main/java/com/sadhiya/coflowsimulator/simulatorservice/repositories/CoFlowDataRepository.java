package com.sadhiya.coflowsimulator.simulatorservice.repositories;

import com.sadhiya.coflowsimulator.simulatorservice.models.CoFlowData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoFlowDataRepository extends JpaRepository<CoFlowData, Long> {
}
