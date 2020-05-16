package domain;

/**
 * @author sahil
 * @version 1.0
 * @created 02-Apr-2020 8:30:00am
 */
public abstract class Hospital extends Property{
	private String status;
	private String facilities;
	private int NoOfFloors;
	private static final double CIV_RATE = 0.0035;
	private static final double INUDSTRIAL_WASTE_DISPOSAL_UNITS = 4;
	private static final double INUDSTRIAL_WASTE_DISPOSAL_FEES = 500.00;
	private static final double FIRE_SERVICES_BASE = 200;
	private static final double FIRE_SERVICES_PERCENT = 0.00006;
	private ServiceType industrialWasteDisposal;
	private ServiceType fireServicesLevy;

	public Hospital() {
		super();
		// We are explicit about our defaults for Strings
		this.setStatus(NOT_AVAILABLE);
		this.setFacilities(NOT_AVAILABLE);
		this.setNoOfFloors(NOT_AVAILABLE);
		setCapitalImprovedRate(CIV_RATE);

	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getFacilities() {
		return facilities;
	}
	
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public int getNoOfFloors() {
		return NoOfFloors;
	}
	
	public void setNoOfFloors(String noOfFloors) {
		this.NoOfFloors = NoOfFloors;
	}
	
	@Override
	public double CalculateExtraServices() {
		return industrialWasteDisposal.calculateChargeForServiceType() +
				fireServicesLevy.calculateChargeForServiceType();
	}
	
	@Override
	public String toString() {
		return super.toString() + this.getClass().getSimpleName() + "[\n" + 
																industrialWasteDisposal.toString() + "\n" + 
																fireServicesLevy.toString() + "]\n";
	}
}

