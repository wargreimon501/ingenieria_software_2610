/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.electronica;

import java.util.Scanner;


/**
 *
 * @author wargreimon
 */
  import ico.fes.electronica.testElectronica;
public class testElectronica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        //pintamos ekl menu
        System.out.println("Que equipo desea comprar");
        System.out.println(Almacen.Dell_optiplex+")Computadora Dell optiplex");
        System.out.println(Almacen.Strem_PC+")Computadora Strem PC");
        System.out.println(Almacen.Varago_Alpha_N3060+")Computadora Varago Alpha N3060");
        System.out.println(Almacen.Poco_x3_pro+")Smartphone poco x 3 pro");
        System.out.println(Almacen.Poco_f3+")Smartphone poco F3");
        System.out.println(Almacen.xaomi_redme_note_10+")Smartphone Xaomi Redmi Note 10");
        System.out.println(Almacen.Lenovo+")Tablet Lenovo");
        System.out.println(Almacen.samsung_galaxyTabA7+")Tablet samsung GalaxyTabA7");
        System.out.println(Almacen.huawei_mediaPad+")Tablet huawei MediaPad");
       
        
        //famosa tapa arterias
        try {
            System.out.print("elige tu equipo :");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("no capturaste un numero");
        }
       Almacen equipo=AlmacenFactory.createAlmacen(eleccion);
        System.out.println(equipo.toString());
    }
    
}
