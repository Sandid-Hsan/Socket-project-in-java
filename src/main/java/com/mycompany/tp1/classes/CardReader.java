/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1.classes;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sandid
 */
public class CardReader {
    List<Long> ids;
    
    CardReader(List<Long> ids){
        this.ids = ids;
    }
    public void run(){
        ids.add(readCard());
    }
    public Long readCard(){
        
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        return id;
    } 
}
