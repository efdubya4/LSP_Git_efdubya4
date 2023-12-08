package org.howard.edu.lsp.exam.problem51;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLogger {

    @Test
    public void testDisplayLog() {
        Logger logger = Logger.getInstance();

        // Perform some logging
        logger.logMessage("Log message 1");
        logger.logMessage("Log message 2");

        // Test the displayLog method
        String expectedLog = "Log:\nLog message 1\nLog message 2\n";
        assertEquals(expectedLog, logger.displayLog());
    }

    @Test
    public void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Both logger1 and logger2 should reference the same instance
        assertSame(logger1, logger2);
    }
}

