package com.sadhiya.coflowsimulator.simulatorservice.configs;

import com.sadhiya.coflowsimulator.simulatorservice.services.CoFlowDataService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduling.enabled",matchIfMissing = true)
@Slf4j
@AllArgsConstructor
public class SchedulingConfiguration {

    private final CoFlowDataService service;

    @Scheduled(fixedDelayString = "PT3S")
    void runTaskForEvery3Sec(){

        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("================= Running Time =====================");
        log.info(localDateTime.toString());
        log.info("=====================================================");
    }

}
