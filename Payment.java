
package com.mycompany.Project;


public class Payment {
  private String userName;
    private String type;

    public Payment() {
        
    }

    public Payment(String userName, String type) {
        setUserName(userName);
        setType(type);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("User Name: %s\nPayment Type: %s", getUserName(), getType());
    }
  
}