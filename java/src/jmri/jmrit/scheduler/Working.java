package jmri.jmrit.scheduler;

import java.util.Date;
import java.util.Vector;
import java.io.File;

/**
 * Define the contents of a working for scheduled operations
 *
 * @author James E. Petts Copyright (C) 2025
 */

public class Working {

    private Diagram diagram;
    // TODO: Add override train choice data

    private DayTime startTime;
    private DayTime endTime;
    private Vector<DayTime> continueTimes; // This may need to be a hashtable
    private Vector<DayTime> timingPointTimings; // This may need to be a hashtable
    private String reportingNumber;
    private String specialData;

    /**
     * The below override the defaults in the diagram if specified
     */
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

}
