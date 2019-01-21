package org.vaadin.risto.stepper.demo;

import com.google.common.base.Strings;
import com.vaadin.v7.data.Property;
import com.vaadin.v7.data.Property.ValueChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.v7.ui.CheckBox;
import com.vaadin.ui.CssLayout;
import com.vaadin.v7.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.v7.ui.VerticalLayout;
import org.vaadin.risto.stepper.DateStepper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class StepperDateFormatDemoUI extends UI {

    private static final long serialVersionUID = 28231094991379143L;

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();

        CssLayout content = new CssLayout();
        setContent(layout);

        final DateStepper stepper = new DateStepper();

        TextField format = new TextField();
        format.setImmediate(true);
        format.addValueChangeListener(new Property.ValueChangeListener() {

            private static final long serialVersionUID = -4391822019748263412L;

            @Override
            public void valueChange(ValueChangeEvent event) {
                String value = (String) event.getProperty().getValue();
                if (Strings.isNullOrEmpty(value)) {
                    stepper.setDateFormat(null);
                } else {
                    stepper.setDateFormat(new SimpleDateFormat(value));
                }
            }
        });

        CheckBox change = new CheckBox();
        change.addValueChangeListener(new Property.ValueChangeListener() {

            private static final long serialVersionUID = -4391822019748263412L;

            @Override
            public void valueChange(ValueChangeEvent event) {
                if ((Boolean) event.getProperty().getValue()) {
                    stepper.setDateFormat(((SimpleDateFormat) DateFormat
                            .getDateInstance(DateFormat.LONG, getLocale())));
                } else {
                    stepper.setDateFormat(null);
                }
            }
        });

        content.addComponent(stepper);
        content.addComponent(format);
        content.addComponent(change);

        layout.addComponent(content);
        layout.setComponentAlignment(content, Alignment.MIDDLE_CENTER);
    }
}
