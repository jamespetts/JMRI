package jmri.jmrit.scheduler;

import java.util.Vector;
import java.io.File;

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

    public boolean isEnableDelays() {
        return enableDelays;
    }

    public void setEnableDelays(boolean enableDelays) {
        this.enableDelays = enableDelays;
    }

    public boolean isEnableCancellations() {
        return enableCancellations;
    }

    public void setEnableCancellations(boolean enableCancellations) {
        this.enableCancellations = enableCancellations;
    }

}
