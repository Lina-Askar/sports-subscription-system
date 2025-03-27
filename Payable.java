package com.mycompany.Project;

public interface Payable {

    public static final double VAT = 0.15;

    public abstract double CalcPayment();

    public abstract void pay(double amount);

}
