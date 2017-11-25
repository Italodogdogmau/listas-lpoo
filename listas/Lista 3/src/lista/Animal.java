/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author 00000
 */
public class Animal {
    
    private String cor;
    private String tipo;

    public Animal() {
    }

    public Animal(String cor, String tipo) {
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" + "cor=" + cor + ", tipo=" + tipo + '}';
    }
    
    
    
}
