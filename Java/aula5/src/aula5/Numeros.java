
package aula5;

public class Numeros {
    private double x;
    private double y;
    
    Numeros()
    {
        
    }
    Numeros(int x, int y){
        this.x =x;
        this.y =y;
    }
    
    Numeros(double x, double y){
        this.x =x;
        this.y =y;
    }
     
    Numeros(float x, float y){
        this.x =x;
        this.y =y;
    }
    
    public double Soma(Numeros c1, Numeros c2)
    {
            return c1.x + c1.y + c2.x + c2.y;
    }
    
     public double Soma(Numeros c1)
    {
            return c1.x + c1.y;
    }
     
     
    public double Subtracao(Numeros c1, Numeros c2)
    {
            return c1.x - c1.y - c2.x - c2.y;
    }
    
     public double Subtracao(Numeros c1)
    {
            return c1.x - c1.y;
    }
     
      public double Divisao(Numeros c1, Numeros c2)
    {
            return c1.x / c1.y / c2.x / c2.y;
    }
    
     public double Divisao(Numeros c1)
    {
            return c1.x / c1.y;
    }
     
      public double Multiplicacao(Numeros c1, Numeros c2)
    {
            return c1.x * c1.y * c2.x * c2.y;
    }
    
     public double Multiplicacao(Numeros c1)
    {
            return c1.x * c1.x;
    }
    
}
