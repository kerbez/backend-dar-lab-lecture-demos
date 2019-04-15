package lab1.task1

class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
  def directorsAge: Int = yearOfRelease-director.getYearOfBirth;
  def isDirectedBy(dir: Director): Boolean = director == dir;
  def copy(name1: String = name, yearOfRelease1: Int = yearOfRelease, imdbRating1: Double = imdbRating, director1: Director = director): Film =
    new Film(name1, yearOfRelease1, imdbRating1, director1)
}
