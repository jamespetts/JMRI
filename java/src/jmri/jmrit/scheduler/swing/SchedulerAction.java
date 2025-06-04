package jmri.jmrit.scheduler.swing;

import java.awt.event.ActionEvent;
import jmri.util.swing.JmriAbstractAction;

/**
 * Swing action to create and register a SchedulerFrame
 *
 * Adapted from the TimeTableAction class
 *
 * @author James E. Petts Copyright (C) 2025
 */
public class SchedulerAction extends JmriAbstractAction {

    public SchedulerAction(String s) {
        super(s);
    }

    public SchedulerAction() {
        this("Scheduler");  // NOI18N
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jmri.InstanceManager.getNullableDefault(SchedulerFrame.class) != null) {
            // Prevent duplicate copies
            return;
        }
        SchedulerFrame f = new SchedulerFrame();
        f.setVisible(true);
    }

    // never invoked, because we overrode actionPerformed above
    @Override
    public jmri.util.swing.JmriPanel makePanel() {
        throw new IllegalArgumentException("Should not be invoked");  // NOI18N
    }
}
