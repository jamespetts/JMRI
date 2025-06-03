package jmri.jmrit.scheduler;

/**
 * Define a time and day of the week for schedules
 * and provide methods for extracting and comparing
 * that time and date.
 *
 * @author James E. Petts Copyright (C) 2025
 */

public class DayTime implements java.io.Serializable {

    private int time; // Seconds since midnight
    private int weekday; // 0-6: 0 = Monday. >6 = any day of the week

    public int getWeekday() {
        return weekday;
    }

    public String getWeekdayString() {
        // TODO: Allow internationalisation/translation
        // This requires setting up the dates strings in a .properties file
        switch (weekday) {
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return "Any day";
        }
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Check whether the passed DayTime object is identical to this one
     *
     * @param comparator The DayTime being compared
     */
    public boolean isEqualTo(DayTime comparator) {
        return comparator.weekday == weekday && comparator.time == time;
    }

    /**
     * Check whether the passed DayTime object is earlier than this one. This assumes that anything more than half a
     * week earlier will in fact be late from the previous week. This is more than sufficient for weekly timetables.
     *
     * @param comparator The DayTime being compared
     */
    public boolean isEarlierThan(DayTime comparator) {
        if (comparator.weekday == weekday || weekday > 6 || comparator.weekday > 6) {
            return time < comparator.time;
        }

        return computeDayLate(comparator) == false && time < comparator.time;
    }

    /**
     * Check whether the passed DayTime object is later than this one. This assumes that anything more than half a
     * week earlier will in fact be late from the previous week. This is more than sufficient for weekly timetables.
     *
     * @param comparator The DayTime being compared
     */
    public boolean isLaterThan(DayTime comparator) {
        if (comparator.weekday == weekday || weekday > 6 || comparator.weekday > 6) {
            return time > comparator.time;
        }

        return computeDayLate(comparator) == true || time > comparator.time;
    }

    /**
     * Helper method for isLaterThan and isEarlierThan
     *
     * @param comparator The DayTime being compared
     */
    private boolean computeDayLate(DayTime comparator) {
        boolean dayLate = false;
        switch (weekday) {
            case 0:
                dayLate = comparator.weekday > 3;
                break;
            case 1:
                dayLate = comparator.weekday == 0 || comparator.weekday > 4;
                break;
            case 2:
                dayLate = comparator.weekday <= 1 || comparator.weekday > 5;
                break;
            case 3:
                dayLate = comparator.weekday <= 2;
                break;
            case 4:
                dayLate = comparator.weekday <= 3 && comparator.weekday > 0;
                break;
            case 5:
                dayLate = comparator.weekday <= 4 && comparator.weekday > 1;
                break;
            case 6:
                dayLate = comparator.weekday <= 5 && comparator.weekday > 2;
                break;
        }
        return dayLate;
    }
}