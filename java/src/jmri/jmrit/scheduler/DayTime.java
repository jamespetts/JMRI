package jmri.jmrit.scheduler;

/**
 * Define a time and day of the week for schedules
 * and provide methods for extracting and comparing
 * that time and date.
 *
 * @author James E. Petts Copyright (C) 2025
 */

public class DayTime implements java.io.Serializable {

    public void DayTime() {}

    private int time = 0; // Seconds since midnight

    public enum DaysOfTheWeek { monday, tuesday, wednesday, thursday, friday, saturday, sunday }
    private boolean[] weekdays = { true, true, true, true, true, true, true };

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDay(DaysOfTheWeek day, boolean value)    {
        weekdays[day.ordinal()] = value;
    }

    public boolean getDay(DaysOfTheWeek day)    {
        return weekdays[day.ordinal()];
    }

    public boolean[] getDays()    {
        return weekdays;
    }

    /**
     * Check whether the passed DayTime object is identical to this one
     *
     * @param comparator The DayTime being compared
     */
    public boolean isEqualTo(DayTime comparator) {
        return comparator.weekdays == weekdays && comparator.time == time;
    }
}