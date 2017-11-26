/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Vinícius
 */
public class Caminhao extends Automovel{
    protected float capacidade_carga;
    protected int num_eixos;

    public Caminhao() {
    }

    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(float capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

    public int getNum_eixos() {
        return num_eixos;
    }

    public void setNum_eixos(int num_eixos) {
        this.num_eixos = num_eixos;
    }
    
    
}
