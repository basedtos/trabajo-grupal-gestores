/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import java.util.ArrayList;

/**
 *
 * @author Lino Espinoza
 */
public class CentroFormacion {
    
    private int idCentroFormacion;
    private String nombre;
    private String urlCentroFormacion;
    private String urlLogo;
    
    private TipoCentroFormacion tipoCentroFormacion;
    
    private ArrayList<Factura> facturas;

    // Getters / Setters
    public int getIdCentroFormacion() {
        return idCentroFormacion;
    }

    public void setIdCentroFormacion(int idCentroFormacion) {
        this.idCentroFormacion = idCentroFormacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlCentroFormacion() {
        return urlCentroFormacion;
    }

    public void setUrlCentroFormacion(String urlCentroFormacion) {
        this.urlCentroFormacion = urlCentroFormacion;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public TipoCentroFormacion getTipoCentroFormacion() {
        return tipoCentroFormacion;
    }

    public void setTipoCentroFormacion(TipoCentroFormacion tipoCentroFormacion) {
        this.tipoCentroFormacion = tipoCentroFormacion;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }
    
}
