package org.example.strategy_json_serializable.sample_2;

import com.fasterxml.jackson.core.JsonProcessingException;

@FunctionalInterface
public interface IStrategy {

    String execute() throws JsonProcessingException;
}
