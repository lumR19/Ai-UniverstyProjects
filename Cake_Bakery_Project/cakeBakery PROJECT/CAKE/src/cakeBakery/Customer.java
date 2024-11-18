package cakeBakery;

/**
 *
 * @author 
 */
public class Customer {
    private String name; // customer name
    private String contactNumber; // customer contact number
    private String email; // customer email address
    private Order order; // customer order
    
    // constructor with no-arg
    public Customer(){
        
    }
    
    // parameterized constructor
    public Customer(String name, String contactNumber, String email, Order order) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        // creates a copy of the provided order object and sets it as the customer order
        this.order = order.copy();
    }
    
    // setter for customer name
    public void setName(String name) {
        this.name = name;
    }

    // setter for customer contact number
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    // setter for customer email address
    public void setEmail(String email) {
        this.email = email;
    }

    // setter for customer order
    public void setOrder(Order order){
        // creates a copy of the provided order object and sets it as the customer order 
        this.order = order.copy();
    }

    // getter for customer name
    public String getName() {
        return name;
    }
    
    // getter for customer contact number
    public String getContactNumber() {
        return contactNumber;
    }
    
    // getter for customer email address
    public String getEmail() {
        return email;
    }

    // getter for customer order
    public String getOrder(){
        //A String containing information about the customer as a string
        return order.toString();
    }
    
    //Information about the customer.

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        // returns a string containing customer name, contact number, email address, and order information
        return "Name: " + name + "\n"+"Contact number: " + contactNumber + "\n"+"Email: " + email + "\n"+"Order Information: " + order.toString();
    }
}