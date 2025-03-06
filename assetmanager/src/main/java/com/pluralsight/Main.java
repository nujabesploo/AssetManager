package com.pluralsight;

import java.util.ArrayList;

/**
 * Main class that demonstrates the use of the Asset class hierarchy.
 * This program creates and manages various types of assets.
 */
public class Main {
    /**
     * The main method that serves as the entry point for the application.
     * Creates various assets, adds them to a collection, and displays their
     * information.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a collection to store all assets
        ArrayList<Asset> myAssets = new ArrayList<Asset>();

        // Add houses to the collection
        myAssets.add(new House("01/15/2020", "My house", 250000.00,
                "123 Main St", 1, 2000, 5000));
        myAssets.add(new House("06/22/2019", "Vacation home", 175000.00,
                "456 Beach Ave", 2, 1500, 3000));

        // Add vehicles to the collection
        myAssets.add(new Vehicle("03/10/2023", "Family car", 35000.00,
                "Honda Accord", 2022, 15000));
        myAssets.add(new Vehicle("07/05/2017", "Pickup truck", 45000.00,
                "Ford F-150", 2016, 120000));

        // Display header for asset information
        System.out.println("Asset Information:");
        System.out.println("=================");

        // Iterate through each asset and display its information
        for (Asset asset : myAssets) {
            // Display common asset information
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + String.format("%.2f", asset.getOriginalCost()));
            System.out.println("Current Value: $" + String.format("%.2f", asset.getValue()));

            // Display type-specific information based on asset type
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());

                // Display separator between assets
                System.out.println("-----------------");
            }
        }
    }

}