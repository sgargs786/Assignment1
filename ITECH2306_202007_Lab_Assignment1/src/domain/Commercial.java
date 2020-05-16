package domain;

/**
 * @author sahil
 * @version 1.0
 * @created 02-Apr-2020 8:30:00am
 */
	public abstract class Commercial extends Property{
		
		private String businessName;
		private String aBN;
		private static final double CIV_RATE = 0.0059;
		private static final double WASTE_MANAGEMENT_UNITS = 2;
		private static final double WASTE_MANAGEMENT_FEES = 350.00;
		private static final double FIRE_SERVICES_BASE = 200;
		private static final double FIRE_SERVICES_PERCENT = 0.00006;
		private ServiceType wasteManagement;
		private ServiceType fireServicesLevy;

		public Commercial() {
			super();
			// We are explicit about our defaults for Strings
			this.setBusinessName(NOT_AVAILABLE);
			this.setaBN("00 000 000 000");
			setCapitalImprovedRate(CIV_RATE);

		}
		
		public String getBusinessName() {
			return businessName;
		}
		
		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}
		
		public String getaBN() {
			return aBN;
		}
		
		public void setaBN(String aBN) {
			this.aBN = aBN;
		}
		
		@Override
		public double calculateExtraServices() {
			return wasteManagement.calculateChargeForServiceType() +
					fireServicesLevy.calculateChargeForServiceType();
		}
		
		@Override
		public String toString() {
			return super.toString() + this.getClass().getSimpleName() + "[\n" + wasteManagement.toString() + "\n" + fireServicesLevy.toString() + "]\n";
		}
	}



