package org.vaadin.risto.stepper.demo;

import org.vaadin.risto.stepper.IntStepper;

import com.vaadin.v7.data.Item;
import com.vaadin.server.VaadinRequest;
import com.vaadin.v7.ui.Table;
import com.vaadin.ui.UI;

public class StepperTableDemoUI extends UI {

    private static final long serialVersionUID = -7167339380482340828L;

    @SuppressWarnings("unchecked")
    @Override
    protected void init(VaadinRequest request) {
        Table table = new Table();
        table.addContainerProperty("test", IntStepper.class, null);
        Item addedItem = table.addItem("item");
        addedItem.getItemProperty("test").setValue(new IntStepper());

        setContent(table);
    }
}
