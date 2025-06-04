package jmri.jmrit.scheduler;

import java.io.Serializable;
import jmri.Block;

/**
 * Define a timing point for a set of timing points in a working
 *
 * @author James E. Petts Copyright (C) 2025
 */


public class TimingPoint implements java.io.Serializable {

    private Block location;
    private int margin = 0; // Seconds
    private String scriptEarly = ""; // Filename
    private String scriptLate = ""; // Filename

    public TimingPoint() {}

    public void setLocation(Block l) {
        location = l;
    }
    public Block getBlock() {
        return location;
    }

    public void setMargin(int m) {
        margin = m;
    }
    public int getMargin() {
        return margin;
    }
    public void setScriptEarly(String se) {
        scriptEarly = se;
    }
    public String getScriptEarly() {
        return scriptEarly;
    }

    public void setScriptLate(String sl) {
        scriptLate = sl;
    }
    public String getScriptLate() {
        return scriptLate;
    }

}
