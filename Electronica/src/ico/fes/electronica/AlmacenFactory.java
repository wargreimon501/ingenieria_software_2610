/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.electronica;
import ico.fes.articulos.Computadoras;
import ico.fes.articulos.Smartphone;
import ico.fes.articulos.Tablet;
/**
 *
 * @author wargreimon
 */
import ico.fes.electronica.AlmacenFactory;
public class AlmacenFactory {

    /**
     *
     * @param tipo
     * @return
     */
    public static Almacen createAlmacen(int tipo){
        switch(tipo){
            case Almacen.Dell_optiplex:
                return   new Computadoras("Dell Optiplex","Dell segunda generacion","DELL",14572189);
            case Almacen.Strem_PC:
                return   new Computadoras("Strem PC","XTBRRREXSAS","Strem PC GAMER",12435);
            case Almacen.Varago_Alpha_N3060:
                return   new Computadoras("Varago Alpha N3060","N3060","Varago",43453453);
            case Almacen.Poco_x3_pro:
                return new Smartphone("Poco x3 pro","Xaomi","Poco","azul",13643,128,6);
            case Almacen.Poco_f3:
                return new Smartphone("Poco F3","Xaomi","Poco","Negro",144821,256,8);
            case Almacen.xaomi_redme_note_10:
                return new Smartphone("Redmi Note 10","Xaomi","Redmi","Blanco",1842154,128,6);
            case Almacen.Lenovo:
                return new Tablet("Lenovo Tab M10","Lenovo","M10 HD 2 generacion",15818,36,4,9);
            case Almacen.samsung_galaxyTabA7:
                return new Tablet("Samsung galaxy Tab A7","Samsung","Tab A7 lite",644776,64,3,8);
            case Almacen.huawei_mediaPad:
                return new Tablet("Huawei Media Pad","Huawei","T3 10",45168721,64,2,10);
                
            
            default:
                throw new AssertionError();
        }
    }
}
