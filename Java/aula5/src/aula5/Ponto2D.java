
package aula5;

public class Ponto2D {
    private double x;
    private double y;
    
    Ponto2D(){
         System.out.println("Construtor vazio");
    }
    
    Ponto2D(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("Construtor int");
    }
    Ponto2D(float x, float y){
        this.x=x;
        this.y=y;
        System.out.println("Construtor float");
    }
    
    Ponto2D(double x, double y){ 
        this.x=x;
        this.y=y;
        System.out.println("Construtor double");
    }
    
    /////GETTER SETTER////
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    /////////////////////
    
    public double calcularDistancia(Ponto2D p1, Ponto2D p2){
  
        return Math.sqrt (Math.pow(p1.y - p1.x,2)+ Math.pow(p2.y - p2.x,2));
    }
    
     public double calcularDistancia(double x1,double x2, double y1, double y2){

         return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
    }
    
    
}
