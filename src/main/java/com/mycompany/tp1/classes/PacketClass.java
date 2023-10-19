/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1.classes;

/**
 *
 * @author Sandid
 */
public class PacketClass {
    long ID;
    long TimeFrame;
    private int checksum;
    byte Temperature;
    GpsSensor position = new GpsSensor();
    double latitude = position.getlatitude();
    double longitude = position.getlongitude();
    public long getID(){
        return ID;
    }
    public long gettimeframe(){
        return TimeFrame;
    }
    public byte gettemperature(){
        return Temperature;
    }
    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }
    public int getchecksum(){
        return checksum;
    }
    public void settimeframe(long TimeFrame){
        this.TimeFrame = TimeFrame;
    }
    public void settemperature(byte Temperature){
        this.Temperature = Temperature ;
    }
    public void setID(long ID){
        this.ID = ID;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
    public int checkSum (){
        return 0;
    }
   
}
