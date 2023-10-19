/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1.classes;

import java.util.Random;

/**
 *
 * @author Sandid
 */
class PacketGenerator {
    private Random random = new Random();

    public static byte generateRandomTemperature() {
        Random random = new Random();
        byte randomByte = (byte) random.nextInt();
        byte randomTemperature = randomByte;
        return randomTemperature;
    }
    public static double generateRandomLatitude() {
        Random random = new Random();
        double randomDouble = random.nextDouble();
        double randomLatituted = randomDouble;
        return randomLatituted;
    }
    public static double generateRandomLongitude() {
        Random random = new Random();
        double randomDouble = random.nextDouble();
        double randomLongitude = randomDouble;
        return randomLongitude;
    }
    public static long generateRandomTimeFrame() {
        Random random = new Random();
        long randomLong = random.nextLong();
        long randomTimeFrame = randomLong;
        return randomTimeFrame;
    }
    public PacketClass generatePacket(long id){
        PacketClass paquet = new PacketClass();
        paquet.setID(id);
        paquet.settemperature(generateRandomTemperature());
        paquet.settimeframe(generateRandomTimeFrame());
        paquet.setLatitude(generateRandomLatitude());
        paquet.setLongitude(generateRandomLongitude());
        return paquet;
    }
    
}