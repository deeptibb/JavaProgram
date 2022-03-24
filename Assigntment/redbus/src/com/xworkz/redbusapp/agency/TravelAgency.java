package com.xworkz.redbusapp.agency;

import com.xworkz.redbusapp.agency.contract.RedBusContract1;

public class TravelAgency {
	// has-a relation
	RedBusContract1 redBusContract;
	static String name = "Sri ShriShail travel agency";
	
	public TravelAgency(RedBusContract1 redBusContract ) {
		super();
		this.redBusContract = redBusContract;
	}
	public boolean booking (int noOfBookings) {
		boolean booking = false;
		System.out.println("inside booking() ");
		boolean warrenty= redBusContract.warrenty();
       
		if(warrenty) {
		System.out.println("checked warrenty ...");
		if(noOfBookings <= redBusContract.miniBooking()) {
			
			this.redBusContract = redBusContract;
			System.out.println("booking successful");
			booking = true;
			}
		else {
		
				System.out.println("booking crossed limit");
			}
		}
		     System.out.println("end of booking()");
	 return warrenty;
	}
}
