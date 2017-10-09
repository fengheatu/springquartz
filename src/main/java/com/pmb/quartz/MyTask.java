package com.pmb.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: he.feng
 * \* Date: 2017/9/20
 * \* Description:
 * \
 */
public class MyTask {

    private static  final Logger logger = LoggerFactory.getLogger(MyTask.class);

    public void execute() {
        logger.info("my task execute");
    }
}
