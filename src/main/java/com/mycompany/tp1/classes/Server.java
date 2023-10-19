/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1.classes;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Sandid
 */
public class Server {
    
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(3453);
            System.out.println("Server started");
            
            System.out.println("Waiting for a client to connect ...");
            Socket soc = ss.accept();
            
            System.out.println("Client accepted");
            
            PacketGenerator generatedPaquet = new PacketGenerator();
            PacketClass paquet = generatedPaquet.generatePacket(34352451);

            ss.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    
}
