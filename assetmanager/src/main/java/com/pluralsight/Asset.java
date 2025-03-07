package com.pluralsight;

/**
 * Asset class represents the base class for all types of assets in the system.
 * This class should be abstract according to the exercise requirements,
 * with getValue() as an abstract method to be implemented by subclasses.
 */
public abstract class Asset { // Changed to abstract class as per exercise

    private String description; // Description of the asset
    protected String dateAcquired; // Date when the asset was acquired
    protected double originalCost; // Original cost/purchase price of the asset

    /**
     * Constructor for creating an Asset object with all required attributes.
     * 
     * @param description  A brief description of the asset
     * @param dateAcquired The date the asset was acquired (format: MM/DD/YYYY)
     * @param originalCost The original purchase price of the asset
     */
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    andiam

    /**
    andia
     * @return The description of the asset
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The new description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The date the asset was acquired
     */
    public String getDateAcquired() {
        return dateAcquired;
    }

    /**
     * @param dateAcquired The new acquisition date to set
     */
    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    /**
     * @return The original cost of the asset
     */
    public double getOriginalCost() {
        return originalCost;
    }

    /**
     * @param originalCost The new original cost to set
     */
    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    /**
     * Abstract method to calculate the current value of the asset.
     * Each subclass must implement this method according to its specific valuation
     * rules.
     * 
     * @return The current calculated value of the asset
     */
    public abstract double getValue(); // Changed to abstract method as per exercise
}
