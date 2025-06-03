package jmri.jmrit.scheduler;

import java.io.Serializable;
import jmri.Block;
import java.io.File;

/**
 * Define a timing point for a set of timing points in a working
 *
 * @author James E. Petts Copyright (C) 2025
 */


public class TimingPoint implements java.io.Serializable {

    private Block location;
    private int margin; // Seconds
    private File scriptEarly;
    private File scriptLate;

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
    public void setScriptEarly(File se) {
        scriptEarly = se;
    }
    public File getScriptEarly() {
        return scriptEarly;
    }

    public void setScriptLate(File sl) {
        scriptLate = sl;
    }
    public File getScriptLate() {
        return scriptLate;
    }

}
