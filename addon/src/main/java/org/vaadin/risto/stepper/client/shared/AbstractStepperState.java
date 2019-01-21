package org.vaadin.risto.stepper.client.shared;

import com.vaadin.v7.shared.AbstractFieldState;

public class AbstractStepperState extends AbstractFieldState {

    private static final long serialVersionUID = -6837411523699098954L;

    public String INCREASE_ICON_KEY = "ICON_INCREASE";
    public String DECREASE_ICON_KEY = "ICON_DECREASE";

    public boolean isManualInputAllowed = true;
    public boolean isMouseWheelEnabled = true;
    public boolean isInvalidValuesAllowed = false;
    public boolean isNullValueAllowed = false;
    public String value;
    public String minValue;
    public String maxValue;
    public String stepAmount;
}