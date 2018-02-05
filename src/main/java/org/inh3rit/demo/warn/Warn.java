package org.inh3rit.demo.warn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Warn {

    private static Logger log = LoggerFactory.getLogger(Warn.class);

    public static void log() {
        log.warn("This is warn log.");
    }
}
