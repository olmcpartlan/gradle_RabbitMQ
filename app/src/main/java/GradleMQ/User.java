package GradleMQ;

import java.util.Random;
import java.util.UUID;


public class User {
    private String ID;
    private String FirstName;
    private String LastName;
    private String UserName;
    private String Email;
    private String PhoneNumber;
    private int Age;

    private String[] firstNames = new String[] { "John", "James", "Ryan", "Carol" };
    private String[] lastNames  = new String[] { "Doe", "Stevens", "Baskin", "Miller" };

    User() {
        Random rand = new Random();
        this.ID         = UUID.randomUUID().toString();
        // Create a random user name.
        this.FirstName  = firstNames[rand.nextInt(firstNames.length - 1)];
        this.LastName   = lastNames[rand.nextInt(lastNames.length - 1)];
        // If my name is Owen McPartlan, i want username to be o_mcpartlan.
        this.UserName   = (this.FirstName.toCharArray()[0] + "_" + this.LastName).toLowerCase();
        this.Email      = this.UserName + "@gmail.com";
        this.Age        = rand.nextInt(100);
    }

    public void printUser() {
      System.out.println(":: NEW USER ::");
      System.out.println("User Id "           + this.ID);
      System.out.println("UserName: "         + this.UserName);
      System.out.println("User First Name: "  + this.FirstName);
      System.out.println("User Last Name: "   + this.LastName);
      System.out.println("User Email"         + this.Email);
    }

    // GETTERS
    public String getID() {
      return ID;
    }

    public String getFirstName() {
      return FirstName;
    }

    public String getLastName() {
      return LastName;
    }

    public String getEmail() {
      return Email;
    }

    public String getPhoneNumber() {
      return PhoneNumber;
    }

    public int getAge() {
      return Age;
    }

    public String getUserName() {
      return UserName;
    }

    // SETTERS 

    // Phone number is the only field that isn't generated randomly.
    // Will need to prompt user for phone number.
    public void setPhoneNumber(String phoneNumber) {
      this.PhoneNumber = phoneNumber;
    }

}
