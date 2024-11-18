package cakeBakery;
/**
 *
 * @author 
 */
//it's a child of class paymaent
public class Cash extends Payment{
    private String DayOfReceived ; // the day that Customer chose to receive the cake
    public final String Location = "Cake bakery in Alawali"; // the adress that a customer come to receive the cake
    
    // no-arg Constructor
     public Cash(){
     
     } 
     
     // Constructor takes one parameters
     public Cash(String dayofreceived ){
        this.DayOfReceived = dayofreceived;
     }
    
     //methode set to store the day that the customer chose
     public void setDayOfReceived(String Day)
   {
      this.DayOfReceived=Day;
   }

     
    //methode get to return the day that the customer chose
     public String getDayOfReceived()
   {
      return DayOfReceived; 
   }
     
    /**
     *
     * @return
     */
    @Override
      public String toString(){
       // method that return a String indicating the objects location 
       return "We are preparing your order and here is our location: "+Location+" do not forget to pick up your order!.\n"+"*********************************\n";
   }
      
}


