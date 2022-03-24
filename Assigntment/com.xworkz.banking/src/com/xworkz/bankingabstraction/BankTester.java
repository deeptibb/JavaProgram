package com.xworkz.bankingabstraction;

public class BankTester {
	
	public static void main(String[] args) {
		
		Bank bank1=BankFactory.getBank("kvgbank");
		if(bank1 != null) {
			bank1.swipe();
		}
	
		Bank bank2=new KvgBankImpl();
		bank2.swipe();
		
		Bank bank3=new IcicBankImpl();
        bank3.swipe();
        
       Bank bank4=new SbiBankImpl();
        bank4.swipe();
        
        Bank bank5=new CorporationBankImpl();
        bank5.swipe();
	}
        
}

