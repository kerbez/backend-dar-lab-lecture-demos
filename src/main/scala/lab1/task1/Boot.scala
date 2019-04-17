package lab1.task1

object Boot extends App {
//  val Cat1 = new Cat("Oswald", "Black", "Milk");
//  val Cat2 = new Cat("Henderson", "Ginger", "Chips");
//  val Cat3 = new Cat("Quentin", "Tabby and white", "Curry");
//  println(Cat1)
//  println(Cat2)
//  println(Cat3)

//  Task2
//
  val eastwood = new Director("Clint","Eastwood", 1930)
  val mcTiernan = new Director("John","McTiernan", 1951)
  val nolan = new Director("Christopher","Nolan", 1970)
  val someBody = new Director("Just","SomeBody", 1990)
  val memento = new Film("Memento", 2000, 8.5, nolan)
  val darkKnight = new Film("DarkKnight", 2008, 9.0, nolan)
  val inception = new Film("Inception", 2010, 8.8, nolan)
  val highPlainsDrifter  = new Film("HighPlainsDrifter", 1973, 7.7, eastwood)
  val outlawJoseyWales   = new Film("TheOutlawJoseyWales", 1976, 7.9, eastwood)
  val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
  val granTorino = new Film("GranTorino", 2008, 8.2, eastwood)
  val invictus = new Film("Invictus", 2009, 7.4, eastwood)
  val predator = new Film("Predator", 1987, 7.9, mcTiernan)
  val dieHard = new Film("DieHard", 1988, 8.3, mcTiernan)
  val huntForRedOctober = new Film("TheHuntforRedOctober", 1990, 7.6, mcTiernan)
  val thomasCrownAffair = new Film("TheThomasCrownAffair", 1999, 6.8, mcTiernan)

  println(eastwood.yearOfBirth) //should be 1930
  println(dieHard.director.name) //should be "JohnMcTiernan"
  println(invictus.isDirectedBy(nolan)) // should be false

  println(invictus.isDirectedBy(eastwood))
 // highPlainsDrifter.clone()
  val f1 = highPlainsDrifter.copy(name1 ="L'hommedeshautesplaines") // returns Film("L'hommedeshautesplaines",1973,7.7,/*etc*/)
  val f2 = thomasCrownAffair.copy(yearOfRelease1 = 1968,director1 = new Director("Norman","Jewison", 1926)) // returnsFilm("TheThomasCrownAffair",1926,/*etc*/)
  val f3 = inception.copy().copy().copy()

  println(f1.name + " "  + f1.yearOfRelease +  " " + f1.imdbRating  + f1.director)
  println(f2.name + " "  + f2.yearOfRelease +  " " + f2.imdbRating  + f2.director)
  println(f3.name + " "  + f3.yearOfRelease +  " " + f3.imdbRating  + f3.director)
//


//  Task3
//
//  println(new Counter(10).inc.dec.inc.inc.count)

//  println(new Counter(10).inc(2).dec(3).inc().inc().count)

//
//  Task4
}
