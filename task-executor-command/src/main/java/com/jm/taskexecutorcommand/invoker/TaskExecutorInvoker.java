package com.jm.taskexecutorcommand.invoker;

import com.jm.taskexecutorcommand.command.TaskExecutorCommand;
import com.jm.taskexecutorcommand.receiver.ExecutorReceiver;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class TaskExecutorInvoker {

    @NonNull
    private final ApplicationContext context;

    private void run() {
        ExecutorReceiver validRequest = new ExecutorReceiver("validateRequestCommand", Collections.singletonList("Validate Request"));
        ExecutorReceiver closeRequest = new ExecutorReceiver("closeRequestCommand", Collections.singletonList("Close Request"));
        List<ExecutorReceiver> executorReceivers = new ArrayList<>();
        executorReceivers.add(validRequest);
        executorReceivers.add(closeRequest);
        executorReceivers.forEach(executorReceiver -> {
            TaskExecutorCommand command = context.getBean(executorReceiver.getCommandName(), TaskExecutorCommand.class);
            command.execute(executorReceiver.getValues());
        });
    }

}
