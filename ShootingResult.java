class ShootingResult implements IEvent {
	
	ShootingRound round1;
	ShootingRound round2;
	ShootingRound round3;
	ShootingRound round4;
	
ShootingResult (ShootingRound round1, ShootingRound round2,ShootingRound round3, ShootingRound round4){
	this.round1 = round1;
	this.round2 = round2;
	this.round3 = round3;
	this.round4 = round4;
}

@Override
//sums the values of each shooting round
public double pointsEarned() {
	return (this.round1.targhit + this.round2.targhit + this.round3.targhit + this.round4.targhit);
}

}
