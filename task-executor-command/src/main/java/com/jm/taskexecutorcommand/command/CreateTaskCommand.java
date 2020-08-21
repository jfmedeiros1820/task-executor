package com.jm.taskexecutorcommand.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

@Getter
@ToString
@AllArgsConstructor
public class CreateTaskCommand {

    @TargetAggregateIdentifier
    private String id;
}
