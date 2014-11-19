/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataObjects;

/**
 * This class stores the relevant data about a drum on the winch
 * 
 * @author  Johnny White, Noah Fujioka
 * @date    11/19/2014
 */
public class Winch{
    private DrumParameters drum;
    private Parachute parachute;
    private float brakePressure;
    private float batteryVoltage;

    public Winch() {
        drum = null;
        parachute = null;
        brakePressure = 0;
        batteryVoltage = 0;
    }
    
    public Winch(DrumParameters drum, Parachute parachute, float brakePressure, float batteryVoltage) {
        this.drum = drum;
        this.parachute = parachute;
        this.brakePressure = brakePressure;
        this.batteryVoltage = batteryVoltage;
    }
    
    public void setDrum(DrumParameters newDrum) {
        drum = newDrum;
    }
    
    public DrumParameters getDrum() {
        return drum;
    }
    
    public void setParachute(Parachute newParachute) {
        parachute = newParachute;
    }
    
    public Parachute getParachute() {
        return parachute;
    }
    
    public void setParachute(float newBrakePressure) {
        brakePressure = newBrakePressure;
    }
    
    public float getBrakePressure() {
        return brakePressure;
    }
    public void setBatteryVoltage(float newBatteryVoltage) {
        batteryVoltage = newBatteryVoltage;
    }
    
    public float getBatteryVoltage() {
        return batteryVoltage;
    }    
}
