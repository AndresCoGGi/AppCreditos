/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.model;

import java.util.Objects;

/**
 *
 * @author ANDRESCOGI
 */
public class Usuario {
    
    private String credito;
    private String documento;
    private String nombre;
    private Double monto;
    private String tipoTrabajador;
    private String tipoCredito;
    private String trabaja;

    public Usuario(String credito, String documento, String nombre, Double monto, String tipoTrabajador, String tipoCredito, String trabaja) {
        this.credito = credito;
        this.documento = documento;
        this.nombre = nombre;
        this.monto = monto;
        this.tipoTrabajador = tipoTrabajador;
        this.tipoCredito = tipoCredito;
        this.trabaja = trabaja;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.credito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.credito, other.credito)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
