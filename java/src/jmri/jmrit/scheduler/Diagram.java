package jmri.jmrit.scheduler;

import java.util.Vector;
import java.io.File;

/**
 * Define the content of a diagram
 *
 * @author James E. Petts Copyright (C) 2025
 */

public class Diagram {

    // TODO: Set up constructor properly
    public Diagram() {}

    // Member variables
    private String systemName;
    private String userName;
    // TODO: Add Active Train data
    private String origin;
    private String destination;
    private Vector<TimingPoint> timingPoints;

    private int retryInterval; // Seconds
    private int maxRetries;
    private File scriptInitialFail;
    private File scriptFinalFail;

    private int cancellationProbability; // Percentage
    private File scriptCancel;

    private int delayProbability; // Percentage
    private int shortDelayProbability; // Percentage
    private int shortDelayMaxDuration; // Seconds
    private int mediumDelayProbability; // Percentage
    private int mediumDelayMaxDuration; // Seconds
    private int longDelayProbability; // Percentage
    private int longDelayMaxDuration; // Seconds
    private File scriptDelay;

    // Getters and setters

    public String GetSystemName() {
        return systemName;
    }

    public String GetUserName() {
        return userName;
    }
    public void SetUserName(String u) {
        userName = u;
    }

    public File getScriptInitialFail() {
        return scriptInitialFail;
    }

    public String getSystemName() {
        return systemName;
    }

    public String getUserName() {
        return userName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getRetryInterval() {
        return retryInterval;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public File getScriptFinalFail() {
        return scriptFinalFail;
    }

    public int getCancellationProbability() {
        return cancellationProbability;
    }

    public File getScriptCancel() {
        return scriptCancel;
    }

    public int getDelayProbability() {
        return delayProbability;
    }

    public int getShortDelayProbability() {
        return shortDelayProbability;
    }

    public int getShortDelayMaxDuration() {
        return shortDelayMaxDuration;
    }

    public int getMediumDelayProbability() {
        return mediumDelayProbability;
    }

    public int getMediumDelayMaxDuration() {
        return mediumDelayMaxDuration;
    }

    public int getLongDelayProbability() {
        return longDelayProbability;
    }

    public int getLongDelayMaxDuration() {
        return longDelayMaxDuration;
    }

    public File getScriptDelay() {
        return scriptDelay;
    }


}
