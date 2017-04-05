package uber_billing_schemes;

public class TripDetails {
	
	int durationInMinutes;
	
	int totalTripDistance;
	
	public TripDetails(int duration,int totalDistance){
		this.durationInMinutes=duration;
		this.totalTripDistance=totalDistance;
	}
	
	//Other fields, date/time.

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public int getTotalTripDistance() {
		return totalTripDistance;
	}

	public void setTotalTripDistance(int totalTripDistance) {
		this.totalTripDistance = totalTripDistance;
	}
	
	

}
