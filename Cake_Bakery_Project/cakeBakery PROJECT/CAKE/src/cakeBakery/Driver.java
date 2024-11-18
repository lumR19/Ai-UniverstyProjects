package cakeBakery;
import java.util.ArrayList;  // importing the ArrayList class
import java.util.Scanner; //importing the Scanner class
import java.io.FileNotFoundException;// importing the FileNotFoundException
import java.io.File; // importing the File class
import java.io.PrintWriter;// Importing the printWriter class
/**
 *
 * @author 
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    
    // method that show menu and take array list of cakes info as a prameter
    public static void showMenu(ArrayList<Cake> cakesInfo){
        // Creating an object from the class Scanner
        Scanner userIn = new Scanner(System.in);
        // Creating a file variabal of type String store the file name
        String file ="text.txt";
        // declaer scanner object and initialized it to null
        Scanner scanner =null;
        
      try{  
        // Creating new Scanner object  to read from the file
        scanner = new Scanner(new File(file));
        // Read the file lins one by one
        while(scanner.hasNextLine()){
            // Reading each line of the file and splitting it into parts based on the comma separator
            String line=scanner.nextLine();
            String[]parts=line.split(",");
            // Extracet each item into an appropriate variable
            String name = parts[0];
            int id =Integer.parseInt(parts[1].trim());
            double calories = Double.parseDouble(parts[2].trim());
            double cost = Double.parseDouble(parts[3].trim());
            String flavor =parts[4];
            int size= Integer.parseInt(parts[5].trim());
            // Creating new object from the Cake class 
            Cake cake =new Cake(name,id,calories,cost,flavor,size);
            // add the object to the arrayList
            cakesInfo.add(cake);
            
        }
        // close the Scanner after reading from the file
        scanner.close();
      }
      // Catching an exception if the file is not found
      catch(FileNotFoundException e){
          System.out.println(e.getMessage());
      }
      // print statment to print the cakesInfo
      System.out.println(cakesInfo);
    }
    
    // method take the id that user enterd as a prameter and return the index
    public static int chooseIndex(int id){
        // Creating an object from the class Scanner
        Scanner userIn = new Scanner(System.in);
        // Checking if the cake ID entered by the user is valid and converting it to the corresponding index in the cakesInfo ArrayList
        int index =0;
        boolean check = true;
        while (check){
        if(id>=101&&id<=110){
           switch(id){
            case 101:
                index = 0;
                break;
            case 102:
                index = 1;
                break;
            case 103 :
                index = 2;
                break;
            case 104 :
                index = 3;
                break;
            case 105 :
                index = 4;
                break;
            case 106 :
                index = 5;
                break;
            case 107 :
                index = 6;
                break;
            case 108 :
                index = 7;
                break;
            case 109 :
                index = 8;
                break;
            case 110 :
                index = 9;
                break;
                 } 
           check = false;
        }else{
            // Prompot the user to enter a valid cake ID
            System.out.println("Invalid number, please try againe:");
            id = userIn.nextInt();
        }
    }
        return index;
    }
    
    
    // method that take an object of order as a prameter and store the payment method in it and store customer info in file
    public static void customerInfo(Order order1){
        System.out.println("*********************************");
        // Creating an object from the class Scanner
        Scanner userIn = new Scanner(System.in);
        // Prompot the user to enter his name
        System.out.println("Enter your name: ");
        String name = userIn.nextLine();
        // Prompot the user to enter his phone number
        System.out.println("Enter your phone number: ");
        String phoneNum = userIn.nextLine();
        // Prompot the user to enter his Email
        System.out.println("Enter your email: ");
        String email = userIn.nextLine();
        
        System.out.println("*********************************");
        // Prompot the user to choose the payment method
        System.out.println("write payment method cash or credit card : ");
        String paymentWay = userIn.nextLine();
        // declare an object of type payment
        Payment d;
        // declare an object of type cash
        Cash pay;
        // declare an object of type creditCard
        CreditCard pay2;
        // if statment to check if the user enter "cash" or not ? if he enter cash the following code will be excuted
        if(paymentWay.equalsIgnoreCase("Cash")){
            // create an object of type payment
            d = new Payment(paymentWay);
            // Prompot the user to enter the day of received the cake
            System.out.println("Enter the day of received :");
            // store the day that user entered in day variable
            String day = userIn.next();
            System.out.println("*********************************");
            // create an object of type cash and pass day as a parameter to the constuctor
            pay = new Cash(day);
            // call calculate cost method and pass the cost of cake to it
            d.calculateCost(order1.gatNewCake().getCost());
            // print pay object of class cash to display the cash info 
            System.out.println(pay);
            // store payment method "cash" in object order
            order1.setPayment(d);
        }
        
        // Check if the payment method chosen by the customer is credit card
        else if(paymentWay.equalsIgnoreCase("credit card")){
        // Create a new CreditCard object 
        pay2 = new CreditCard();
        // create a new Payment object
        d = new Payment(paymentWay);
        // variable to hold the condition of loop "v=true"
        boolean v = true;
        // Use a while loop to keep asking the user to enter their credit card information until it is valid
        while(v){
            // Ask the user to enter their card number and validate it
            System.out.println("please enter your card number: ");
            String cardNum = userIn.nextLine();
            boolean  validateNum = pay2.validateCardNumber(cardNum);
            // Ask the user to enter their card expiration year and validate it
            System.out.println("please enter your card expiration year: ");
            int year = userIn.nextInt();
            boolean  validateYear = pay2.validateExpirationYear(year);
            // Ask the user to enter their card expiration month and validate it
            System.out.println("please enter your card expiration month: ");
            int month = userIn.nextInt();
            boolean  validateMonth = pay2.validateExpirationMonth(month);
            // Ask the user to enter their CVV number and validate it
            System.out.println("please enter your cvv number: ");
            userIn.nextLine();
            String cvv = userIn.nextLine();
            boolean  validateCvv = pay2.validateCvv(cvv);
            //Combine all the validation results and check if the card information is valid
            boolean v1=(validateNum && validateYear && validateMonth && validateCvv);
            // If the card information is valid, 
            if (v1){
                // set the card information to "pay2" obj credit card
                pay2.setCardNumber(cardNum);
                pay2.setExpirationYear(year);
                pay2.setExpirationMonth(month);
                pay2.setCvv(cvv);
                // calculate the cost,
                d.calculateCost(order1.gatNewCake().getCost());
                // set the payment for the order
                order1.setPayment(d);
                // Print a message to thank the user for their purchase 
                System.out.println("Now, We are preparing your order please wait our message. ");
                System.out.println("*********************************");
                // to exit the while loop change the condition "v=false" 
                v=false;
            }
            // If the card information is invalid, ask the user to check their information and try again
            else{
                System.out.println("please check your card information again:");
            }  
         } 
        System.out.println();
      }

        // Create a new Customer object with the customer's name, phone number, email, and order information
        Customer customer1 = new Customer(name, phoneNum,email ,order1);
        // Write the customer information to a file named "customerinfo.txt"
        String customerfile="customerinfo.txt";
        Scanner ip=null;    
        PrintWriter op=null;
    try {
        // Create a PrintWriter object to write to the file
        op= new PrintWriter ("customerinfo.txt");           
        // Create a Scanner object to read from the file
        ip = new Scanner (new File (customerfile));
        // Write the customer information to the file
        op.println(customer1);           
        // Print out the customer information that was just written to the file
            while (ip.hasNextLine()){
                String line =ip.nextLine();   
                System.out.println(line); 
            }        

         // Close the Scanner object
         ip.close();
         // Close the PrintWriter object
         op.close();        
    }
    // Catch any errors that occur when trying to write to the file and print an error message
    catch(FileNotFoundException e){
        System.out.println("cannot find file"+ customerfile);
    }
    // print the customer info
     System.out.println(customer1);
    }
    
    public static void main(String[] args) {
        // Creating an object from the class Scanner
        Scanner userIn = new Scanner(System.in);
         System.out.println("*********************************");
        // Printing a Welcome massage to the user
        System.out.println("\"Welcome to our CAKE BARKERY\"");
         System.out.println("*********************************");
        // Creating an A arraList to hold information about the Cake 
        ArrayList<Cake> cakesInfo = new ArrayList<Cake>();
        // Printing the list of available cakes to the user
        System.out.println("Here is our meneu: "+"\n");
        //call method showmenu to print cakes Information and pass arraylist cakesInfo to it;
        showMenu(cakesInfo);
        
        System.out.println("*********************************");
        // Prompot the user to choose the Cake by the Id Cake number
        System.out.println("please choose number of the cake that you want");
        int Id = userIn.nextInt();
        // Creating an Order object with the selected cake and call chooseIndex method and pass it to id of cake
        Order order1 = new Order(cakesInfo.get(chooseIndex(Id)));
        // calling customer method and pass order1 to it 
        customerInfo(order1);
        // print statment to thank the customer 
        System.out.println("THANH YOU FOR ORDERING FROM OUR CAKE BAKERY"+"\n"+"*********************************");
    
  }
    
}
