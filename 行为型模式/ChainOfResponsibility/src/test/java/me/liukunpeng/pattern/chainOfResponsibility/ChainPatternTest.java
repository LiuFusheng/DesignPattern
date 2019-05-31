package me.liukunpeng.pattern.chainOfResponsibility;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChainPatternTest {

    @Test
    public void logMessage() {

        AbstractLogger loggerChain = ChainPattern.getChainOfLoggers();

        //loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,  "This is a debug level information.");

        //loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}