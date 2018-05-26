package ex;

public class ContaBancaria {
    
    private Cliente Cliente; //Usando classe cliente do exercicio 3 
    private int contaNUM;
    private int senhaNUM;
    private String senhaLET;
    private double saldo;
    private double chequeESP;
    private double chequeESPLIM; 

    public ContaBancaria(int conta, int senha1, String senha2, double saldo1, double chequeElim ) {
        
        this.contaNUM=conta;
        this.senhaNUM=senha1;
        this.senhaLET=senha2;
        this.saldo = saldo1;
        this.chequeESPLIM = chequeElim;
    }
    
    public void setCliente(Cliente cliente){this.Cliente=cliente;}
    
    public double verSaldo(){return saldo;};
    public double verValorChequeESP(){
        if(chequeESP != 0){
        return chequeESP*-1;
        }else{return chequeESP;}};
    public double verLimChequeESP(){return chequeESPLIM;};
    
    private int validaConta(int conta, int senhaN, String senhal){
        if(conta == contaNUM && senhaN == senhaNUM && senhal.equals(senhaLET)){
            return 1;
        } else {
            return 0;
        }  
    }
    
    public void saque (int valor, int conta, int senha, String senhal){     
     if (validaConta(conta,senha,senhal) == 1){
        
        if((valor > 1500) || (chequeESP+valor) >= (chequeESPLIM)){
            System.out.println("SAQUE NAO AUTORIZADO");
        }else if (valor > saldo && chequeESP < chequeESPLIM) {
                   
                    if(saldo > 0){
                    double dif = this.saldo - valor;
                    this.chequeESP = this.chequeESP + valor + dif;
                    this.saldo=0;
                    System.out.println("VOCE SACOU: R$"+ valor);
                    } else{
                    this.chequeESP = this.chequeESP + valor;
                    System.out.println("VOCE SACOU: R$"+ valor);
                    }
                    
                } else {
                       this.saldo = this.saldo - valor;
                       System.out.println("VOCE SACOU: R$"+ valor);
                       }
        } else {
            System.out.println("OPERACAO NAO AUTORIZADA");
        }
    }
    
  public void debito (int valor, int conta, int senha, String senhal){
     if (validaConta(conta,senha,senhal) == 1){ 
        if((valor > 1500) || (chequeESP+valor) >= (chequeESPLIM)){
            System.out.println("Debito NAO AUTORIZADO");
        }else if (valor > saldo && chequeESP < chequeESPLIM) {
                    this.chequeESP = this.chequeESP + valor;
                    System.out.println("Foi debitado: R$"+ valor);
                } else {
                       this.saldo = this.saldo - valor;
                       System.out.println("Foi debitado: R$"+ valor);
                       }
        } else {
            System.out.println("OPERACAO NAO AUTORIZADA");
        }
    }
     
    public void deposito (int valor){
        double dif =0;
        if (saldo==0 && chequeESP > 0){
         
                if (saldo==0 && chequeESP-valor <= 0){
                       dif = this.chequeESP - valor;
                       this.chequeESP = 0;
                       dif = Math.abs(dif);
                       this.saldo = saldo + dif;
                       System.out.println("Foi depositado 2: R$"+ valor);
                   } else {
                    
                    this.chequeESP = this.chequeESP - valor;
                    System.out.println("Foi depositado 1: R$"+ valor);                
                   }
                
            } else {
                this.saldo = this.saldo+ valor;
                System.out.println("Foi depositado 3: R$"+ valor);
            }  
    }
}
