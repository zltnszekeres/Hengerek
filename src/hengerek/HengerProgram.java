
package hengerek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HengerProgram {
    
    private List<Henger> hengerek;

    public HengerProgram() {
        
        
        
        hengerek=new ArrayList<>();
        hengerek.add(new Henger(5, 10));
        hengerek.add(new TomorHenger(2, 6));
        hengerek.add(new TomorHenger(4, 8, 4.2));
        hengerek.add(new Cso(2.9, 7.7, 8.8, 4.3));
    }
    
    
    private double atlagTerfogat(){
    
    double osszeg = 0;
        for (Henger henger : lista()) {
            osszeg += henger.terfogat();
        }
        return osszeg / Henger.getHengerDb();
    }
    
    private double csovekSulya(){
    
     double suly = 0;
        for (Henger cso : lista()) {
            if (cso instanceof Cso) {
                suly += ((Cso) cso).suly();
            }
        }
        return suly;
    }
    
      private List<Henger> lista() {
        return Collections.unmodifiableList(hengerek);
    }
      
      
      public void run(){
          
           System.out.println("Atlag terfogat="+atlagTerfogat());
        System.out.println("Csovek sulya="+csovekSulya());
        
        System.out.println("Hengerek lista:");
        for(int i=0; i<Henger.getHengerDb();i++){
            System.out.println(lista().get(i));
      }
}
      
}
