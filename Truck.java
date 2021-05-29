/*
* This is a class that has
* the Truck's properties and states.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-28
*/

public final class Truck extends Vehicle {
    /** Plate Number. */
    private String plateNumber;

    /** Constructor for truck. */
    public Truck() {
        super();
        this.plateNumber = null;
    }

    /**
    * This is a getter for plateNumber.
    * @return plateNumber
    */
    public String getPlateNumber() {
        return this.plateNumber;
    }

    /**
    * This is a setter for plateNumber.
    * @param userPlate
    */
    public void setPlateNumber(final String userPlate) {
        this.plateNumber = userPlate;
    }

    /**
    * This method gets
    * the amount of air and returns it.
    * @param amountOfAir
    * @return amountOfAir
    */
    public int provideAir(final int amountOfAir) {
        return amountOfAir;
    }
}
