
package main;

public class Main {

    public static void main(String[] args) {
       Ficha ficha = new Ficha();
       Paciente paciente = new Paciente();
       paciente.setNome("xuaum");
      
       paciente.criarPerguntas(2);
       ficha.setPaciente(paciente);
       ficha.getPac().perguntarSequencialmente();
           
       System.out.println(ficha.getPac().getListaPerguntas().pop(1).getDescricao());
       
       Ficha ficha1 = new Ficha();
       Paciente paciente1 = new Paciente();
       paciente1.setNome("JoJo");
       ficha1.setPaciente(paciente1);
       
       ficha1.getPac().setListaPerguntas(ficha.getPac().getListaPerguntas());
       ficha1.getPac().perguntarSequencialmente();
       
       
      
    }
    
}
