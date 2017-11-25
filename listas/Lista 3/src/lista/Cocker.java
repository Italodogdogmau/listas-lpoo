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
public class Cocker extends Cachorro {
    
    private boolean tosa;
    
    

    public Cocker() {
    }

    public Cocker(boolean tosa, String nome, String raca, String cor, String tipo) {
        super(nome, raca, cor, tipo);
        this.tosa = tosa;
    }

    public boolean getTosa() {
        return tosa;
    }
   
    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    
    public void precisaTosa(){
       
       JOptionPane.showInputDialog(null, tosa);
        if(tosa==true){
            System.out.println("Precisa de tosa");
        }else{
            System.out.println("Não precisa de tosa");  
        }
    
    
}
}
