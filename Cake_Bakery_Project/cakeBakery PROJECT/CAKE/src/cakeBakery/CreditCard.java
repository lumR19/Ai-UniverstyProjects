package cakeBakery;

/**
 *
 * @author 
 */

//it's a child of class paymaent
public class CreditCard extends Payment  {
 //Decalre all instance variables 
 private String cardNumber ;// field store the number of the card
 private int expirationYear; // field store the expiration year of the card
 private int expirationMonth ;// field store the expiration month of the card
 private String cvv ;// field store the cvv number of the card
 

 // no-arg constructor
 public CreditCard(){
 
 };
 
// parameterized constructor
     public CreditCard(String cardNumber,int expirationYear, int expirationMonth, String cvv ){
     this.cardNumber=cardNumber;
     this.expirationYear=expirationYear;
     this.expirationYear= expirationYear;
     this.cvv=cvv;
     }
//method validate the Card Number
public boolean validateCardNumber (String cardNumber){
    if ((cardNumber.length()%16) == 0){
       return true;  
    }
    else{
        return false;
    }
}

//method validate the cvv number
public boolean validateCvv ( String cvv){
    if(cvv.length()==3){
      return true; 
    }
    else{
      return false;  
    }
}
//method validate the expiration Year 
public  boolean validateExpirationYear (int expirationYear){
if (expirationYear > 2023){
  return true;  
}
else{
  return false;  
}
}
//method validate the Expiration Month
public  boolean validateExpirationMonth(int expirationMonth){
if(expirationMonth>=1 && expirationMonth<=12 ){
  return true;  
}
else{
  return false; 
}

}
// setter for card name
public void setCardNumber(String cardNum ){
this.cardNumber=cardNum;
}
// setter for Expiration Year
public void setExpirationYear (int expYr){
this.expirationYear=expYr;
}
// setter for Expiration Month
public void setExpirationMonth(int expMn){
this.expirationYear= expMn;
}
// setter for Cvv number
public void setCvv(String cvv ){
this.cvv=cvv;
}
//getter for Card Number
public String getCardNumber (){
return this.cardNumber;
        
}
//getter for Expiration Year
public int getExpirationYear (){
return this.expirationYear;
}
//getter for Expiration Month
public int getExpirationMonth (){
return this.expirationMonth;
}
//getter for cvv number
public String getCvv (){
return this.cvv;
}
}
