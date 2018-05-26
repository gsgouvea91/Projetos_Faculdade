
package hotel;

public class Main {

    public static void main(String[] args) {
        Hotel h = new Hotel(200);
      Cliente c = new Cliente();
              c.setNome("Joao");
              
        System.out.println(h.checkIn(c));
        System.out.println(h.checkIn(c));
        System.out.println(h.checkIn(c));
        
        h.checkOut(101);
        h.checkOut(101);
        
        System.out.println(h.checkIn(c));
        System.out.println(h.checkIn(c));
                    
    }
    
}
