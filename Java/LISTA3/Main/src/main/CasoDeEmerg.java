package main;

public class CasoDeEmerg {

    private String nome;
    private String nomeMedico;
    private String telMedico;
    private String telNome;
    private String convenio;
    private String hospital;
    
    public String getNome()         { return nome; }
    public String getNomeMedico()   { return nomeMedico; }
    public String getTelMedico()    { return telMedico; }
    public String getTelNome()      { return telNome; }
    public String getConvenio()     { return convenio; }
    public String getHospital()     { return hospital; }

    public void setNome(String nome)             { this.nome = nome; }
    public void setNomeMedico(String nomeMedico) { this.nomeMedico = nomeMedico; }
    public void setTelMedico(String telMedico)   { this.telMedico = telMedico; }
    public void setTelNome(String telNome)       { this.telNome = telNome; }
    public void setConvenio(String convenio)     { this.convenio = convenio; }
    public void setHospital(String hospital)     { this.hospital = hospital; }

}
