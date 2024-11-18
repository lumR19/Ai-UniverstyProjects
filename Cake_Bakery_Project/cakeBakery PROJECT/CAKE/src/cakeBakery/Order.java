package cakeBakery;
/**
 *
 * @author 
 */
public class Order {
   private Payment payment; // this feild store information about payment 
   private Cake newCake; // this feild store information about cake like flavour and size...
   public static final int numberOfCake = 1; // final feild that number of cake always equal 1
   
   // constructor with no-arg
   public Order(){}
   
   // parameterized constructor
   public Order(Payment payment, Cake newCake){
       this.payment = payment.copy();
       this.newCake = newCake;
   }
   // constructor take one parameter
    public Order(Cake newCake){
       this.newCake = newCake;
   }

   // set method, that store object of type Payment
   public void setPayment (Payment payment){
       this.payment = payment.copy();
   }
   
   // get method, that return object of type Payment
   public String getPayment(){
       return payment.toString();
   }
   
   // set method, that store object of type Cake
   public void setNewCake (Cake newCake){
       this.newCake = newCake;
   }
   
   // get method, that return object of type Cake
   public Cake gatNewCake(){
       return newCake;
   }

   // toString method, that override the implemntation and print all feild in class order
    /**
     *
     * @return
     */
    @Override
   public String toString(){
       String star ="*********************************";
       return  newCake+"\n"+star+"\n"+"payment info:\n" + payment.toString()+"\n"+star;
   }
   
   // copy method, when we creat a new obj it copy the reference not the obj itself
   public Order copy (){
       Order order = new Order();
       order.newCake =newCake; 
       order.payment = payment;
       return(order);
   }
}
