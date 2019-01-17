package FalutHandler;

import MotorSystem.MotorConroller;

import java.util.concurrent.locks.ReentrantLock;

public class FaultHandler {

    private static boolean constructed;
    private static FaultHandler instance;

    private FaultRegistry faultRegistry;
    private FaultAction motorController;
    private final ReentrantLock thredLock;

    private FaultHandler() {
        instance = this;
        this.faultRegistry = new FaultRegistry();
        this.thredLock = new ReentrantLock();

    }

    public void supscribeMotorcontroller(FaultAction instance) {
            this.motorController = instance;
    }

    /**
     * constructs an instance of the class if not constructed
     * else returns the previously constructed instance
     *
     * @return instance of the class.
     */
    public static FaultHandler getInstance() {
        if (constructed) {
            return instance;
        } else {
            constructed = true;
            return new FaultHandler();
        }
    }

    public void reportFault(Fault fault) {
        thredLock.lock();
        try {
            this.faultRegistry.add(fault);
        } finally {
            thredLock.unlock();
        }
        if (fault.getLevel() == Fault.warning) {
            fault.setActionTaken(true);
        } else {
            this.takeAction(fault);
        }
        //TODO notify GUI.
    }

    /**
     * takes spesific actions based on the level of the fault.
     *
     * @param fault detected fault
     */
    private void takeAction(Fault fault) {

       switch (fault.getFaultCode()){
           case 1000 :
            motorController.respondToFault(fault.getFaultCode(), fault.getFaultId());
           break;

           case 2000:

               break;


        default:
            throw new RuntimeException(String.format("fault not handeld. fault code: %s. fault message: %s", fault.getFaultCode(), fault.getMessage()));
        }
        //TODO notify GUI.
    }

    public synchronized void reportActionTaken(int faultId) {
        thredLock.lock();
        try {
            for (Fault fault : this.faultRegistry) {
                if (fault.getFaultId() == faultId) {
                    fault.setActionTaken(true);
                }
            }
        } finally {
            thredLock.unlock();
        }
        //TODO notify GUI.
    }

}
