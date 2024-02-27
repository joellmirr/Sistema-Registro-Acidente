/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joelmir
 */
public class Acidente {
    private String DataAcidente;
    private String Danos;
    private String DescricaoAcidente;
    private String DescricaoLocalizacao;
    private String Municipio;
    private String UF;
    private String Rodovia;
    private String id;
    private int motorista;
    private int vitima;

    public int getMotorista() {
        return motorista;
    }

    public void setMotorista(int motorista) {
        this.motorista = motorista;
    }

    public int getVitima() {
        return vitima;
    }

    public void setVitima(int vitima) {
        this.vitima = vitima;
    }

     

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
            
    public String getDataAcidente() {
        return DataAcidente;
    }

    public void setDataAcidente(String DataAcidente) {
        this.DataAcidente = DataAcidente;
    }

    public String getDanos() {
        return Danos;
    }

    public void setDanos(String Danos) {
        this.Danos = Danos;
    }

    public String getDescricaoAcidente() {
        return DescricaoAcidente;
    }

    public void setDescricaoAcidente(String DescricaoAcidente) {
        this.DescricaoAcidente = DescricaoAcidente;
    }

    public String getDescricaoLocalizacao() {
        return DescricaoLocalizacao;
    }

    public void setDescricaoLocalizacao(String DescricaoLocalizacao) {
        this.DescricaoLocalizacao = DescricaoLocalizacao;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getRodovia() {
        return Rodovia;
    }

    public void setRodovia(String Rodovia) {
        this.Rodovia = Rodovia;
    }

    
}
