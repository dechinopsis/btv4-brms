package com.dlya.btbrms.flow.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class BtFlowDefinition {
    @JsonProperty("flowSteps")
    private Map<String, BtFlowStep> flowSteps;
    @JsonProperty("flowResources")
    private List<BtFlowResource> flowResources;

}