package com.jm.taskexecutorcommand.command;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ValidateRequestCommand implements TaskExecutorCommand{

    @Override
    public void execute(List<Object> values) {
        Assert.notEmpty(values, "Values are required");
        String name = String.class.cast(values.add(0));
        log.info("Executing command {}", name);
    }
}
