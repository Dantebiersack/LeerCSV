/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package police_killer;

import java.io.IOException;

/**
 *
 * @author ma003
 */
public class Main {
    public static void main(String[] args) throws IOException{
//        Police[] polices =  PoliceList.getPolice();
//        System.out.println("name \t age \t  gender  \t raceethnicity \t month \t day \t year \t streetaddress \t city \t state");
//        for (Police pol: polices){
//            System.out.println(pol);
//        }

    PoliceList pl = new PoliceList();
    
        String nombre = "Alan";
        if (pl.busquedaSecuencial(nombre) == -1) {
            System.out.println("No se encontro a " + nombre);
        } else {
            int index = pl.busquedaSecuencial(nombre);
            System.out.println(index);
        }
    }
}
