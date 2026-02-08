package com.elyprism.launcher.settings;

public class SettingsManager {

    private int ram; // RAM allocation

    public SettingsManager() {
        this.ram = 2048; // default RAM allocation in MB
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0) {
            this.ram = ram;
        } else {
            throw new IllegalArgumentException("RAM must be greater than 0.");
        }
    }

    // Additional methods for settings management can be added here.
}