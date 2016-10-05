package uom.model;

/**
 * 
 * Abstract implementation of people
 */

public abstract class People {

    private String pName;
    private static int noOfPeople = 0;

    public People(String name) {
        this.pName = name;
        noOfPeople++;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpName() {
        return pName;
    }

    public static int getNoOfPeople() {
        return noOfPeople;
    }

}
