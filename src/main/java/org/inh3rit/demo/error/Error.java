package org.inh3rit.demo.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Error {

    private static Logger log = LoggerFactory.getLogger(Error.class);

    public static void log() {
        log.error("This is error log.");
    }
}
