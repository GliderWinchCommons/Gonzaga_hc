/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvironmentalWidgets;

import Configuration.UnitLabelUtilities;
import DataObjects.CurrentDataObjectSet;

/**
 *
 * @author jtroxel
 */
public class HeadWindComponentWidget extends EnvironmentalWidget {

    public HeadWindComponentWidget() {
        super("Headwind Component", true, false);
    }

    @Override
    public void update() {
    }

    @Override
    public void update(String msg) {
    }

    @Override
    public void setupUnits() {
        unitId = CurrentDataObjectSet.getCurrentDataObjectSet().getCurrentProfile().getUnitSetting("headwind");
        unit.setText(" " + UnitLabelUtilities.velocityUnitIndexToString(unitId));
    }
    
}
