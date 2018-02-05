package org.inh3rit.demo.debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Debug {

    private static Logger log = LoggerFactory.getLogger(Debug.class);

    public static void log() {
        log.debug("This is debug log.");
    }
}
