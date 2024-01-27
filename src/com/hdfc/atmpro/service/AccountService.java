package com.hdfc.atmpro.service;

import com.hdfc.atmpro.iservice.IAccountService;

public class AccountService implements IAccountService {
    private static Integer balance =1000;
    @Override
    public boolean deposit(Integer amount) {
        boolean isDeposited = false;
        try{
            this.balance+=amount;
            isDeposited=true;
        }catch (Exception ex){
            System.out.println("Exception raised while depositing the amount:" +ex.getMessage());

        }
        return isDeposited;
    }

    @Override
    public boolean withdraw(Integer amount) {
        boolean isDeducted = false;
        try{
            this.balance-=amount;
            isDeducted=true;
        }catch (Exception ex){
            System.out.println("Exception raised while deducting the amount:" +ex.getMessage());

        }
        return isDeducted;
    }

    @Override
    public Integer getBalance() {
        return this.balance;
    }
}
