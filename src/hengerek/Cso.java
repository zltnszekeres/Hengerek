
package hengerek;


public class Cso extends TomorHenger {
    private double falvast;

    public Cso(double falvast, double sugar, double magassag, double fajsuly) {
        super(sugar, magassag, fajsuly);
        this.falvast = falvast;
    }

    public Cso(double falvast, double sugar, double magassag) {
        this(falvast,sugar, magassag,1);
        
    }
    
    public double getFalvastagsag() {
        return falvast;
    }
    
     @Override
   public double terfogat(){

    Henger segedHenger=new Henger(super.getSugar()-this.falvast, super.getMagassag());
       Henger.hengerDarabCsokkent();
        return super.terfogat()- segedHenger.terfogat();
    }

     @Override
    public String toString() {
        return "Cso{"+ "sugar=" + super.getSugar() + ", magassag=" + super.getMagassag()  + ", fajsuly=" + super.getFajsuly()  + ", falvastagsag=" + falvast + "}";
    }

   

    

   
    

    
    
    

}
