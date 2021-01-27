package com.sadhiya.coflowsimulator.simulators.api;

public interface Command <T,R>{

    R execute(T t);
}
