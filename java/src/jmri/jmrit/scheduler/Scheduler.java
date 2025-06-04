package jmri.jmrit.scheduler;

import jmri.ConfigureManager;
import jmri.InstanceManager;

import java.util.Vector;

/**
 * The collection data structures and main logic
 * for the scheduling system
 *
 * @author James E. Petts Copyright (C) 2025
 */

public class Scheduler {

    private Vector<Diagram> diagrams;
    private Vector<Working> workings;

    private boolean enableDelays = true;
    private boolean enableCancellations = true;

    public Scheduler(boolean ed, boolean ec) {
        enableDelays = ed;
        enableCancellations = ec;

        // register to store
        InstanceManager.getDefault(ConfigureManager .class).registerUser(this);
    }

    public Vector<Diagram> getDiagrams() {
        return diagrams;
    }

    public void setDiagrams(Vector<Diagram> diagrams) {
        this.diagrams = diagrams;
    }

    public Vector<Working> getWorkings() {
        return workings;
    }

    public void setWorkings(Vector<Working> workings) {
        this.workings = workings;
    }

    public boolean getEnableDelays() {
        return enableDelays;
    }

    public void setEnableDelays(boolean enableDelays) {
        this.enableDelays = enableDelays;
    }

    public boolean getEnableCancellations() {
        return enableCancellations;
    }

    public void setEnableCancellations(boolean enableCancellations) {
        this.enableCancellations = enableCancellations;
    }

}
