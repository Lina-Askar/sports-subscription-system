package com.mycompany.Project;


public class Subscription implements Payable{
    private final int ID;
    private Date date;
    private Client client;
    private Payment payment;
    private int months;
    private String status;
    
    public Subscription(int ID){ 
        this(null,null,null,0);
    
    }
    
    public Subscription(Date date,Client client,Payment payment,int months){
        this.ID=generateId();
        this.date=date;
        this.client=client;
        this.payment=payment;
        this.months=months;
       
    }
    
    private int generateId() {
        int num = (int) (1000 + Math.random() + 1);
        return num;     }
    
    // ----- SETTERS AND GETTERS ----- //
    public int getID() {
        return ID;                  }

    public Date getDate() {
        return date;                }
    public void setDate(Date date) {
        this.date = date;           }
    public Client getClient() {
        return client;              }
    public void setClient(Client client) {
        this.client = client;       }
    public Payment getPayment() {
        return payment;             }
    public void setPayment(Payment payment) {
        this.payment = payment;     }
    public int getMonths() {
        return months;              }
    public void setMonths(int months) {
        this.months = months;       }
    public String getStatus() {
        return status;              }
    public void setStatus(String status) {
        this.status = status;       }
    // ----- END SET / GET ------ //
   
    @Override
    public double CalcPayment() {
        double price;
        if (getMonths() == 1) {
            price = 40;
        } else if (getMonths() >= 2 && getMonths() <= 3) {
            price = 60;
        } else {
            price = 100;    }
        return ((price*getMonths())+(price*getMonths()*VAT));
    }

    @Override
    public void pay(double amount) {
        if (amount == CalcPayment()){
            System.out.println("Payment complete. No change.");
            setStatus("Active");
        } else if (amount > CalcPayment()){
            System.out.println("Payment complete. Change: "+(amount-CalcPayment())+"SAR");
            setStatus("Active");
        } else {
            System.out.println("Payment incomplete. Insuffcient amount.");
            setStatus("Inactive");      }
    }
    
    public final void print() {
        System.out.println("* Subscription Info *");
        System.out.println("Subscription Id: " + getID());
        System.out.println("Subscription Client: " + getClient());
        System.out.println("Subscription Date: " + getDate());
        System.out.println("Months: " + getMonths());
        System.out.println("Subscription Payment:\n " + getPayment());
        System.out.println("Subscription Status: " + getStatus());
        System.out.printf("Total: %.2f SAR\n", CalcPayment());
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nClient: %s\nStatus: %s", getID(), getClient(), getStatus());
    }
}