package com.elyprism.launcher.instance;

public class InstanceManager {
    // Manage game instances

    public void startInstance(String instanceName) {
        // Logic to start game instance
        System.out.println("Starting instance: " + instanceName);
    }

    public void stopInstance(String instanceName) {
        // Logic to stop game instance
        System.out.println("Stopping instance: " + instanceName);
    }

    public void listInstances() {
        // Logic to list all game instances
        System.out.println("Listing all instances...");
    }
}