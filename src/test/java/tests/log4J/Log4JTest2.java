package tests.log4J;

import org.apache.logging.log4j.*;
import org.testng.annotations.*;
public class Log4JTest2 {
    private static Logger logger = LogManager.getLogger(Log4JTest2.class.getName());
    @Test
    public void log4jTest1(){
        logger.info("LOG INFO");
        logger.debug("LOG DEBUG");
        logger.error("LOG ERROR");
        logger.fatal("LOG FATAL");
        logger.warn("LOG WARN");
    }
}


