package jmri.jmrit.scheduler.configurexml;

import jmri.jmrit.sample.SampleFunctionalClass;
import jmri.jmrit.scheduler.Scheduler;
import org.jdom2.Element;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Load and store the scheduler data file: Scheduler.xml
 *
 * Adapted from the SampleFunctionalClassXml.java template
 *
 * @author James E. Petts: Copyright (c) 2025
 */
public class SchedulerXml extends jmri.configurexml.AbstractXmlAdapter {

    public SchedulerXml() {
    }

    /**
     * Default implementation for storing the contents of a SampleFunctionalClassXml.
     *
     * @param o Object to store
     * @return Element containing the complete info
     */
    @Override
    public Element store(Object o) {
        
        Scheduler s = (Scheduler) o;
        
        Element elem = new Element("scheduler");
        elem.setAttribute("class", this.getClass().getName());

        elem.addContent(
            new Element("enableDelays")
                .addContent(String.valueOf(s.getEnableDelays()))
        );

        elem.addContent(
                new Element("enableCancellations")
                        .addContent(String.valueOf(s.getEnableCancellations()))
        );

        // TODO: Add load/save for the full range of data

        return elem;
    }

    @Override
    public boolean load(Element shared, Element perNode) {

        boolean result = true;
        
        String enableDelays = shared.getChild("enableDelays").getValue();
        String enableCancellations = shared.getChild("enableCancellations").getValue();
        
        // the following creates and registers
        
        new Scheduler(Boolean.valueOf(enableDelays), Boolean.valueOf(enableCancellations));
        
        return result;
    }
    
    // Conversion format for dates created by Java Date.toString().
    // The Locale needs to be always US, irrelevant from computer's and program's settings!
    final SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

    /**
     * Update static data from XML file
     *
     * @param element Top level Element to unpack.
     * @param o       ignored
     */
    @Override
    public void load(Element element, Object o) {
        log.error("load(Element, Object) called unexpectedly");
    }

    @Override
    public int loadOrder() {
        return jmri.Manager.TIMEBASE;
    }

    private final static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SchedulerXml.class);

}
