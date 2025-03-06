package com.pluralsight;

/**
 * House class represents a real estate asset.
 * It extends the abstract Asset class and provides specific functionality
 * for calculating the value of a house based on its condition, square footage,
 * and lot size.
 */
public class House extends Asset {
    // House-specific attributes
    private String address; // Physical address of the house
    private int condition; // Condition rating: 1=excellent, 2=good, 3=fair, 4=poor
    private int squareFoot; // House size in square feet
    private int lotSize; // Lot size in square feet

    /**
     * Constructor for creating a House object with all required attributes.
     * 
     * @param dateAcquired The date the house was acquired (format: MM/DD/YYYY)
     * @param description  A brief description of the house
     * @param originalCost The original purchase price of the house
     * @param address      The physical address of the house
     * @param condition    The condition rating (1=excellent, 2=good, 3=fair,
     *                     4=poor)
     * @param squareFoot   The size of the house in square feet
     * @param lotSize      The size of the lot in square feet
     */
    public House(String dateAcquired, String description, double originalCost, String address, int condition,
            int squareFoot, int lotSize) {
        super(dateAcquired, description, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    /**
     * @return The address of the house
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The new address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return The condition rating of the house (1=excellent, 2=good, 3=fair,
     *         4=poor)
     */
    public int getCondition() {
        return condition;
    }

    /**
     * @param condition The new condition rating to set (1=excellent, 2=good,
     *                  3=fair, 4=poor)
     */
    public void setCondition(int condition) {
        this.condition = condition;
    }

    /**
     * @return The size of the house in square feet
     */
    public int getSquareFoot() {
        return squareFoot;
    }

    /**
     * @param squareFoot The new square footage to set
     */
    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    /**
     * @return The size of the lot in square feet
     */
    public int getLotSize() {
        return lotSize;
    }

    /**
     * @param lotSize The new lot size to set
     */
    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    /**
     * Calculates the current value of the house based on condition,
     * square footage, and lot size.
     * 
     * The calculation uses:
     * 1. A value per square foot based on condition
     * 2. A base value (value per square foot × house size)
     * 3. A lot value bonus (0.25 × square foot × lot size)
     * 
     * @return The current calculated value of the house
     */
    @Override
    public double getValue() {
        // Determine value per square foot based on condition
        double valuePerSquareFoot = 0;

        if (condition == 1) { // Excellent condition
            valuePerSquareFoot = 180.00;
        } else if (condition == 2) { // Good condition
            valuePerSquareFoot = 130.00;
        } else if (condition == 3) { // Fair condition
            valuePerSquareFoot = 90.00;
        } else if (condition == 4) { // Poor condition
            valuePerSquareFoot = 80.00;
        }

        // Calculate base value based on house size
        double baseValue = valuePerSquareFoot * squareFoot;

        // Calculate additional value from lot size
        double lotValue = (0.25 * squareFoot * lotSize);

        // Return total house value
        return baseValue + lotValue;
    }
}