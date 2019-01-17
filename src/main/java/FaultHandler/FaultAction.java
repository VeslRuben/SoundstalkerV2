package FaultHandler;

public interface FaultAction {
    /**
     * this metode is cald by FaultHandler to notify a system to take action
     * wen a fault is detected.
     * @param faultCode the code of the fault detected the implementing class shud responde to.
     */
    void respondToFault(int faultCode, int faultId);

}
