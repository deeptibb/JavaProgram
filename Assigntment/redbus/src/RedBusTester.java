import com.xworkz.redbusapp.agency.TravelAgency;
import com.xworkz.redbusapp.agency.contract.RedBusContract1;
import com.xworkz.redbusapp.agency.contract.SrsImpl;

public class RedBusTester {
	
	public static void main(String[] args) {
		
		RedBusContract1 redBusContract = new SrsImpl();
		
		TravelAgency agency = new TravelAgency(redBusContract); 
		
		agency.booking(21);
		
		}
	}

