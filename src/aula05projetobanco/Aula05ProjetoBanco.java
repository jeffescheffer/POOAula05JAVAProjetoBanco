/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05projetobanco;

/**
 *
 * @author Jefferson
 */
public class Aula05ProjetoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(500);
        p1.sacar(100);
        p1.pagarMensal();
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");
        p2.depositar(700);
        p2.sacar(250);
        p2.sacar(150);
        p2.pagarMensal();
        
        
        p1.estadoAtual();
        System.out.println("-------------------------");
        p2.estadoAtual();
    }
    
}
