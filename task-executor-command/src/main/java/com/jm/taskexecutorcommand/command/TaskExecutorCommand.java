package com.jm.taskexecutorcommand.command;

import java.util.List;

@FunctionalInterface
public interface TaskExecutorCommand {

    void execute(List<Object> values);
}
