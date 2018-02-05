package org.inh3rit.demo;

import org.inh3rit.demo.debug.Debug;
import org.inh3rit.demo.error.Error;
import org.inh3rit.demo.info.Info;
import org.inh3rit.demo.warn.Warn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        Debug.log();
        Info.log();
        Warn.log();
        Error.log();
        Thread.sleep(10000000);
    }
}
