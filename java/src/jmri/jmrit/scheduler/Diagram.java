package jmri.jmrit.scheduler;

import java.util.Vector;

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
    private String userName = "";
    private String trainInfo = ""; // The filename of the train info file for creating the active train

    // Note: These are for display usage only and are intended to represent off-layout origins and destinations.
    // They are different to the on-layout blocks/sections that might be represented in a train information file.
    private String origin = "";
    private String destination = "";

    private Vector<TimingPoint> timingPoints;

    private int retryInterval = 10; // Seconds
    private int maxRetries = 6;
    private String scriptInitialFail = ""; // The file name of the script
    private String scriptFinalFail = ""; // The file name of the script

    private int cancellationProbability = 0; // Percentage
    private String scriptCancel = "";

    private int delayProbability = 0; // Percentage
    private int shortDelayProbability = 100; // Percentage
    private int shortDelayMaxDuration = 0; // Seconds
    private int mediumDelayProbability = 0; // Percentage
    private int mediumDelayMaxDuration = 0; // Seconds
    // Long delay probability is not stored - this is inferred from 100% - short delay probability - medium delay probability.
    private int longDelayMaxDuration =0; // Seconds
    private String scriptDelay = ""; // The file name of the script

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

    public String getTrainInfo() {
        return trainInfo;
    }

    public void setTrainInfo(String trainInfo) {
        this.trainInfo = trainInfo;
    }

    public String getScriptInitialFail() {
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

    public String getScriptFinalFail() {
        return scriptFinalFail;
    }

    public int getCancellationProbability() {
        return cancellationProbability;
    }

    public String getScriptCancel() {
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
        return 100 - mediumDelayProbability - shortDelayProbability;
    }

    public int getLongDelayMaxDuration() {
        return longDelayMaxDuration;
    }

    public String getScriptDelay() {
        return scriptDelay;
    }

}
