package lab1.task5

case class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
  def directorsAge: Int = yearOfRelease-director.yearOfBirth;
  def isDirectedBy(dir: Director): Boolean = director == dir;
}
