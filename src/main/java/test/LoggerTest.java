package test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoggerTest {

	public static void main(String[] args) {
		/*
		 * final org.apache.logging.log4j.Logger log =
		 * org.apache.logging.log4j.LogManager.getLogger(ash.class);
		 */
		System.out.println("Start");
		log.info("Test-info");
		log.debug("Debug");
		log.warn("Warn");
		log.fatal("Fatal");
		log.error("Error");
		System.out.println("End");
	}
}


/* 
 *  https://howtodoinjava.com/log4j2/log4j2-properties-example/
 *  https://www.baeldung.com/lombok-ide
 *  http://www.javabyexamples.com/lombok-log4j-slf4j-and-other-log-annotations
 *  https://mkyong.com/logging/log4j2-properties-example/
 *  https://projectlombok.org/download
 */
