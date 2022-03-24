package com.xworkz.bankingabstraction;

public class BankFactory {

	public static Bank getBank(String type) {
		
		if(type.equalsIgnoreCase("kvgbank"))  {
			  return new KvgBankImpl();
			  
		}
		
		else if(type.equalsIgnoreCase("icicbank")) {
			return new IcicBankImpl();
		}
		
		else if(type.equalsIgnoreCase("sbibank")) {
			return new SbiBankImpl();
			
		}
		
		else if(type.equalsIgnoreCase("corporationbank")) {
			return new CorporationBankImpl();
		}
		
		else {
			   System.out.println("Bank not found");
		}
		return null;
		
	}
}
	