package FalutHandler;

import java.util.Date;

public class Fault implements  Comparable<Fault>{


    static final int critical = 1;
    static final int serious = 2;
    static final int warning = 3;

    private static int nextId;

    private int level;
    private String message;
    private int faultCode;
    private String location;
    private int faultId;
    private Date timeStamp;
    private boolean actionTaken;



    public Fault(int level, String message, int faultCode, String location) {
        this.level = level;
        this.message = message;
        this.faultCode = faultCode;
        this.location = location;
        this.timeStamp = new Date();
        this.actionTaken = false;

        this.faultId = nextId;
        nextId += 1;
    }

    public int getFaultCode() {
        return faultCode;
    }

    public int getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public String getLocation() {
        return location;
    }

    public int getFaultId() {
        return faultId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public boolean isActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(boolean actionTaken) {
        this.actionTaken = actionTaken;
    }

//TODO Sort the objets
    /**
     * sorts by intensety level
     * @param o Fault to comper to
     * @return level
     */
    public int compareTo(Fault o) {
        return this.level;
    }
}
