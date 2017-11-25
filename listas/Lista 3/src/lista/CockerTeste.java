/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import javax.swing.JOptionPane;

/**
 *
 * @author adilson
 */
public class CockerTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // clase para testar as funcionalidades
        Cocker c = new Cocker();
        
        c.setNome((JOptionPane.showInputDialog("Qual o nome do cachorro?")));
        c.setRaca((JOptionPane.showInputDialog("Qual a raça do cachorro?")));
        c.setCor((JOptionPane.showInputDialog("Qual a cor do cachorro?")));
        c.setTipo((JOptionPane.showInputDialog("Qual o tipo do cachorro?")));
        System.out.println("------------------------");
        System.out.println("DADOS SOBRE O CACHORRO");
        System.out.println("------------------------");
        System.out.println(c.getNome());
        System.out.println(c.getRaca());
        System.out.println(c.getCor());
        System.out.println(c.getTipo());
        c.precisaTosa();
        
    }
    
}
