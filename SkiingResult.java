class SkiingResult implements IEvent {
	 double time;
	 int position;
	 ShootingResult aResult;
	
	SkiingResult(double time, int position, ShootingResult aResult){
		this.time = time;
		this.position = position;
		this.aResult = aResult;
	}
	
	//takes a ShootingResult as an input and adds 20 seconds for each target (out of five) missed in each round. 
	public double addShootingPenalties(ShootingResult aResult){
		return (this.time + (20 * (20 - aResult.pointsEarned())));
	}
	
	@Override
	// sets the time equal to a new time which takes into account penalties, and then edits the time based on which position the athlete came in for skiing
	public double pointsEarned() {
		double time = this.addShootingPenalties(this.aResult);
		if(position == 1) {
			time = time-10;
		}
		if(position == 2) {
			time = time-7;
		}
		if(position == 3) {
			time = time-3;
		}
		
		return time;
	}

}
