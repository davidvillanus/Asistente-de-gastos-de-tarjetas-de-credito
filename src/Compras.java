package com.estructuraDeDatos;

public class Compras {
    private String nombre;
    private String fecha;
    private long valorCuota;
    private int NdeCuotas;


    public Compras(String nombre, String fecha, long valorCuota, int ndeCuotas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.valorCuota = valorCuota;
        this.NdeCuotas = ndeCuotas;
    }

    public String getNombre() {
        return nombre;
    }
    public String  getFecha() {
        return fecha;
    }

    public long getValorCuota() {
        return valorCuota;
    }

    public int getNdeCuotas() {
        return NdeCuotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String  fecha) {
        this.fecha = fecha;
    }

    public void setValorCuota(long valorCuota) {
        this.valorCuota = valorCuota;
    }

    public void setNdeCuotas(int ndeCuotas) {
        NdeCuotas = ndeCuotas;
    }
}
