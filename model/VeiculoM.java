/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joelmir
 */
public class VeiculoM {
    private String Modelo;
    private String AnoFabricacao;
    private String Placa; 
    private String Motorista;
    private String Fabricante;
    private String idveiculo;
    private String Categoria;

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getIdveiculo() {
        return idveiculo;
    }

    public void setIdveiculo(String idveiculo) {
        this.idveiculo = idveiculo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getMotorista() {
        return Motorista;
    }

    public void setMotorista(String Motorista) {
        this.Motorista = Motorista;
    }
    

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(String AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
}

