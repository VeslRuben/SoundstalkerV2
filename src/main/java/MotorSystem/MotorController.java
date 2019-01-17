package MotorSystem;

import FaultHandler.FaultAction;

public class MotorController implements FaultAction, Runnable {


    public void run() {

    }

    public synchronized void respondToFault(int faultCode, int faultId){
        //TODO set som flags to tell the motorcontroller wat to do
    }

    /**
     * this metod shud be calld to notefy the FalultHandler that an action
     * on a spesific fault is is taken.
     * @param faultId Id of the fault.
     */
    private void actionTaken(int faultId) {

    }
}
