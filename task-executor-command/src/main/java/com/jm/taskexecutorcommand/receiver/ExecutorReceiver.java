package com.jm.taskexecutorcommand.receiver;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ExecutorReceiver {

    private String commandName;

    private List<Object> values;
}
