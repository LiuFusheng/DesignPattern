package me.liukunpeng.pattern.chainOfResponsibility;

public class ChainPattern {
    public static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}
