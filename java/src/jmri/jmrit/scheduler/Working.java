package jmri.jmrit.scheduler;

import java.util.Vector;

/**
 * Define the contents of a working for scheduled operations
 *
 * @author James E. Petts Copyright (C) 2025
 */

public class Working {

    private String systemName;
    private String userName = "";

    private Diagram diagram;
    private String trainInfo = ""; // The filename of the train info file for creating the active train - overrides that in the diagram

    private DayTime startTime;
    private DayTime endTime;
    private Vector<DayTime> continueTimes; // This may need to be a hashtable
    private Vector<DayTime> timingPointTimings; // This may need to be a hashtable
    private String reportingNumber = "";
    private String specialData = "";

    /**
     * The below override the defaults in the diagram if specified
     * inter.MAXVALUE = unspecified.
     */
    private int cancellationProbability = Integer.MAX_VALUE; // Percentage
    private String scriptCancel = "";

    private int delayProbability = Integer.MAX_VALUE; // Percentage
    private int shortDelayProbability = Integer.MAX_VALUE; // Percentage
    private int shortDelayMaxDuration = Integer.MAX_VALUE; // Seconds
    private int mediumDelayProbability = Integer.MAX_VALUE; // Percentage
    private int mediumDelayMaxDuration = Integer.MAX_VALUE; // Seconds
    // Long delay probability is not stored - this is inferred from 100% - short delay probability - medium delay probability.
    private int longDelayMaxDuration = Integer.MAX_VALUE; // Seconds
    private String scriptDelay = "";

    // Getters and setters
    public String getSystemName() {
        return systemName;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String u) {
        userName = u;
    }

    public String getTrainInfo() {
        if(trainInfo == "") {
            return diagram.getTrainInfo();
        }
        else {
            return trainInfo;
        }
    }

    public void setTrainInfo(String trainInfo) {
        this.trainInfo = trainInfo;
    }

    public DayTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DayTime startTime) {
        this.startTime = startTime;
    }

    public DayTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DayTime endTime) {
        this.endTime = endTime;
    }

    public Vector<DayTime> getContinueTimes() {
        return continueTimes;
    }

    public void setContinueTimes(Vector<DayTime> continueTimes) {
        this.continueTimes = continueTimes;
    }

    public Vector<DayTime> getTimingPointTimings() {
        return timingPointTimings;
    }

    public void setTimingPointTimings(Vector<DayTime> timingPointTimings) {
        this.timingPointTimings = timingPointTimings;
    }

    public String getReportingNumber() {
        return reportingNumber;
    }

    public void setReportingNumber(String reportingNumber) {
        this.reportingNumber = reportingNumber;
    }

    public String getSpecialData() {
        return specialData;
    }

    public void setSpecialData(String specialData) {
        this.specialData = specialData;
    }

    public Diagram getDiagram() {
        return diagram;
    }

    public void setDiagram(Diagram diagram) {
        this.diagram = diagram;
    }

    public int getCancellationProbability() {
        if(cancellationProbability == Integer.MAX_VALUE) {
            return diagram.getCancellationProbability();
        }
        return cancellationProbability;
    }

    public void setCancellationProbability(int cancellationProbability) {
        this.cancellationProbability = cancellationProbability;
    }

    public String getScriptCancel() {
        if(scriptCancel == "") {
            return diagram.getScriptCancel();
        }
        return scriptCancel;
    }

    public void setScriptCancel(String scriptCancel) {
        this.scriptCancel = scriptCancel;
    }

    public int getDelayProbability() {
        if(delayProbability == Integer.MAX_VALUE) {
            return diagram.getDelayProbability();
        }
        return delayProbability;
    }

    public void setDelayProbability(int delayProbability) {
        this.delayProbability = delayProbability;
    }

    public int getShortDelayProbability() {
        if(shortDelayProbability == Integer.MAX_VALUE) {
            return diagram.getShortDelayProbability();
        }
        return shortDelayProbability;
    }

    public void setShortDelayProbability(int shortDelayProbability) {
        this.shortDelayProbability = shortDelayProbability;
    }

    public int getShortDelayMaxDuration() {
        if(shortDelayMaxDuration == Integer.MAX_VALUE) {
            return diagram.getShortDelayMaxDuration();
        }
        return shortDelayMaxDuration;
    }

    public void setShortDelayMaxDuration(int shortDelayMaxDuration) {
        this.shortDelayMaxDuration = shortDelayMaxDuration;
    }

    public int getMediumDelayProbability() {
        if(mediumDelayProbability == Integer.MAX_VALUE) {
            return diagram.getMediumDelayProbability();
        }
        return mediumDelayProbability;
    }

    public void setMediumDelayProbability(int mediumDelayProbability) {
        this.mediumDelayProbability = mediumDelayProbability;
    }

    public int getMediumDelayMaxDuration() {
        if(mediumDelayMaxDuration == Integer.MAX_VALUE) {
            return diagram.getMediumDelayMaxDuration();
        }
        return mediumDelayMaxDuration;
    }

    public void setMediumDelayMaxDuration(int mediumDelayMaxDuration) {
        this.mediumDelayMaxDuration = mediumDelayMaxDuration;
    }

    public int getLongDelayProbability() {
        return 100 - getShortDelayProbability() - getMediumDelayProbability();
    }

    public int getLongDelayMaxDuration() {
        if(longDelayMaxDuration == Integer.MAX_VALUE) {
            return diagram.getLongDelayMaxDuration();
        }
        return longDelayMaxDuration;
    }

    public void setLongDelayMaxDuration(int longDelayMaxDuration) {
        this.longDelayMaxDuration = longDelayMaxDuration;
    }

    public String getScriptDelay() {
        if(scriptDelay == "") {
            return diagram.getScriptDelay();
        }
        return scriptDelay;
    }

    public void setScriptDelay(String scriptDelay) {
        this.scriptDelay = scriptDelay;
    }



}
