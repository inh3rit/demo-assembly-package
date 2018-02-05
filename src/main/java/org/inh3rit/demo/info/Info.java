package org.inh3rit.demo.info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Info {

    private static Logger log = LoggerFactory.getLogger(Info.class);

    public static void log() {
        log.info("This is info log.");
    }
}
