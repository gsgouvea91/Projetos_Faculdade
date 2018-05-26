
package aula;

public class RG {
     public String rg;
     public String uf;
     public String venc;
     public String mae;
     public String pai;
     
     RG(String rg, String uf, String mae, String pai)
     {
         this.rg = rg;
         this.uf = uf;
         this.mae = mae;
         this.pai = pai;
     }
 
     public void jogaMae(String mae)
     {
      this.mae = mae;
     }
}
