package cakeBakery;
/**
 *
 * @author 
 */
public class Cake { 
 
  private String cakeName ; // variable to store the cake name 
  private String cakeFlavour ; // vriable to store the flavour of every cake 
  private int cakeId ; // to store cake id  
  private int cakeSize ;// the cake size in inch like 6 , 12
  private  double cakeCalories ; // to show the calories of the cake
  private  double cost ; // the current cost of the cake  
  
 //no arg constructor 
 public Cake (){} 
 
 //constructor take param (name , ID ,calories , cost , flavour, size)and initialize them to their fields 
 public Cake (String name, int id, double calories, double aCost, String flavour, int size){ 
 cakeName=name ; 
 cakeId=id; 
 cakeCalories =calories; 
 cost=aCost; 
 cakeFlavour=flavour; 
 cakeSize=size; 
 } 
 
 //consructor take flavour and size as param
 public Cake (String flavour, int size){ 
 cakeFlavour = flavour; 
 cakeSize = size; 
 } 
 
 //setter method, sets the cakeName attribute , param name of the cake 
  public void setCakeName(String name){ 
    cakeName =name ; 
 } 
 
// return cake name as string  
  public String getCakeName(){ 
 
   return cakeName ; 
 } 

//setter method, sets the cakeId attribute , param id of the cake 
 public void setCakeId(int id){ 
 
    cakeId =id ; 
 } 
  
  //return cakeId as int 
  public int getCakeId(){
    return cakeId;  
 } 
 
  //setter method, sets the cakeCalories attribute , param calories of the cake 
 public void setCakeCalories(double calories){ 
    cakeCalories= calories ; 
 } 
 
  //return cake calories as int 
  public double getCakeCalories(){ 
    return cakeCalories ; 
 } 
 
  //setter method, sets the cakeFlavour attribute , param flavour of the cake 
 public void setCakeFlavour(String flavour){ 
    cakeFlavour= flavour ; 
 } 
 
 //return cake flavour as string 
 public String getCakeFlavour(){ 
    return cakeFlavour ; 
 } 
 
  //setter method, sets the cakeSize attribute , param size of the cake 
 public void setCakeSize(int size){ 
    cakeSize= size ; 
 } 
 
  //return the cake size as int 
 public int getCakeSize(){ 
    return cakeSize ; 
 } 
  
  //setter method, sets the cake cost attribute , param cost of the cake 
 public void setCost(int costt){ 
    cost = costt ; 
 } 
 
 //return cost cake as double 
 public double getCost(){ 
    return cost ; 
 } 
 
// toString method, that override the implemntation and print all feild in class order 
    /**
     *
     * @return
     */
    @Override
    //toString method, that override the implemntation and print all feild in class order
 public String toString() 
 { 
   return("  "+"["+cakeId+"]"+" cake name: "+cakeName+",  "+
           " cake Flavour: " +cakeFlavour+",  "+
           " cakeSize: "+cakeSize+" inch"+",  "+
           " cake Calories:"+cakeCalories+",  "+
           " cost: " +cost+"SR"+"\n") ; 
 
 } 
 // copy method, when we creat a new obj it copy the reference not the obj itself
public Cake copy(){
    Cake cake2 = new Cake();
    cake2.cakeCalories = cakeCalories;
    cake2.cakeFlavour = cakeFlavour ;
    cake2.cakeId =cakeId ;
    cake2.cakeName=cakeName;
    cake2.cakeSize=cakeSize;
    cake2.cost=cost ;
    return (cake2) ;
}
 
}

