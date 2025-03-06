package com.pluralsight;

/**
 * Vehicle class represents a vehicle asset.
 * It extends the abstract Asset class and provides specific functionality
 * for calculating the value of a vehicle based on its age, mileage, and
 * make/model.
 */
public class Vehicle extends Asset {
    // Vehicle-specific attributes
    private String makeModel; // Make and model of the vehicle (e.g., "Honda Accord")
    private int year; // Manufacturing year of the vehicle
    private int odometer; // Current mileage on the odometer

    /**
     * Constructor for creating a Vehicle object with all required attributes.
     * 
     * @param dateAcquired The date the vehicle was acquired (format: MM/DD/YYYY)
     * @param description  A brief description of the vehicle
     * @param originalCost The original purchase price of the vehicle
     * @param makeModel    The make and model of the vehicle
     * @param year         The manufacturing year of the vehicle
     * @param odometer     The current mileage on the vehicle's odometer
     */
    public Vehicle(String dateAcquired, String description, double originalCost, String makeModel, int year,
            int odometer) {
        super(dateAcquired, description, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    /**
     * @param makeModel The new make and model to set
     */
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    /**
     * @return The make and model of the vehicle
     */
    public String getMakeModel() {
        return makeModel;
    }

    /**
     * @return The manufacturing year of the vehicle
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year The new manufacturing year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return The current mileage on the vehicle's odometer
     */
    public int getOdometer() {
        return odometer;
    }

    /**
     * @param odometer The new odometer reading to set
     */
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    /**
     * Calculates the current value of the vehicle based on age, mileage, and
     * make/model.
     * 
     * The calculation uses:
     * 1. Age-based depreciation (different rates for different age ranges)
     * 2. Mileage depreciation (25% reduction for high mileage non-Honda/Toyota
     * vehicles)
     * 
     * @return The current calculated value of the vehicle
     */
    @Override
    public double getValue() {
        // Calculate vehicle age in years
        int age = 2025 - year;

        // Initialize value to original cost
        double carValue = originalCost; // FIXED: was initialized to 0 instead of originalCost

        // Apply age-based depreciation
        if (age <= 3) { // FIXED: condition logic was incorrect
            // 0-3 years old: 3% depreciation per year
            carValue = carValue * (1 - (0.03 * age)); // FIXED: was 0.3 (30%) instead of 0.03 (3%)
        } else if (age <= 6) { // FIXED: condition logic was incorrect
            // 4-6 years old: 6% depreciation per year
            carValue = carValue * (1 - (0.06 * age)); // FIXED: was 0.6 (60%) instead of 0.06 (6%)
        } else if (age <= 10) { // FIXED: condition logic was incorrect
            // 7-10 years old: 8% depreciation per year
            carValue = carValue * (1 - (0.08 * age)); // FIXED: was 0.8 (80%) instead of 0.08 (8%)
        } else {
            // Over 10 years old: flat value of $1000
            carValue = 1000.00;
        }

        // Apply high mileage depreciation if not Honda or Toyota
        if ((odometer > 100000) && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            // 25% reduction for high mileage non-Honda/Toyota vehicles
            carValue = carValue * 0.75;
        }

        return carValue;
    }
}