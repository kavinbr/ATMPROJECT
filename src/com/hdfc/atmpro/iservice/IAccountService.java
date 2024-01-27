package com.hdfc.atmpro.iservice;

public interface IAccountService {
    public boolean deposit(Integer amount);
    public boolean withdraw(Integer amount);
    public  Integer getBalance();
}
