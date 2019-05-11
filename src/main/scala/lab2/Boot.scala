package lab2

object Boot extends App{
  val memento = new Film("Memento", 2000, 8.5)
  val darkKnight = new Film("Dark Knight", 2008, 9.0)
  val inception = new Film("Inception", 2010, 8.8)
  val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7)
  val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9)
  val unforgiven = new Film("Unforgiven", 1992, 8.3)
  val granTorino = new Film("Gran Torino", 2008, 8.2)
  val invictus = new Film("Invictus", 2009, 7.4)
  val predator = new Film("Predator", 1987, 7.9)
  val dieHard = new Film("Die Hard", 1988, 8.3)
  val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6)
  val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8)
  val eastwood = new Director("Clint", "Eastwood", 1930,
    Seq(highPlainsDrifter, outlawJoseyWales, unforgiven, granTorino, invictus))
  val mcTiernan = new Director("John", "McTiernan", 1951,
    Seq(predator, dieHard, huntForRedOctober, thomasCrownAffair))
  val nolan = new Director("Christopher", "Nolan", 1970,
    Seq(memento, darkKnight, inception))
  val someGuy = new Director("Just", "Some Guy", 1990,
    Seq())
  val directors = Seq(eastwood, mcTiernan, nolan, someGuy)

  def task1(seq: Seq[Director], numberOfFilms: Int):  Seq[Director] ={
    println("task1")
//    seq.filter(x => x.films.size > numberOfFilms).foreach(println(_))
//    println()
    seq.filter(x => x.films.size > numberOfFilms)
  }

  task1(directors, 4).foreach(println(_))

  def task2(seq: Seq[Director], year: Int): Seq[Director] ={
    println("task2")
//    seq.filter(p=> p.yearOfBirth < year).foreach(println(_))
//    println()
    seq.filter(p=> p.yearOfBirth < year)
  }

  task2(directors, 1990).foreach(println(_))

  def task3Alt(y: Int, nf: Int) = task2(task1(directors, nf), y)

  def task3(seq: Seq[Director], year: Int, numberOfFilms: Int)(nof : (Seq[Director], Int) => Seq[Director])(y : (Seq[Director], Int) => Seq[Director]): Seq[Director] ={
    println("task3")
    nof(seq, numberOfFilms).intersect(y(seq, year))
  }
//task1(directors, 4)
  //task2(directors, 1990)
  task3(directors, 1990, 4)(task1)(task2).foreach(println(_))


  def task4(seq: Seq[Director], ascending: Int = 1): Seq[Director] = ascending match {
    case 1 => seq.sortWith(_.yearOfBirth < _.yearOfBirth)
    case 0 => seq.sortWith(_.yearOfBirth > _.yearOfBirth)
  }
  println("---------task4---------")
  println("-----------asc----------")
  task4(directors).foreach(println(_))

  println("-----------desc----------")
  task4(directors, 0).foreach(println(_))


  println("---------task5---------")
  nolan.films.foreach(x=>print(s"${x.name}, "))

  println()
  println("---------task6---------")
  println(directors.flatMap(x => x.films).foreach(x => print(s"${x.name}, ")))

  println()
  println("---------task7---------")
  mcTiernan.films.sortWith(_.yearOfRelease < _.yearOfRelease).foreach(x=> print(s"${x.name} "))
  println()
  println(mcTiernan.films.sortWith(_.yearOfRelease < _.yearOfRelease)(0).name)


  println()
  println("---------task8---------")
  directors.flatMap(x => x.films).sortWith(_.imdbRating > _.imdbRating).foreach(x => print(s"${x.name} ${x.imdbRating}\n"))


  println()
  println("---------task9---------")
  println(directors.flatMap(x => x.films).map(_.imdbRating).sum/directors.flatMap(x => x.films).size)


  println()
  println("---------task10---------")


  // initial acc = 0

  //directors.flatMap(x => Seq(x.films, x.firstName)).foreach(x => println(x))

  println()
  directors.foreach(x => for (y <- x.films){
    println(s"Tonight only! ${y.name} by ${x.firstName}!")
  })



  println()
  println("---------task11---------")
//
//  directors.flatMap(x => x.films).sortWith(_.yearOfRelease < _.yearOfRelease).foreach(x => println(x))
  println(directors.flatMap(x => x.films).sortWith(_.yearOfRelease < _.yearOfRelease)(0).name)
}
