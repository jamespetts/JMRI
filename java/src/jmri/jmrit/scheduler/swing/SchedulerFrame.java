package jmri.jmrit.scheduler.swing;

import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.*;

import jmri.InstanceManager;
import jmri.jmrit.scheduler.*;
import jmri.util.JmriJFrame;
import jmri.util.swing.SplitButtonColorChooserPanel;
import jmri.util.swing.JmriJOptionPane;

public class SchedulerFrame extends jmri.util.JmriJFrame {

    public SchedulerFrame() {
        super(true, true);
        setTitle(Bundle.getMessage("TitleScheduler"));  // NOI18N
        // FIXME: Make this work
        //InstanceManager.setDefault(Scheduler.class, this);
        sch = Scheduler.getDataManager();
    }

    Scheduler sch;

}
