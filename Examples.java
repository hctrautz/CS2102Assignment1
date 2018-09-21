import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {
public Examples(){}

ShootingRound five = new ShootingRound(5);
ShootingRound four = new ShootingRound(4);
ShootingRound three = new ShootingRound(3);
ShootingRound two = new ShootingRound(2);
ShootingRound one = new ShootingRound(1);

ShootingResult Good = new ShootingResult(five, four, four, three);
ShootingResult Bad = new ShootingResult (two, two, three, one);

SkiingResult Pizza = new SkiingResult (50.0, 3, Good);
SkiingResult Fries = new SkiingResult (30.0, 1, Good);
SkiingResult Pries = new SkiingResult (40.0, 2, Good);
SkiingResult Help = new SkiingResult (100.0, 8, Good);

Athlete Joe = new Athlete (Good, Fries);
Athlete Bob = new Athlete (Bad, Pizza);
Athlete Sam = new Athlete (Bad, Fries);
Athlete Ken = new Athlete (Good, Pizza);

//make sure the sum is correct
@Test
public void shootingresulttest() {
	assertEquals(16, Good.pointsEarned(), .1);
}

//checking sum again
@Test
public void shootingresulttest2() {
	assertEquals(8, Bad.pointsEarned(), .1);
}

//makes sure the method produces true if the activating athlete is better on both skiing and shooting results
@Test
public void hasbeatentest() {
	assertEquals(Joe.hasBeaten(Bob), true);
}

//makes sure the method produces true if the activating athlete is better at skiing but not shooting results
@Test
public void hasbeatentest2() {
	assertEquals(Sam.hasBeaten(Ken), true);
}

//makes sure the method produces true if the activating athlete is better at shooting but not skiing results
@Test
public void hasbeatentest3() {
	assertEquals(Ken.hasBeaten(Sam), true);
}

//makes sure the method produces false if the activating athlete is worse at shooting and skiing results
@Test
public void hasbeatentest4() {
	assertEquals(Bob.hasBeaten(Ken), false);
}

//Tests to make sure the method produces the better skier if the better skier is the activating object
@Test
public void betterskiiertest() {
	assertEquals(Bob.betterSkiier(Joe), Joe);
}

//Tests to make sure the method produces the better skier if the better skier is not the activating object
@Test
public void betterskiiertest2() {
	assertEquals(Joe.betterSkiier(Bob), Joe);
}

//tests to make sure the calculations are done correctly 
@Test
public void addpenaltiestest() {
	assertEquals(Fries.addShootingPenalties(Good), 110, .1);
}

//tests first place
@Test
public void pointsearnedski() {
	assertEquals(Fries.pointsEarned(), 100, .1); 
}

//tests second place
@Test
public void pointsearnedski3() {
	assertEquals(Pries.pointsEarned(), 113, .1); 
}

//tests third place
@Test
public void pointsearnedski2() {
	assertEquals(Pizza.pointsEarned(), 127, .1); 
}

//tests anything thats not 1st, 2nd, and 3rd place
@Test
public void pointsearnedski4() {
	assertEquals(Help.pointsEarned(), 180, .1); 
}

}
