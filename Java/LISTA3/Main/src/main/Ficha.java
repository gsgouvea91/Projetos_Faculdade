package main;

import java.util.ArrayList;

public class Ficha 
{ 
    private String local;
    private String data;
    private String motivoConsulta;
    private Paciente paciente;

    public Ficha(){
     
    } 
    
    public String getLocal()        { return local; }
    public String getData()         { return data; }
    public String getMotDaCons()    { return motivoConsulta; }
    public Paciente getPac()        { return paciente; }
    //public Perguntas getPerguntas() { return perguntas; }
    
    public void setLocal(String local)            { this.local = local; }
    public void setData(String data)              { this.data = data; }
    public void setMotDaCons(String motDaCons)    { this.motivoConsulta = motDaCons; }
    public void setPaciente(Paciente paciente)              { this.paciente = paciente; }
    //public void setPerguntas(Perguntas perguntas) { this.perguntas = perguntas; }
}
