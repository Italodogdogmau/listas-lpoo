/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.Scanner;

/**
 *
 * @author Vinícius
 */
public class GerarAluguel {
     Cliente cliente;
    Automovel automovel;
    Diaria diaria;
    Mensal mensal;
    private int tipoAluguel;
    Object aluguelAutomovel;
    
     
    Scanner sc1 = new Scanner(System.in);
    
    public Object tipoDeAluguel(){
        System.out.println("Digite 1 para aluguel Mensal ou 2 para aluguel diário: ");
        tipoAluguel = sc1.nextInt();
        if(tipoAluguel == 1)
            aluguelAutomovel = new Mensal(); 
        else if(tipoAluguel == 2)
            aluguelAutomovel = new Diaria();     
        else
            System.out.println("Aluguel inválido");
        return aluguelAutomovel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Diaria getDiaria() {
        return diaria;
    }

    public void setDiaria(Diaria diaria) {
        this.diaria = diaria;
    }

    public Mensal getMensal() {
        return mensal;
    }

    public void setMensal(Mensal mensal) {
        this.mensal = mensal;
    }

    public Object getAluguelAutomovel() {
        return aluguelAutomovel;
    }

    public void setAluguelAutomovel(Object aluguelAutomovel) {
        this.aluguelAutomovel = aluguelAutomovel;
    }
}
