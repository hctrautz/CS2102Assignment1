# CS2102Assignment1
Create the initial software to record athletesâ€™ results in these events and to provide methods that do some basic performance comparisons between individual athletes. 

1. Create an Athlete class with two fields: one holds a ShootingResult object and the other holds a SkiingResult object.

2. The ShootingResult class holds four separate ShootingRound objects, one for each of four rounds (e.g., round1, round2, round3, and round4). Each ShootingRound stores the number of targets hit (out of five). Use int for this value. Assume that only valid numbers of targets hit will be created; you do not need to do any error checking at this point in the course.

3. The SkiingResult class holds the time (in seconds) at which the athlete crossed the finish line in the cross-country race, the athleteâ€™s position in the finishing order (1 for first, 2 for second, etc), and the athlete's ShootingResult. Use a double for the time and an int for the position.

4. Each of ShootingResult and SkiingResult should implement an IEvent interface. This interface should require a method called pointsEarned which takes no additional inputs and returns a double representating an athleteâ€™s score on that event.

  The points earned for a ShootingResult is the sum of the targets hit for each round.
  
  For most athletes, the points earned for a SkiingResult is the finishing time modified by the number of shots missed in each   shooting round (see the next step regarding the addShootingPenalties method). Then, the points for the first place finisher   takes 10 seconds off this modified finishing time. Similarly, the second-place finisher gets 7 points off, and the third-     place finisher gets 3 points off. All other finishers have just their modified finishing time as the points.
  
5. In the SkiingResult class, include a method called addShootingPenalties. This method should take a ShootingResult as an input and add 20 seconds for each target (out of five) missed in each round. It should return the modified time as a double.

6. In the Athlete class, include a betterSkiier method that takes another Athlete as input and produces the athlete with the better (lower) Skiier score. Assume there are no ties (meaning we wonâ€™t test for ties and neither should you, as the behavior in event of a tie is not specified).

7. In the Athlete class, include a hasBeaten method that takes another Athlete as input and returns a boolean indicating whether the athlete has either a higher Shooting score or a lower skiing score than the given (input) Athlete.

8. Create a test suite for your work. Put all of your tests and test data in a class called Examples.
