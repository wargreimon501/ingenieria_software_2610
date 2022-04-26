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
public class Computadoras implements Almacen{
    private String nombre;
    private String modelo;
    private String marca;
    private int numero_serie;

    public Computadoras() {
    }

    public Computadoras(String nombre, String modelo, String marca, int numero_serie) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.numero_serie = numero_serie;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    @Override
    public String toString() {
        return "Computadoras{" + "nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca + ", numero_serie=" + numero_serie + '}';
    }

   
}
