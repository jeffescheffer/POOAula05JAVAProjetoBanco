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
public final class ContaBanco {
    
    //Atributos
    public int  numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos
    
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo() != 0) {
            System.out.println("A conta deve ser zerada para o fechamento");
        }else {
                this.setStatus(false);
                System.out.println("Sua conta foi fechada");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso");
            System.out.println("Seu saldo é " + this.getSaldo() + ",00");
        } else {
            System.out.println("Conta fechada");
        }
        
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado com sucesso");
            System.out.println("Seu saldo é " + this.getSaldo() + ",00");
        } else {
            System.out.println("Não existe saldo suficiente");
        }
    }else {
                System.out.println("Conta fechada");
                }
    }
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;            
        } else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");           
        }else{
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
    
    //Métodos especiais

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
