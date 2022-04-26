/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.articulos;

import ico.fes.electronica.Almacen;

/**
 *
 * @author wargreimon
 */
public class Smartphone implements Almacen{
    private String Nombre;
    private String Marca;
    private String Modelo;
    private String Color;
    private int Numero_serie;
    private int ROM;
    private int RAM; 

    public Smartphone() {
    }

    public Smartphone(String Nombre, String Marca, String Modelo, String Color, int Numero_serie, int ROM, int RAM) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Numero_serie = Numero_serie;
        this.ROM = ROM;
        this.RAM = RAM;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getNumero_serie() {
        return Numero_serie;
    }

    public void setNumero_serie(int Numero_serie) {
        this.Numero_serie = Numero_serie;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "Nombre=" + Nombre + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Numero_serie=" + Numero_serie + ", ROM=" + ROM +"Gb"+ ", RAM=" + RAM+"Gb" + '}';
    }
    
}
