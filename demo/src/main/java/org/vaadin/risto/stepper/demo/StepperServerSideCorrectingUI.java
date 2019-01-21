package org.vaadin.risto.stepper.demo;

import org.vaadin.risto.stepper.IntStepper;

import com.vaadin.v7.data.Property;
import com.vaadin.v7.data.Property.ValueChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class StepperServerSideCorrectingUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        final IntStepper stepper = new IntStepper();
        stepper.setImmediate(true);
        stepper.setInvalidValuesAllowed(true);
        stepper.addValueChangeListener(new Property.ValueChangeListener() {

            @Override
            public void valueChange(ValueChangeEvent event) {
                System.out.println("Value was "
                        + event.getProperty().getValue());
                stepper.setValue(5);
            }
        });
        setContent(stepper);

    }
}
