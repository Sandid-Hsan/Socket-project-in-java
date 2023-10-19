/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1.classes;

/**
 *
 * @author Sandid
 */
public class PacketSerializer {
    //byte[] serializedpacket;
    PacketGenerator pg= new PacketGenerator();
    PacketClass paquet = pg.generatePacket(81223546);
    public void serializeMethod(byte[] serializedpacket){
        long latitudeLong = Double.doubleToRawLongBits(paquet.latitude);
        long longitudeLong = Double.doubleToRawLongBits(paquet.longitude);
        serializedpacket[0] = (byte) (paquet.ID >> 56);
        serializedpacket[1] = (byte) (paquet.ID >> 48);
        serializedpacket[2] = (byte) (paquet.ID >> 40);
        serializedpacket[3] = (byte) (paquet.ID >> 32);
        serializedpacket[4] = (byte) (paquet.ID >> 24);
        serializedpacket[5] = (byte) (paquet.ID >> 16);
        serializedpacket[6] = (byte) (paquet.ID >> 8);
        serializedpacket[7] = (byte) (paquet.ID);
        serializedpacket[8] = (byte) (paquet.Temperature );
        serializedpacket[9] = (byte) (latitudeLong >> 56 );
        serializedpacket[10] = (byte) (latitudeLong >> 48 );
        serializedpacket[11] = (byte) (latitudeLong >> 40 );
        serializedpacket[12] = (byte) (latitudeLong>> 32 );
        serializedpacket[13] = (byte) (latitudeLong >> 24 );
        serializedpacket[14] = (byte) (latitudeLong >> 16 );
        serializedpacket[15] = (byte) (latitudeLong >> 8 );
        serializedpacket[16] = (byte) (latitudeLong);
        serializedpacket[17] = (byte) (longitudeLong >> 56 );
        serializedpacket[18] = (byte) (longitudeLong >> 48 );
        serializedpacket[19] = (byte) (longitudeLong >> 40 );
        serializedpacket[20] = (byte) (longitudeLong>> 32 );
        serializedpacket[21] = (byte) (longitudeLong >> 24 );
        serializedpacket[22] = (byte) (longitudeLong >> 16 );
        serializedpacket[23] = (byte) (longitudeLong >> 8 );
        serializedpacket[24] = (byte) (longitudeLong);
        serializedpacket[25] = (byte) (paquet.TimeFrame >> 56 );
        serializedpacket[26] = (byte) (paquet.TimeFrame >> 48 );
        serializedpacket[27] = (byte) (paquet.TimeFrame >> 40 );
        serializedpacket[28] = (byte) (paquet.TimeFrame>> 32 );
        serializedpacket[29] = (byte) (paquet.TimeFrame >> 24 );
        serializedpacket[30] = (byte) (paquet.TimeFrame >> 16 );
        serializedpacket[31] = (byte) (paquet.TimeFrame >> 8 );
        serializedpacket[32] = (byte) (checksum(serializedpacket));
        serializedpacket[33] = (byte) (checksum(serializedpacket));
        serializedpacket[34] = (byte) (checksum(serializedpacket));
        serializedpacket[35] = (byte) (checksum(serializedpacket));
        serializedpacket[36] = (byte) (checksum(serializedpacket));
        serializedpacket[37] = (byte) (checksum(serializedpacket));
        serializedpacket[38] = (byte) (checksum(serializedpacket));
        serializedpacket[39] = (byte) (checksum(serializedpacket));
    }
    public long checksum(byte[] arrayofbytes){
        long res=0;
        int n =33 ;
        for(int i = 0; i<n; i++){
            res += arrayofbytes[i];
        }
        return res;
    }
    
}
