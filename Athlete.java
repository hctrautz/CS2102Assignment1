class Athlete {
	
	ShootingResult shootres;
	SkiingResult skiires;
	
	Athlete (ShootingResult shootres, SkiingResult skiires){
		this.shootres = shootres;
		this.skiires = skiires;
	}
	
	//consumes an athlete and compares it to the other athlete, producing which athlete has a lower skiing score
	Athlete betterSkiier(Athlete aAth) {
		if(this.skiires.pointsEarned() < aAth.skiires.pointsEarned()) {
			return this;
		} else {
			return aAth;
		}
	}
	
	//produces true if (this) athlete has either a lower skiing score than the other athlete, or a higher shooting score than the other athlete
	boolean hasBeaten (Athlete anothAth) {
		return (this.skiires.pointsEarned() < anothAth.skiires.pointsEarned() || 
				this.shootres.pointsEarned() > anothAth.shootres.pointsEarned());
	}

		
	}

