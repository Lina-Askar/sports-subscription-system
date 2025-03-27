
package com.mycompany.Project;


public final class Client extends Person{
    private int PhoneNumber;
    private String Password;

    public Client() {
        
    }

    public Client(int PhoneNumber, String Password, int ID, String name) {
        super(ID, name);
        this.PhoneNumber = PhoneNumber;
        this.Password = Password;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    @Override
    public String toString(){
        return String.format("%sPhoneNumber: %d%nPassword: %s ",super.toString(),getPhoneNumber(),getPassword() );
    }
}