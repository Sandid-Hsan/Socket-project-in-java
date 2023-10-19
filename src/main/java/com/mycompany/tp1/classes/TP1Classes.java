/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1.classes;

/**
 *
 * @author Sandid
 */
public class TP1Classes {

    public static void main(String[] args) {
        PacketGenerator generatedpacket = new PacketGenerator();
        PacketClass packet = generatedpacket.generatePacket(15724684);
        System.out.println(packet.getID());
        System.out.println(packet.gettimeframe());
        System.out.println(packet.gettemperature());
        System.out.println(packet.getLatitude());
        System.out.println(packet.getLongitude());
    }
}
