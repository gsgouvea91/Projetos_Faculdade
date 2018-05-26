package ex;

public class Main {

    public static void main(String[] args) {
    ContaBancaria c = new ContaBancaria(111,1234,"LaLeLi",500,5000);
    Endereco end = new Endereco("Rua Piriquito","177","","Bairro Joca","SJC","SP","Brasil");
    RG rg = new RG();
    rg.setRegistroGeral("444444444");
    rg.setDataExpedicao("01/08/2009");
    rg.setDataNascimento("01/09/1989");
    rg.setNome("Maria");
    rg.setNomeMae("Silvia");
    rg.setNomePai("Joao");
    rg.setNaturalidade("Brasileira");
    
    Cliente c1 = new Cliente(10,rg,end,"01/08/1988",10388599);
    
    c.setCliente(c1);
 
    //e lanco o objeto preenchido dentro do SET_RG o tornado o rg deste cliente.
    
    c.debito(1000, 111, 1234, "LaLeLi");
    c.saque(1000, 111, 1234, "LaLeLi");
    c.debito(1000, 111, 1234, "LaLeLi");
    c.debito(1000, 111, 1234, "LaLeLi");
    c.debito(1000, 111, 1234, "LaLeLi");
    c.saque(999, 111, 1234, "LaLeLi");
    c.saque(1, 111, 1234, "LaLeLi");
    System.out.println();
    System.out.println("Saldo: "+c.verSaldo());
    System.out.println("ChEsp: "+c.verValorChequeESP());
    System.out.println("LimChEsp: "+c.verLimChequeESP());
    System.out.println();
    c.deposito(6000);
    System.out.println();
    System.out.println("Saldo: "+c.verSaldo());
    System.out.println("ChEsp: "+c.verValorChequeESP());
    System.out.println("LimChEsp: "+c.verLimChequeESP());
    System.out.println();
    c.deposito(3000);
    System.out.println();
    System.out.println("Saldo: "+c.verSaldo());
    System.out.println("ChEsp: "+c.verValorChequeESP());
    System.out.println("LimChEsp:"+c.verLimChequeESP());
    System.out.println();
    c.debito(1000, 111, 1234, "LaLeLi");
    c.saque(1000, 111, 1234, "LaLeLi");
    c.debito(1000, 111, 1234, "LaLeLi");
    c.debito(1000, 111, 1234, "LaLeLi");
    c.debito(1000, 111, 1234, "LaLeLi");
    System.out.println();
    System.out.println("Saldo: "+c.verSaldo());
    System.out.println("ChEsp: "+c.verValorChequeESP());
    System.out.println("LimChEsp:"+c.verLimChequeESP());
}
}
