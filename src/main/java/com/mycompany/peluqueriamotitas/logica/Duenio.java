
package com.mycompany.peluqueriamotitas.logica;

public class Duenio {
    private int id_duenio;
    private String nomDuenio;
    private String celDuenio;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nomDuenio, String celDuenio) {
        this.id_duenio = id_duenio;
        this.nomDuenio = nomDuenio;
        this.celDuenio = celDuenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNomDuenio() {
        return nomDuenio;
    }

    public void setNomDuenio(String nomDuenio) {
        this.nomDuenio = nomDuenio;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }

    
    
    
    
}
