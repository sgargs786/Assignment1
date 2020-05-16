package domain;

/**
 * @author sahil
 * @version 1.0
 * @created 02-Apr-2020 8:30:00am
 */
public class SchoolCommunity {

private String specialDescription;
private static final double CIV_RATE = 0.0030;
private static final double FIRE_SERVICES_BASE = 150;
private static final double FIRE_SERVICES_PERCENT = 0.00006;
private ServiceType fireServicesLevy;

public SchoolCommunity() {
super();
this.setSpecialDescription("None");
setCapitalImprovedRate(CIV_RATE);
}

private void setCapitalImprovedRate(double civRate) {

}

public String getSpecialDescription() {
return specialDescription;
}

public void setSpecialDescription(String specialDescription) {
this.specialDescription = specialDescription;
}

public void setUpExtraServices() {
fireServicesLevy = new BaseAndPercentageOfValueService("Fire Levy",
FIRE_SERVICES_BASE,
FIRE_SERVICES_PERCENT,
getCapitalImprovedValue());

}

private double getCapitalImprovedValue() {
return 0;
}

public double calculateExtraServices() {
return fireServicesLevy.calculateChargeForServiceType();
}

@Override
public String toString() {
return super.toString() + "SchoolCommunity [\n" +
 fireServicesLevy.toString() + "]\n "; 
}

}
