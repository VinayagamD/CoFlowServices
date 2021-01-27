package com.sadhiya.coflowsimulator.simulatorservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coflow_datas")
public class CoFlowData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    private String algorithm;

    @Column(name = "cf_timestamp")
    private LocalDateTime cfTimestamp;

    @Column(name = "no_of_co_flows")
    private int noOfCoFlows;

    @Column(name = "no_of_flows")
    private int noOfFlows;

    @Column(name = "energy_levels")
    private float energyLevels;


    private int reducer;

    @Column(name = "no_of_runs")
    private int noOfRuns;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
