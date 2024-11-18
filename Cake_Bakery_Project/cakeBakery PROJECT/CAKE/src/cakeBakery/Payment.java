package cakeBakery;

/**
 *
 * @author 
 */
public class Payment {
// this variable detrmain if the payment is by card or cash   
private String paymentMethod;
// this variable defines the tax value   
private static final double CHARGE=0.15;
// calculateb the total cost of the cake with tax
private double totalCost;

//no-arg Constructor
    public Payment() {
    }
//Constructor with one parameter 
    public Payment(String paymentMethod){
        this.paymentMethod=paymentMethod;
        this.totalCost = 0.0;
    }
//method that store paymentMethod
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
//getter that return paymentMethod of type String 
    public String getPaymentMethod() {
        return paymentMethod;
    }
//method that calculate the cost with the charge
    public void calculateCost(Double cost){
       double z = cost * CHARGE;
     this.totalCost = z + cost;
 
    }
    //getter that return the total cost
    public double getTotalCost(){
        return totalCost;
    }
//A method creates a new object and copy the fields one by one   
    public Payment copy(){
     Payment d = new Payment();
     d.paymentMethod=paymentMethod;
     //d.paymentCost=paymentCost;  
     d.totalCost = totalCost;
     return d;
    }
    
    
//method that return a String indicating the objects paymentMethod and paymentCost   

    /**
     *
     * @return
     */
@Override
    public String toString(){
     
     return "the paymentMethod: " + paymentMethod + "\nthe total cost with 15% tax is: "+totalCost+"SR";        
    }
    
}
