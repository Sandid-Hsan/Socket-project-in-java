/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1.classes;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Sandid
 */
public class Client {
    private Socket socket = null;
    private ObjectInputStream objis = null;
    private ObjectOutputStream objos = null;
    
    public Client(String address, int port) throws ClassNotFoundException{
        try{
            socket = new Socket("127.0.0.1", 3453);
            System.out.println("Connected");

            objis = new ObjectInputStream(socket.getInputStream());
            objos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("ready to receive");
            
            String message = (String) objis.readObject();
        }
        catch (UnknownHostException u){
            System.out.println(u);
        }
        catch(IOException i){
            System.out.println(i);
        }
        
        try {
            objis.close();
            objos.close();
            socket.close();
        }
        catch (IOException i) {
            System.out.println(i);
        }
        
    }
}
